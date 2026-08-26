import java.util.Scanner;

class User {
    String name;
    int age;

    void display() {
        System.out.println("\nUser Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class UserDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User s1 = new User();

        System.out.print("Enter your name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter your age: ");
        s1.age = sc.nextInt();

        s1.display();

        sc.close();
    }
}
