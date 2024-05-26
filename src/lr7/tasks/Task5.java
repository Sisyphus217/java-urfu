package lr7.tasks;
import java.io.File;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        String myPath = "src/lr7/tasks";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название файла: ");
        String fileName = in.nextLine();
        String finalFileName = myPath + File.separator + fileName + ".txt";
        File file = new File(finalFileName);
        if (file.exists()) {
            long fileSize = file.length();
            System.out.println("Размер файла " + fileName + " составляет " + fileSize + " байт.");
        } else {
            System.out.println("Файл не найден.");
        }
    }
}
