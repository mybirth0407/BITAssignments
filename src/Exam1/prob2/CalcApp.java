package Exam1.prob2;

import java.util.Scanner;
    
public class CalcApp {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print(">> ");
            String input = sc.nextLine();

            if (input.equals("quit")) {
                break;
            }

            if (CalcApp(input) == false) {
                System.out.println("계산하지 못했음");
            }
        }
    }

    public static boolean CalcApp(String input) {
        if (input == null) {
            return false;
        }

        String str[] = input.split(" ");
        double x = Integer.parseInt(str[0]);
        String operand = str[1];
        double y = Integer.parseInt(str[2]);

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
            double result = d.calculate();
            if (result == (double)0) {
                System.out.println("can't divide to 0");
                return false;
            }
            System.out.println(result);
        }
        else if (operand.equals("*")) {
            Arith m = new Mul();
            m.setValue(x, y);
            System.out.println(m.calculate());
        }
        else {
            System.out.println("제대로 입력");
        }
        return true;
    }
}
