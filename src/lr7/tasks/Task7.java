package lr7.tasks;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) throws IOException {
        String myPath = "src/lr7/tasks";
        Scanner in = new Scanner(System.in);
        System.out.print("������� �������� ����� ��� ������: ");
        String fileName = in.nextLine();
        System.out.print("������� ����� ��� ������ � ����: ");
        String textToWrite = in.nextLine();
        String finalFileName = myPath + File.separator + fileName + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(finalFileName))) {
            writer.write(textToWrite);
        } catch (IOException e) {
            System.out.println("������ ��� ������ � ����: " + e.getMessage());
            return;
        }
        System.out.println("����� ������� ������� � ����.");
        System.out.println("���������� ���������� ��������: " + textToWrite.length());
    }
}
