package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine();

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt();

            if (name == "종료") {
                break;
            }

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
