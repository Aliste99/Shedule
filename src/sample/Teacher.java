package sample;

public class Teacher {
    private String teacherName;
    private Time freeTime;
    private String object1;
    private String object2;
    private String object3;
    private String object4;
    private String object5;
    private String object6;

    Teacher(String teacherName, Time freeTime, String object1, String object2, String object3, String object4, String object5, String object6){
        this.teacherName = teacherName;
        this.freeTime = freeTime;
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
        this.object4 = object4;
        this.object5 = object5;
        this.object6 = object6;
    }


    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Time getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(Time freeTime) {
        this.freeTime = freeTime;
    }

    public String getObject1() {
        return object1;
    }

    public void setObject1(String object1) {
        this.object1 = object1;
    }

    public String getObject2() {
        return object2;
    }

    public void setObject2(String object2) {
        this.object2 = object2;
    }

    public String getObject3() {
        return object3;
    }

    public void setObject3(String object3) {
        this.object3 = object3;
    }

    public String getObject4() {
        return object4;
    }

    public void setObject4(String object4) {
        this.object4 = object4;
    }

    public String getObject5() {
        return object5;
    }

    public void setObject5(String object5) {
        this.object5 = object5;
    }

    public String getObject6() {
        return object6;
    }

    public void setObject6(String object6) {
        this.object6 = object6;
    }
}
