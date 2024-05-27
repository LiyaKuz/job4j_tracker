package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(this.active);
        System.out.println(this.status);
        System.out.println(this.message);
    }

    public static void main(String[] args) {
        Error errorDefault = new Error();
        errorDefault.printInfo();

        Error error = new Error(true, 500, "Test message");
        error.printInfo();

        Error errorTwo = new Error(false, 200, "Test message OK");
        errorTwo.printInfo();

        Error errorThree = new Error(true, 404, "Test message NOT FOUND");
        errorThree.printInfo();
    }

}
