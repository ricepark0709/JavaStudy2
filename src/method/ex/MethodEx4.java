package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        int balance = 0;

        System.out.println("---------------------------------");
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
        System.out.println("---------------------------------");

        System.out.print("선택: ");
        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();

        while (true) {
            if (menu == 1) {
                int depositMoney = scanner.nextInt();
                balance = deposit(balance, depositMoney);
            } else if (menu == 2) {
                int withdrawMoney = scanner.nextInt();
                balance = withdraw(balance, withdrawMoney);
            } else if (menu == 3) {

            } else if (menu == 4) {
                break;
            }
        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
