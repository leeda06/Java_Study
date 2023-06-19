package Abstract_practiceProblem;
abstract class Media{
    String title;
    String genre;
    long duration;

    abstract void play();
}
class Movie extends Media{
    @Override
    void play() {
        System.out.println("영화를 재생합니다");
    }
}

class Song extends Media{
    @Override
    void play() {
        System.out.println("노래를 재생합니다");
    }
}


public class MediaTest1 {
    public static void main(String[] args) {

    }
}
