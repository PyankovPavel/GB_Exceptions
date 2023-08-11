package gb.hw3;
/*Задача 2: Файловый менеджер (ООП, исключения)

Создайте класс FileManager. Этот класс должен иметь методы для выполнения основных операций с файлами: чтение, запись и
копирование. Каждый из этих методов должен выбрасывать соответствующее исключение, если в процессе выполнения операции
произошла ошибка (например, FileNotFoundException, если файл не найден).*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("Test.txt");
        FileManager fm = new FileManager();
        fm.writeToFile(file);
        fm.readFile(file);
        fm.copyToFile(new File("Test.txt"), new File("Destination_file.txt"));
    }

    static class FileManager {
        void readFile(File someFile) {
            try (BufferedReader br = new BufferedReader(new FileReader(someFile))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        void writeToFile(File someFile) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(someFile))) {
                String text = "Some text that we are writing into file. :) \nAnd new line\nAnd one more";
                bw.write(text);
                System.out.println("Text saved successfully\n");
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        void copyToFile(File orig, File destination) {
            try {
                Files.copy(orig.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("\nFile copied successfully");
            } catch (IOException e) {
                System.out.println("File not found");
            }
        }
    }
}
