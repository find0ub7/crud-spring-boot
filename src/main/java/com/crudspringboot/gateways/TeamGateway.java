package com.crudspringboot.gateways;

import com.crudspringboot.domains.Team;

public interface TeamGateway {
    Team save(Team team);

    boolean existsByName(String name);
}
