package practice6.prob3;

public class FindAndReplaceExample {

    public static void main(String[] args) {
        String str = "모든 프로그램은 Java 언어로 개발 될 수 있습니다.";
        /* 코드를 작성합니다 */
        String str2 = str.replace("Java", "자바");
        System.out.println(str);
        System.out.println(str2);
    }
}
