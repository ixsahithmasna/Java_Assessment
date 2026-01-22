// Class, Object & Encapsulation
// Problem Statement
// Create a class Student with:
// Private fields:
// id
// name
// marks
// Constructor to initialize values
// Getters and setters
// Method:
// isPassed() → returns true if marks ≥ 40
// Create objects of Student and display result.
// Must Use
// ✔ Class & object
// ✔ Constructor
// ✔ this keyword
// ✔ Encapsulation
// ✔ Methods


class Student{
    private int id;
    private String name;
    private int marks;
    Student(int id,String name,int marks){
        this.id = id;
        this.name = name;
        this.marks=marks;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public boolean isPassed(){
        if(marks>=40) return true;
        return false;
    }
}
public class Problem4 {
    public static void main(String[] args){
        Student s1 = new Student(1,"sahith", 91);
        Student s2 = new Student(2, "prudhvi", 95);
        Student s3 = new Student(3,"karthik",33);
        System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getMarks());
        System.out.println(s2.getId()+" "+s2.getName()+" "+s2.getMarks());
        System.out.println(s1.isPassed());
        System.out.println(s2.isPassed());
        System.out.println(s3.isPassed());
    }
}
