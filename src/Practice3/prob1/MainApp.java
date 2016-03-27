package practice3.prob1;

public class MainApp {
    public static void main(String args[]) {
        int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] % 3 == 0) {
                cnt++;
                sum += data[i];
            }
        }
        System.out.println("3배수 개수: " + cnt);
        System.out.println("3배수 합: " + sum);
    }
}