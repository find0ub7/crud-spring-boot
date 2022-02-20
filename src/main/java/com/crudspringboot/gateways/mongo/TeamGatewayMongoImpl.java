package com.crudspringboot.gateways.mongo;

import com.crudspringboot.domains.Team;
import com.crudspringboot.gateways.TeamGateway;
import com.crudspringboot.gateways.mongo.documents.TeamDoc;
import com.crudspringboot.gateways.mongo.repositories.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TeamGatewayMongoImpl implements TeamGateway {

    private final TeamRepository teamRepository;

    @Override
    public Team save(Team team) {
        return teamRepository.save(new TeamDoc(team)).toDomain();
    }

    @Override
    public boolean existsByName(String name) {
        return teamRepository.existsByName(name);
    }
}
