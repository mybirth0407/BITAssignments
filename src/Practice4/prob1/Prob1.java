package Practice4.prob1;

import java.util.Scanner;

public class Prob1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i ++) {
            System.out.print("숫자를 입력하세요: ");
            int n = sc.nextInt();
            int sum = sum(n);
            System.out.println("결과 값: " + sum);
        }
        sc.close();
    }

    public static int sum(int n) {
        int sum = 0;
        if (n % 2 == 1) {
            for (int i = 1; i < n + 1; i += 2) {
                sum += i;
            }
        }
        else {
            for (int i = 2; i < n + 1; i += 2) {
                sum  += i;
            }
        }
        return sum;
    }
}
