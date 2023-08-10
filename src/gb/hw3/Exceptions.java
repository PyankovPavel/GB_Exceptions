package gb.hw3;

public class Exceptions {
    static class WrongPassworFormat extends Exception {
        public WrongPassworFormat(String message) {
            super("Wrong format of password. " + message);
        }
    }
}
