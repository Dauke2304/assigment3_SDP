package assigment2;

public class TVDevice implements Device {
    private int channel;
    private int volume;

    @Override
    public void powerOn() {
        System.out.println("TV is powered on.");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is powered off.");
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("TV channel set to " + channel);
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to " + volume);
    }
}
// the examples of sout took from GPT;)