package java230328;

interface Playable{
    void play();
    void pause();
    void stop();
}
class AudioPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("오디오를 재생합니다");
    }

    @Override
    public void pause() {
        System.out.println("오디오를 중지합니다");
    }

    @Override
    public void stop() {
        System.out.println("오디오를 재생을 멈춥니다");
    }
}

class VideoPlayer  implements Playable{
    @Override
    public void play() {
        System.out.println("영상을 재생합니다");
    }

    @Override
    public void pause() {
        System.out.println("영상을 중지합니다");
    }

    @Override
    public void stop() {
        System.out.println("영상을 재생을 멈춥니다");
    }
}

public class PlayTest {
    public static void main (String [] agrs){
        AudioPlayer audio = new AudioPlayer();
        audio.play();
        audio.pause();
        audio.stop();

        VideoPlayer video = new VideoPlayer();
        video.play();
        video.pause();
        video.stop();
    }
}
