package assigment1;

public class MP3Player implements AudioPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file. Name:" + fileName);
        } else {
            System.out.println("Invalid media, only MP3 file format supported.");
        }
    }
}