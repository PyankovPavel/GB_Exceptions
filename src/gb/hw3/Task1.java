package gb.hw3;
/*Задача 1: Проверка пароля (Основы языка Java, операторы, ветвления)

Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает строку пароля и проверяет
его на соответствие следующим правилам:
*Пароль должен быть не менее 8 символов.
*Пароль должен содержать хотя бы одну цифру.
*Пароль должен содержать хотя бы одну заглавную букву.
*Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.*/


public class Task1 {
    public static void main(String[] args) throws Exceptions.WrongPasswordFormat {
        PasswordVerifier psver = new PasswordVerifier();
        psver.passwordCheck("hEllo1eggw");
        psver.passwordCheck("privet87");
    }

    static class PasswordVerifier {
        void passwordCheck(String password) throws Exceptions.WrongPasswordFormat {
            if (password.length() < 8) {
                throw new Exceptions.WrongPasswordFormat("Too short");
            } else if (!hasNumber(password)) {
                throw new Exceptions.WrongPasswordFormat("Password should contains at least one digit.");
            } else if (!hasUpperSymbol(password)) {
                throw new Exceptions.WrongPasswordFormat("Password should contains at least one Uppercase symbol.");
            } else {
                System.out.println("Password is correct");
            }
        }
    }

    public static boolean hasNumber(String someString) {
        boolean flag = false;
        char[] chars = someString.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static boolean hasUpperSymbol(String someString) {
        boolean flag = false;
        char[] chars = someString.toCharArray();
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}

