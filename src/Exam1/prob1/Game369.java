package Exam1.prob1;

public class Game369 {
    public static void main(String args[]) {
        Game369(99);
        return;
    }

    public static void Game369(int n) {
        for (int i = 1; i < n + 1; i++) {
            int temp = i;
            int clap = 0;

            if ((temp / 10) == 3 ||
                (temp / 10) == 6 ||
                (temp / 10) == 9) {
                clap++;
            }
            temp %= 10;

            if (temp == 3 ||
                temp == 6 ||
                temp == 9) {
                clap++;
            }

            if (clap != 0) {
                System.out.print(i + " ");

                for (int j = 0; j < clap; j++) {
                    System.out.print("짝");
                }
                System.out.println("");
            }
        }
    }
}