package com.cybertek.lambda.sorting;

import com.cybertek.oop.encapsulation.Role;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Employee {
    private Integer employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeCity;
    private Role role;


}
