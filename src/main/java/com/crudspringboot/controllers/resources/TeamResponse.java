package com.crudspringboot.controllers.resources;

import com.crudspringboot.domains.Team;
import lombok.Data;

import java.util.List;

@Data
public class TeamResponse {
    private String id;
    private String name;
    private List<String> members;

    public TeamResponse(Team team) {
        id = team.getId();
        name = team.getName();
        members = team.getMembers();
    }
}
