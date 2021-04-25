package com.cybertek.oop.inheritance;

import com.cybertek.enums.Status;
import com.cybertek.oop.encapsulation.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

//from Lombok super full parameter constructor does not come

public class Project extends BaseEntity{  //DO NOT FORGET TO EXTEND

    private String projectCode;
    private String projectName;
    private User assignedManager;   //Manager will come from User + Manager will come from Role class
    private LocalDate startDate;
    private LocalDate endDate;
    private Status projectStatus;
    private String projectDetail;

    //when I create constructor from .. use super keyword
    //Even BaseENtity is abstract we can call this constructor with super keyword


    public Project(long id, LocalDateTime insertDateTime, long insertUserId, LocalDateTime lastUpdateDateTime,
                   long lastUpdateUserId, String projectCode, String projectName, User assignedManager,
                   LocalDate startDate, LocalDate endDate, Status projectStatus, String projectDetail) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.assignedManager = assignedManager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectStatus = projectStatus;
        this.projectDetail = projectDetail;
    }
}
