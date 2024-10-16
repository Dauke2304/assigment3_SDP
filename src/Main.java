import assigment7.*;
public class Main {
    public static void main(String[] args) {
        // Create the course and add video lectures (proxies)
        OnlineCourse course = new OnlineCourse();
        course.addLecture(new ProxyVideoLecture("Introduction to Design Patterns"));
        course.addLecture(new ProxyVideoLecture("Understanding the Proxy Pattern"));
        course.addLecture(new ProxyVideoLecture("Implementing the Flyweight Pattern"));

        // Display the list of available lectures
        course.showLectureList();

        // Play the second lecture, which will trigger lazy loading
        System.out.println("\nPlaying the second lecture...");
        course.playLecture(1);

        // Play the first lecture
        System.out.println("\nPlaying the first lecture...");
        course.playLecture(0);
}
}