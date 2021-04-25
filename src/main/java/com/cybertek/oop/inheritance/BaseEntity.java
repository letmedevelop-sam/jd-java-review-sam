package com.cybertek.oop.inheritance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

//  abstract class can do anything a normal class do except create an object
//  we will use this class to extend some other classes
//  We will use super keyword to invoke constructor from abstract class
//  lombok does not create parent class constructor, we create it manually by using super keyword

public abstract class BaseEntity {
    private long id;
    private LocalDateTime insertDateTime;
    private long insertUserId;
    private LocalDateTime lastUpdateDateTime;
    private long lastUpdateUserId;


}
