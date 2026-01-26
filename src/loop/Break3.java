package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1;  ; i++) {
            sum += 1;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
        }
    }
}
