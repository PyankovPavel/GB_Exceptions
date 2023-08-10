package gb.hw3;

public class Exceptions {
    static class WrongPasswordFormat extends Exception {
        public WrongPasswordFormat(String message) {
            super("Wrong format of password. " + message);
        }
    }
}
