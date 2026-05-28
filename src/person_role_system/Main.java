package person_role_system;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student stud1=new Student("helen",18,"female"
                ,"software engineering",3.8);
        Student stud2=new Student("abebe",20,"male",
                "computer science",3.68);
        Teacher tech1=new Teacher("mr.john",40,"male",
                "maths",10000);
        ArrayList<Person> people=new ArrayList<>();
        people.add(stud1);
        people.add(stud2);
        people.add(tech1);
        for(Person p:people){
            p.introduce();
            p.dispalyrole();
            System.out.println("----------------");
        }
        stud1.study();
        stud1.study(3);
        stud2.study();
        stud2.study(2);
        tech1.teach();
    }
}
