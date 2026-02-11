package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "Hello, world!";

        print(3, message);
        print(5, message);
        print(7, message);
    }

    public static void print(int i, String message) {
        for (int j = 0; j < i; j++) {
            System.out.println(message);
        }
    }
}
