package cn.itcast.homework;

public class NoScoredException extends Exception {
    public NoScoredException() {
    }

    public NoScoredException(String message) {
        super(message);
    }
}
