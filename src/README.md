**PERSON ROLE SYSTEM**

-This is a java application that identifies different types of people and thier role in school such as students and teachers using Object-Oriented
programing concepts such us:

-classses and objects
-encapsulation
-inheritance
-polymorpism

## Features
**-Identify different person roles in school**

**-Store student and techer information**

**-demonstrate oop cocepts**

**-use runtime polymorpism**
## OOP concepts

### 1.classes and objects:

*class:person,student,teacher

*object:In Main.java like stud1&teach1

### 2.Encapsulation

*private fields are used like:

private name,age,course...

*getters and setters are implemented

### 3.Inheritance

Hierarchical inheriatance is used the class student and teacher inherited from the parent class person.

### 4.Polymorphism

##### *Method overriding:

dispalyRole() is overridden in Student.java&Teacher.java

##### *Method overloading:
student class contains
-study()&study(int hours)

##### *Runtime polymorphism

Superclass references are used:ArrayList (Person) people

### compile and run

compile:javac person_role_system/.java

run:java person_role_system.Main
