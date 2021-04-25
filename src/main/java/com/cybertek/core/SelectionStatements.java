package com.cybertek.core;

public class SelectionStatements {

    public static void demoIfStatement(){

        String userName = "Sam";
        if(userName.equals("Sam")){     //equals come from object class
            System.out.println("PASS");
        }else if(userName.equals("Mike")){
            System.out.println("FAIL");
        }else {
            System.out.println("Not Valid");
        }
    }

    public static void demoSwitchCaseStatement(){
        String userName = "Mikee";
        switch (userName){
            case  "Sam":
                System.out.println("PASS");
                break;
            case  "Mike":
                System.out.println("FAIL");
                break;
            default:
                System.out.println("Not Valid");
                break;

        }
    }

}
