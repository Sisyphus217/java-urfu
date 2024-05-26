package lr7.examples;
import java.io.*;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        String inputFileName = "src/lr7/examples/input_ex6.txt";
        String outputFileName = "src/lr7/examples/output_ex6.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
             PrintWriter printWriter = new PrintWriter(outputFileName, "UTF-8")) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line.toUpperCase());
            }
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
