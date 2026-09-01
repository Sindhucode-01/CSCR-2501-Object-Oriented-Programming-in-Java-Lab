class Student {

    int rollNo;
    String name;

    static String college;
    static {
        college = "Sharda University";
        System.out.println("Static block executed.");
    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Static method
    static void displayCollege() {
        System.out.println("College: " + college);
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}

public class StaticThisDemo {

    public static void main(String[] args) {

        Student.displayCollege();

        Student s1 = new Student(101, "Aman");

        System.out.println("\n----- Student Details -----");
        s1.display();
    }
}
