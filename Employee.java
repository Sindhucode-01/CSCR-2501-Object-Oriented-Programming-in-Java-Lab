class Employee {

    int id;
    String name;
    double salary;

    void setDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.setDetails(101, "Rahul", 50000);

        System.out.println("----- Employee Details -----");
        e1.displayDetails();
    }
}
