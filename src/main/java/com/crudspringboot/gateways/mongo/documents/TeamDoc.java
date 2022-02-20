package com.crudspringboot.gateways.mongo.documents;

import com.crudspringboot.domains.Team;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("teams")
public class TeamDoc {
    @Id
    private String id;
    private String name;
    private List<String> members;

    public TeamDoc(Team team) {
        id = team.getId();
        name = team.getName();
        members = team.getMembers();
    }

    public Team toDomain() {
        return Team.builder()
                .id(id)
                .name(name)
                .members(members)
                .build();
    }
}
