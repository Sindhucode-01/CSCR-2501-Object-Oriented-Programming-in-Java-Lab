import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("\n----- String Comparison -----");

        if (str1.equals(str2)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are different.");
        }

        String result = str1.concat(" ").concat(str2);

        System.out.println("\n----- Concatenation -----");
        System.out.println("Concatenated String: " + result);

        System.out.println("\n----- Substring -----");

        if (str1.length() >= 3) {
            System.out.println("Substring of first string: "
                    + str1.substring(0, 3));
        } else {
            System.out.println("First string must contain at least 3 characters.");
        }

        sc.close();
    }
}

