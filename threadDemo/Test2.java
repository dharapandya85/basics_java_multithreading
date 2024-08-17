package com.engineeringdigest.corejava.threadDemo;

public class Test2 {
    public static void main(String[] args) {
        Student engineeringStudent = new Student()
        {
            //EngineeringStudent engineeringStudent = new EngineeringStudent();
            @Override
            public String getBio(String name) {
            return name + "is Engineering student";
        }
        };

        Student lawStudent= name->{return name =" is law student";};
        String bio = engineeringStudent.getBio("Ram");
        System.out.println(bio);
    }
}
