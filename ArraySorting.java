import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Ascending order
        Arrays.sort(arr);

        System.out.println("\nAscending Order:");
        System.out.println(Arrays.toString(arr));

        // Descending order
        System.out.println("\nDescending Order:");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
