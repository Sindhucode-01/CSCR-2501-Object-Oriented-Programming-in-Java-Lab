public class CommandLineSum {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please provide at least two numbers.");
            return;
        }

        int sum = 0;

        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }

        System.out.println("Sum = " + sum);
    }
}
