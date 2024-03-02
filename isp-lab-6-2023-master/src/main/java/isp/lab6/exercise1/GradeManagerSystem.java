package isp.lab6.exercise1;

import java.util.ArrayList;

public class GradeManagerSystem {
    private ArrayList<Student> list= new ArrayList<>();
    public void addStudent(Student s){
        list.add(s);
    }
    void printAll(){
        for (Student s:list)
            System.out.println(s);
    }
    public Student SearchByName(String name){
        for(Student s:list)
            if(s.getName().equals(name))
                return s;
        return null;
    }

    }

