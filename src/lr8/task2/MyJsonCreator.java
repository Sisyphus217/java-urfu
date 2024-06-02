package lr8.task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class MyJsonCreator {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        JSONArray tasks = new JSONArray();

        JSONObject task1 = new JSONObject();
        task1.put("task", "Погулять с собакой");
        task1.put("deadline", "17:00, 02.06.2024");

        JSONObject task2 = new JSONObject();
        task2.put("task", "Поиграть с кошкой");
        task2.put("deadline", "20:00, 02.06.2024");

        tasks.add(task1);
        tasks.add(task2);

        jsonObject.put("tasks", tasks);

        try (FileWriter file = new FileWriter("src/lr8/task2/my-example-json.json")) {
            file.write(jsonObject.toJSONString());
            System.out.println("JSON-файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
