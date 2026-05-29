package person_role_system;

public class Student extends Person {
    private String course;
    private double gpa;
    public Student(String name,int age,String gender,String course,double gpa){
        super(name,age,gender);
        this.course =course;
        this.gpa=gpa;
    }
    public void setCourse(String course){
        this.course =course;
    }

    public String getCourse() {
        return course;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void dispalyrole() {
        System.out.println(getName()+" is a student.");
        System.out.println("course:"+course);
        System.out.println("GPA:"+gpa);
    }
    public void study(){
        System.out.println(getName()+"is studying");
    }
    public void study(int hours){
        System.out.println(getName()+" studies for "+hours+"hours.");
    }
}


