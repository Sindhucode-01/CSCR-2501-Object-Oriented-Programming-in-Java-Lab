class Student {

    int rollNo;
    String name;
    double marks;

    // Default constructor
    Student() {
        rollNo = 0;
        name = "Unknown";
        marks = 0.0;
    }

    // Parameterized constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = 0.0;
    }

    // Constructor overloading
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

public class ConstructorDemo {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(101, "Rahul");
        Student s3 = new Student(102, "Aman", 89.5);

        s1.display();
        s2.display();
        s3.display();
    }
}
