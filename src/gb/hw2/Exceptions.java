package gb.hw2;

public class Exceptions {
    static class InvalidNumberException extends Exception {
        public InvalidNumberException(String message) {
            super(message);
        }
    }

    static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }

    static class NumberOutOfRangeException extends Exception {
        public NumberOutOfRangeException(String message) {
            super(message);
        }
    }

    static class NumberSumException extends Exception {
        public NumberSumException(String message) {
            super(message);
        }
    }
}
