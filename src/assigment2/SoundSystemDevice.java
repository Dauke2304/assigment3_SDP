package assigment2;

public class SoundSystemDevice implements Device {
    private int volume;

    @Override
    public void powerOn() {
        System.out.println("Sound System is powered on.");
    }

    @Override
    public void powerOff() {
        System.out.println("Sound System is powered off.");
    }

    @Override
    public void setChannel(int channel) {
        // Sound systems may not have channels, so this can be ignored
        System.out.println("Sound System doesn't use channels.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Sound System volume set to " + volume);
    }
}
// the examples of sout took from GPT;)