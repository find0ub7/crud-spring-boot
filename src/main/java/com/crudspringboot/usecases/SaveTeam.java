package com.crudspringboot.usecases;

import com.crudspringboot.domains.Team;
import com.crudspringboot.gateways.TeamGateway;
import com.crudspringboot.usecases.validators.SaveTeamValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveTeam {

    private final SaveTeamValidator saveTeamValidator;
    private final TeamGateway teamGateway;

    public Team execute(Team team) {
        saveTeamValidator.validate(team);
        return teamGateway.save(team);
    }
}
