package practice2.prob5;

import java.util.Scanner;

 public class CalcApp {
    public static void main(String args[]) {
        /* 입력 예시 2 + 5
         * 결과 5 */

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print(">> ");
            String input = sc.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String str[] = input.split(" ");
            int x = Integer.parseInt(str[0]);
            String operand = str[1];
            int y = Integer.parseInt(str[2]);

            if (operand.equals("+")) {
                Arith a = new Add();
                a.setValue(x, y);
                System.out.println(a.calculate());
            }
            else if (operand.equals("-")) {
                Arith s = new Sub();
                s.setValue(x, y);
                System.out.println(s.calculate());
            }
            else if (operand.equals("/")) {
                Arith d = new Div();
                d.setValue(x, y);
                System.out.println(d.calculate());
            }
            else if (operand.equals("*")) {
                Arith m = new Mul();
                m.setValue(x, y);
                System.out.println(m.calculate());
            }
            else {
                System.out.println("제대로 입력하렴");
            }
        }
    }
}
