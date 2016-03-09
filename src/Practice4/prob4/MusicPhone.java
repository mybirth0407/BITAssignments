package Practice4.prob4;

public class MusicPhone extends Phone {
    public void execute(String function) {
        if (function.equals("음악")) {
            playMusic();
            return;
        }
        super.execute(function);
    }

    private void playMusic() {
        System.out.println("mp3 플레이어에서 음악 재생");
    }
}
