package gb.hw2;

/*
* Задача 2:
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. Если второе число равно нулю,
* программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
* В противном случае, программа должна выводить результат деления. */
public class Task2 {
    public static void main(String[] args) {
        Task2 ex = new Task2();
        System.out.println(ex.division(10, 5));
        System.out.println(ex.division(10, 0));
    }

//    public int division(int a, int b) throws DivisionByZeroException {
//
//        if (b == 0) {
//            throw new DivisionByZeroException("Деление на ноль недопустимо");
//        }
//        return a / b;
//    }

    public int division(int a, int b) {
        int result = -1;
        try {
            if (b != 0) {
                result = a / b;
            } else {
                throw new Exceptions.DivisionByZeroException("Деление на ноль недопустимо");
            }
        } catch (Exceptions.DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
