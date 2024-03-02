package isp.lab6.exercise1;

public class  Exercise1 {
    public static void main(String[] args) {
        Student student=new Student("Marian","Automatica");
        String s=student.toString();
        System.out.println(s);
        GradeManagerSystem studentii=new GradeManagerSystem();
        studentii.addStudent(student);
        studentii.printAll();
    }
}
