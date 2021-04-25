package com.cybertek.oop.encapsulation;

import com.cybertek.enums.Gender;
import com.cybertek.oop.inheritance.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class User extends BaseEntity {
    private String firstName;    //adding private made it encapsulated
    private String lastName;
    private Role role;        //composition is using a class in other class
    //private  String gender;    // if you dont use ENUMs
    private Gender gender;  // if you use enum you need to import it

    public User(long id, LocalDateTime insertDateTime, long insertUserId, LocalDateTime lastUpdateDateTime, long lastUpdateUserId, String firstName, String lastName, Role role, Gender gender) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.gender = gender;
    }

    //add no arg constructor      use alt + insert shortcut
    //add all arg constructors
    //add all getters
    //add all setters

    //these are all called BOILER PLATE code
    //instead we can use LOMBOK: add dependency to POM xml + go to plugins with double shift + add Lombok plugin
    //Under Preferences : Build, Execution, Deployment  : Compiler : Annotation Processors



/*
add them before class name line
***every class needs them DO DOT FORGET them

if you add some new variables Lombok will automatically add it to all annotations

if you have inheritance if you need parent constructor YOU WILL BRING IT MANUALLY

//from Lombok super full parameter constructor does not come ***************

GO TO role class to see example
     */
/*
    public User() {
    }

    public User(String firstName, String lastName, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Role getRole() {
        return role;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRole(Role role) {
        this.role = role;
    }

 */


}
