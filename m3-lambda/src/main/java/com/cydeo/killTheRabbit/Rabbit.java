package com.cydeo.killTheRabbit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Rabbit {


    private String name;
    private int weight;
    private EyesColor eyeColor;
}
