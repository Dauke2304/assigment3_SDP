package assigment7;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {
    private List<VideoLecture> lectures;

    public OnlineCourse() {
        lectures = new ArrayList<>();
    }

    public void addLecture(VideoLecture lecture) {
        lectures.add(lecture);
    }

    public void showLectureList() {
        System.out.println("Available Lectures:");
        for (int i = 0; i < lectures.size(); i++) {
            System.out.print((i + 1) + ". ");
            lectures.get(i).getInfo();
        }
    }

    public void playLecture(int index) {
        if (index >= 0 && index < lectures.size()) {
            lectures.get(index).play();
        } else {
            System.out.println("Invalid lecture index.");
        }
    }
}
