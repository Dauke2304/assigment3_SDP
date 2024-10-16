package assigment1;

public class AudioAdapter implements AudioPlayer {

    private AdvancedAudioPlayer advancedAudioPlayer;

    public AudioAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("wav")) {
            advancedAudioPlayer = new AdvancedAudioPlayer(); // Can handle WAV
        } else if (audioType.equalsIgnoreCase("aac")) {
            advancedAudioPlayer = new AdvancedAudioPlayer(); // Can handle AAC
        }
    }

}

