package practice4.prob4;

public class SmartPhone extends MusicPhone {
    public void execute(String function) {
        if (function.equals("음악")) {
            System.out.println("다운로드 해서 음악 재생");
        }
        else if (function.equals("통화"))  {
            System.out.println("통화기능시작");

        }
        else if (function.equals("앱")) {
            System.out.println("앱실행");
        }
    }
}

