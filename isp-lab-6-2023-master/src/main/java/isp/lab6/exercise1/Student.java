package isp.lab6.exercise1;
import java.util.HashMap;

public class Student {
    private String name;
    private String  departament;
    private HashMap<String, Double> grades=new HashMap<>();
    public Student(String name, String departament) {
        this.name = name;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }
    public HashMap<String, Double> getGrades() {
        return grades;
    }
    public int addGrade(String clas, double grade){
        grades.put(clas,grade);
        return 0;
    }

    public double Average(){
        int[] grades=new int[7];
        float total,avg;
        Student student=new Student("Marian","Automatica");
    String clas= String.valueOf(getClass());

        for(int i=0;i<7;i++){
           grades[i]=student.addGrade(clas,6);
        }
        return 0;
    }

        @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", departament='" + departament + '\'' +
                '}';
    }

}
