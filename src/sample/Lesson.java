package sample;

public class Lesson {
    private String lessonName;
    private String teacherName;
    private Time time;
    private String dayOfWeek;
    private int audience;

    Lesson(String lessonName, String teacherName, Time time, String dayOfWeek, int audience){
        this.lessonName = lessonName;
        this.teacherName = teacherName;
        this.time = time;
        this.dayOfWeek = dayOfWeek;
        this.audience = audience;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setAudience(int audience) {
        this.audience = audience;
    }

    public String getLessonName() {
        return lessonName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public Time getTime() {
        return time;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getAudience() {
        return audience;
    }
}
