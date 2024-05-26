package lr7.tasks;

import java.io.*;
import java.util.Scanner;


public class Task8 {
    public static void main(String[] args) {
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger", 277);

        try {
            FileOutputStream fileOut = new FileOutputStream("src/lr7/tasks/book.json");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(book);
            out.close();
            fileOut.close();
            System.out.println("Объект записан в book.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Book restoredBook = null;
        try {
            FileInputStream fileIn = new FileInputStream("src/lr7/tasks/book.json");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            restoredBook = (Book) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Объект считан!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Объект после считывания: ");
        System.out.println(restoredBook);
    }
}
