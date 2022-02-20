package com.crudspringboot.domains;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@Builder
@ToString
public class Team {
    private String id;
    private String name;
    private List<String> members;

    public boolean isNew() {
        return id == null;
    }
}
