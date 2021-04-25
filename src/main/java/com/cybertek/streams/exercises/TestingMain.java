package com.cybertek.streams.exercises;

import com.cybertek.enums.Status;

public class TestingMain {

    public static void main(String[] args) {
        System.out.println("Task-1 : Bring first project's name from list of all existing projects");
        System.out.println(StreamDemo.getListOfProject().stream().findFirst().get().getProjectName());

        System.out.println("Task-2 : Choose a specific Project Status and Bring the name of project with that Status");
        System.out.println(StreamDemo.getListOfProject(Status.OPEN).get(0).getProjectName());

        System.out.println("Task-3 : Choose a specific Manager and Bring the name of project managed by that Manager");
        System.out.println(StreamDemo.getListOfProject(DataGenerator.manager4).get(0).getProjectName());

        System.out.println("Task-4: Choose a specific Project Code and Bring he name of project under that Project Code");
        System.out.println(StreamDemo.getProjectByProjectCode("PRJ003").get(0).getProjectName());

        System.out.println("Task-6 : Choose a specific First Name from users and Bring last name of that users");
        System.out.println(StreamDemo.getUserByFirstName("Isabella").getLastName());

        System.out.println("Task-8 : Choose a specific First Name from users and delete that users");
        System.out.println(StreamDemo.deleteUser("Isabella").stream().count());

        System.out.println("Task-9 : Choose a specific status from projects and update status of that project");
        StreamDemo.updateProjectStatus(Status.IN_PROGRESS, Status.COMPLETED).forEach(e -> System.out.print(e.getProjectStatus()+ " | ") );
        System.out.println();

        System.out.println("Task-11 -Choose a specific manager from projects and return the period he managed that project");
        System.out.println(StreamDemo.totalProjectDurationForManager(DataGenerator.manager4));

        System.out.println("Task-12 - Filter the genders of users and get the number of Male users");
        System.out.println(StreamDemo.findTotalMaleInCompany());

    }

}
