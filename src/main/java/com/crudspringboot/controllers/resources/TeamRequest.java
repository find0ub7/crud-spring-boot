package com.crudspringboot.controllers.resources;

import com.crudspringboot.domains.Team;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class TeamRequest {
    @NotBlank
    private String name;
    @Size(min = 1)
    private List<String> members;

    public Team toDomain() {
        return Team.builder()
                .name(name)
                .members(members)
                .build();
    }
}
