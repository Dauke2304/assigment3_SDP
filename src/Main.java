import assigment2.*;

public class Main {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        RemoteControl tvRemote = new BasicRemote(tv);

        tvRemote.powerOn();
        tvRemote.setChannel(5);
        tvRemote.setVolume(15);
        tvRemote.powerOff();

        System.out.println();

        Device dvd = new DVDDevice();
        RemoteControl dvdRemote = new AdvancedRemote(dvd);

        dvdRemote.powerOn();
        dvdRemote.setVolume(20);
        dvdRemote.powerOff();

        System.out.println();

        Device soundSystem = new SoundSystemDevice();
        RemoteControl soundSystemRemote = new BasicRemote(soundSystem);

        soundSystemRemote.powerOn();
        soundSystemRemote.setVolume(10);
        soundSystemRemote.powerOff();
    }
}