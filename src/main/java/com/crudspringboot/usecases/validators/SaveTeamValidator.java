package com.crudspringboot.usecases.validators;

import com.crudspringboot.domains.Team;
import com.crudspringboot.exceptions.BusinessException;
import com.crudspringboot.gateways.TeamGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SaveTeamValidator {

    private final TeamGateway teamGateway;

    public void validate(Team team) {
        if (team.isNew()) {
            if (teamGateway.existsByName(team.getName())) {
                throw new BusinessException("Time existente: " + team.getName());
            }
        }
    }
}
