public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Original String: " + sb);

        sb.append(" Programming");
        System.out.println("After append: " + sb);

        sb.insert(5, "Object Oriented ");
        System.out.println("After insert: " + sb);

        sb.replace(5, 21, "OOP");
        System.out.println("After replace: " + sb);

        sb.delete(5, 9);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
