import assigment1.MusicPlayerApp;

public class Main {
    public static void main(String[] args) {
        MusicPlayerApp playerApp = new MusicPlayerApp();

        //MP3
        playerApp.play("mp3", "song.mp3");

        //WAV
        playerApp.play("wav", "song2.wav");

        // AAC
        playerApp.play("aac", "song3.aac");

        // Try playing unsupported format
        playerApp.play("kim", "song4.kim");
    }
}