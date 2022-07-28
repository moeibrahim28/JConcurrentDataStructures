package org.example.singleton;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ExampleLombok {
    private int num;
    private String name;
    private long id;

    public ExampleLombok() {
        this.getName();
    }
}
