package assigment7;

public class RealVideoLecture implements VideoLecture {
    private String title;

    public RealVideoLecture(String title) {
        this.title = title;
        loadVideo();
    }

    // Simulate the time-consuming video loading process
    private void loadVideo() {
        System.out.println("Loading video: " + title + "...");
        try {
            Thread.sleep(2000); // Simulate a delay in loading
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Video " + title + " loaded.");
    }

    @Override
    public void getInfo() {
        System.out.println("Video Title: " + title);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title);
    }
}
