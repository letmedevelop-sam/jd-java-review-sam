package com.cybertek.streams.exercises;

import com.cybertek.enums.Gender;
import com.cybertek.enums.Status;
import com.cybertek.oop.encapsulation.User;
import com.cybertek.oop.inheritance.Project;

import java.time.Period;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamDemo {


    //Task01 - Bring list of all existing projects
    public static List<Project> getListOfProject(){

        List<Project> listOfProjects = DataGenerator.getProjects();
        return listOfProjects;
    }

    //Task02 - Choose a specific Project Status and Bring list of all projects under that Status
    public static List<Project> getListOfProject(Status status){

        List<Project> listOfProjects = DataGenerator.getProjects();
        return listOfProjects.stream().filter(st -> st.getProjectStatus().equals(status)).collect(Collectors.toList());
    }

    //Task03  - Choose a specific Manager and Bring list of all projects managed by that Manager
    public static List<Project> getListOfProject(User manager){

        List<Project> listOfProjects = DataGenerator.getProjects();
        return listOfProjects.stream().filter(mn -> mn.getAssignedManager().equals(manager)).collect(Collectors.toList());
    }

    //Task04 - Choose a specific Project Code and Bring list of all projects under that Project Code
    public static List<Project> getProjectByProjectCode(String projectCode){

        List<Project> listOfProjects = DataGenerator.getProjects();
        return listOfProjects.stream().filter(pc -> pc.getProjectCode().equals(projectCode)).collect(Collectors.toList());
    }

    //Task05 - Bring list of all users
    public static List<User> getListUsers(){
        List<User> listOfUsers = DataGenerator.getUsers();
        return listOfUsers;
    }

    //Task06 - Choose a specific First Name from users and Bring list of all users with that First Name
    public static User getUserByFirstName(String firstName){

        List<User> listOfUsers = DataGenerator.getUsers();
        return listOfUsers.stream().filter(fn -> fn.getFirstName().equals(firstName)).findFirst().get();
    }

    //Task07 - Choose a specific user Id from users and Bring list of all users with that user Id
    public static User getUserByUserId(Long id){
        List<User> listOfUsers = DataGenerator.getUsers();
        return (User) listOfUsers.stream().filter(uid -> new Long(uid.getId()).equals(id));
    }


    //Task08 - Choose a specific First Name from users and delete that users, return rest of the users");
    public static List<User> deleteUser(String firstName){

        List<User> listOfUsers = DataGenerator.getUsers();
        return listOfUsers.stream().filter(fn -> !fn.getFirstName().equals(firstName)).collect(Collectors.toList());

    }


    //Task09 - Choose a specific status from projects and update status of that project
    public static List<Project> updateProjectStatus(Status oldStatus,Status newStatus){

        List<Project> listOfProjects = DataGenerator.getProjects();
        listOfProjects.stream().filter(st -> st.getProjectStatus().equals(oldStatus)).forEach(e -> e.setProjectStatus(newStatus));
        return listOfProjects;
    }


    //Task10 - Choose a specific manager from projects and return that project
    /*
    public static List<Project> findProjectByManager(User manager){

    }
    */

    //Task11 - Choose a specific manager from projects and return the period he managed that project
    public static Integer totalProjectDurationForManager(User manager){

        List<Project> listOfProjects = DataGenerator.getProjects();
        Project p = listOfProjects.stream().filter(mn -> mn.getAssignedManager().equals(manager)).findFirst().get();
//        long diffInMillies = Math.abs(p.getEndDate() - p.getStartDate());
//        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        Period period = Period.between(p.getStartDate(), p.getEndDate());
        return (int) (long) period.getDays();

    }

    //Task12 - Filter the genders of users and get the number of Male users
    public static long findTotalMaleInCompany(){

        List<User> listOfUsers = DataGenerator.getUsers();
        return (long)listOfUsers.stream().filter(ml -> ml.getGender().equals(Gender.MALE)).count();
    }


}
