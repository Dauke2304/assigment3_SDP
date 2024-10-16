package assigment2;

public class DVDDevice implements Device {
    private int volume;

    @Override
    public void powerOn() {
        System.out.println("DVD Player is powered on.");
    }

    @Override
    public void powerOff() {
        System.out.println("DVD Player is powered off.");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("DVD Player doesn't use channels.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("DVD Player volume set to " + volume);
    }
}
// the examples of sout took from GPT;)

