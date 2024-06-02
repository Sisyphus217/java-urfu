package lr8.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JsonParser {
    public static void main(String[] args) {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
