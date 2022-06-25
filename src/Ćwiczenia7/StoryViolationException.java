package Ćwiczenia7;

public class StoryViolationException extends Exception{
    public StoryViolationException(String message) {
        super(message);
    }

    public void printMessage() {
        System.out.println("*nie wiedziałem o jaki message tu chodzi*");
    }
}
