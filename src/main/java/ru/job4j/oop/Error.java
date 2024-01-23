package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private  String message;

    public Error() {
        active = true;
        status = 2;
        message = "Dangerous";
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Error is active? " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        error1.printInfo();
        Error error2 = new Error(false, 1, "Safe");
        error2.printInfo();
    }
}
