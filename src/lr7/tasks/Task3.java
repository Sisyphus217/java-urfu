package lr7.tasks;
import java.io.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        String fileName = "src/lr7/tasks/input.txt";
        BufferedReader reader =
                new BufferedReader(
                        new FileReader(fileName));
        int lineCount = 0;
        while (reader.readLine() != null) {
            lineCount++;
        }
        reader.close();
        System.out.println("Количество строк в файле: " + lineCount);
    }
}
