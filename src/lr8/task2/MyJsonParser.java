package lr8.task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class MyJsonParser {
    public static void main(String[] args) throws IOException, ParseException {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr8/example2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("�������� �������: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\n������� �������: book");
                System.out.println("�������� �����: " + book.get("title"));
                System.out.println("�����: " + book.get("author"));
                System.out.println("��� �������: " + book.get("year"));
            }

            System.out.print("������ �� �� �������� ����� �����? (�� ��� ���): ");
            Scanner in = new Scanner(System.in);
            String answer = in.nextLine();
            String nameBook, author, year;
            if (answer.equals("��")) {
                System.out.print("�������� �������� �����: ");
                nameBook = in.nextLine();
                System.out.print("�������� ��� ������: ");
                author = in.nextLine();
                System.out.print("�������� ��� �������: ");
                year = in.nextLine();

                JSONObject newBook = new JSONObject();
                newBook.put("title", nameBook);
                newBook.put("author", author);
                newBook.put("year", year);
                jsonArray.add(newBook);
                jsonObject.put("books", jsonArray);
                try (FileWriter file = new FileWriter("src/lr8/example2/example-json.json")) {
                    file.write(jsonObject.toJSONString());
                    System.out.println("JSON-���� ������� ��������!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (answer.equals("���")) {
                System.out.println("������������ �� ������� ��������� ����");
            }

            System.out.print("������ �� �� ����� ����� �� ������ � ����? (�� ��� ���): ");
            String answer1 = in.nextLine();
            if (answer1.equals("��")) {
                int j = 0;
                String nameAuthor, yearForSearch;
                System.out.print("������� ��� ������: ");
                nameAuthor = in.nextLine();
                System.out.print("������� ��� ��� ������: ");
                yearForSearch = in.nextLine();
                for (Object o : jsonArray) {
                    JSONObject book = (JSONObject) o;
                    if (book.get("author").equals(nameAuthor) && book.get("year").equals(yearForSearch)) {
                        System.out.println("����� �������: " + book.get("title"));
                        j++;
                    }
                }
                if (j == 0) {
                    System.out.println("����� ����� ���");
                }
            } else if (answer1.equals("���")) {
                System.out.println("������������ ��������� �� ������!");
            }

            System.out.print("������ �� �� ������� �����? (�� ��� ���): ");
            String answer2 = in.nextLine();
            if (answer2.equals("��")) {
                String titleBook;
                System.out.print("������� �������� �����: ");
                titleBook = in.nextLine();
                int j = 0;
                Iterator iterator = jsonArray.iterator();
                while (iterator.hasNext()) {
                    JSONObject book = (JSONObject) iterator.next();
                    if (titleBook.equals(book.get("title"))) {
                        iterator.remove();
                        j++;
                        System.out.println("����� �������!");
                    }
                }
                jsonObject.put("books", jsonArray);
                try (FileWriter file = new FileWriter("src/lr8/example2/example-json.json")) {
                    file.write(jsonObject.toJSONString());
                    System.out.println("JSON-���� ������� ��������!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (j == 0) {
                    System.out.println("����� ����� ���");
                }
            } else if (answer1.equals("���")) {
                System.out.println("������������ ��������� �� ��������!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
