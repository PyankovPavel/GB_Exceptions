package gb.hw2;
/*
Задача3: - по желанию
Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:
Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением
"Первое число вне допустимого диапазона".
Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением
"Второе число вне допустимого диапазона".
Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением
"Сумма первого и второго чисел слишком мала".
Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
- необходимо создать 3 класса собвстенных исключений*/

public class Task3 {

    public static void main(String[] args) throws Exceptions.NumberSumException, Exceptions.DivisionByZeroException,
            Exceptions.NumberOutOfRangeException {
        checkNums(5,33,5);
    }
    public static void checkNums(int a, int b, int c) throws Exceptions.NumberOutOfRangeException,
            Exceptions.NumberSumException, Exceptions.DivisionByZeroException {
        if (a > 100) {
            throw new Exceptions.NumberOutOfRangeException("Первое число вне допустимого диапазона");
        } else if (b < 0) {
            throw new Exceptions.NumberOutOfRangeException("Второе число вне допустимого диапазона");
        } else if (a + b < 10) {
            throw new Exceptions.NumberSumException("Сумма первого и второго чисел слишком мала");
        } else if (c == 0) {
            throw new Exceptions.DivisionByZeroException("Деление на ноль недопустимо");
        } else {
            System.out.println("Проверка пройдена успешно");
        }
    }
}
