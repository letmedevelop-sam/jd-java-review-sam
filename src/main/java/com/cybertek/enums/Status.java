package com.cybertek.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {

    OPEN("Open"), IN_PROGRESS("In Progress"), UAT_TEST("UAT Testing"), COMPLETED("Completed");
    /*
    If you use some values in paranthesis you need to assign these values:
    1. Same Statement
    2. Constructor
    3. Use Static block
     */

   private final String value;

/*

// you can use @AllArgsConstructor or create it by yourself
   Status(String value){
       this.value=value;
   }

 */


}
