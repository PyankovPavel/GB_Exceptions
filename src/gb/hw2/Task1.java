package gb.hw2;

/*
      Задача 1:
      Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
      Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с
      сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".
     */
public class Task1 {

    public static void main(String[] args) {
        Task1 ex1 = new Task1();
        ex1.numCheck(5);
        ex1.numCheck(-55);
    }

    public void numCheck(int number) {
        try {
            if (isPositive(number)) {
                System.out.println("The number " + number + " is correct");
            } else {
                throw new Exceptions.InvalidNumberException("The number " + number + " is incorrect");
            }
        } catch (Exceptions.InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }

//    public void numCheck2(int number) throws InvalidNumberException {
//        if (isPositive(number)) {
//            throw new InvalidNumberException("The number " + number + " is correct");
//        } else {
//            throw new InvalidNumberException("The number " + number + " is incorrect");
//        }
//    }

    public boolean isPositive(int number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }

}
