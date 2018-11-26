package cn.homework;

public class Student {
    private  String name;
    private  int scord;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", scord=" + scord +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScord() {
        return scord;
    }

    public void setScord(int scord) {
        this.scord = scord;
    }

    public Student() {
    }

    public Student(String name, int scord) {
        this.name = name;
        this.scord = scord;
    }
}
