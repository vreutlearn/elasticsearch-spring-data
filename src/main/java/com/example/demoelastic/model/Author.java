package com.example.demoelastic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    private String name;

    @Override
    public String toString() {
        return "Author{" + "name='" + name + '\'' + '}';
    }
}
