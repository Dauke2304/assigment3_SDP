package assigment1;

public class MusicPlayerApp {

    private AudioPlayer audioPlayer;

    public MusicPlayerApp() {
        audioPlayer = new MP3Player();//by default there is mp3 type
    }

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            audioPlayer.play(audioType, fileName);
        } else if (audioType.equalsIgnoreCase("wav") || audioType.equalsIgnoreCase("aac")) {
            AudioAdapter adapter = new AudioAdapter(audioType);
            adapter.play(audioType, fileName);
        } else {
            System.out.println("Unsupported format: " + audioType);
        }
    }
}
