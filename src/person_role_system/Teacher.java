package person_role_system;
public class Teacher extends Person {
    private String subject;
    private double salary;
    public Teacher(String name,int age,String gender,String subject,double salary){
        super(name,age,gender);
        this.subject=subject;
        this.salary=salary;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

    public void dispalyrole() {
        System.out.println("subject:"+subject);
        System.out.println("Salary:"+salary);
        System.out.println(getName()+"is a teacher.");
    }
    public void teach(){
        System.out.println(getName()+" is teaching.");
    }
}

