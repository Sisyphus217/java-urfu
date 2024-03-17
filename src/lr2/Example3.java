package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String message = scanner.nextLine();

        System.out.println("Введите ключ:");
        int key = scanner.nextInt();

        String codedMessage = getCodedMessage(message, key);
        System.out.println("Текст после преобразования: " + codedMessage);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        scanner.nextLine(); // Consume newline left-over
        String code = scanner.nextLine();

        if (code.equals("y")) {
            String decodedMessage = getCodedMessage(codedMessage, -key);
            System.out.println("Текст после обратного преобразования: " + decodedMessage);
        } else if (code.equals("n")) {
            System.out.println("До свидания");
        } else {
            System.out.println("Введите корректный ответ");
        }

        scanner.close();
    }

    private static String getCodedMessage(String message, int key) {
        StringBuilder stringBuilder = new StringBuilder(message.length());

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);

            if (Character.isLetter(currentChar)) {
                currentChar += (char) (key % 26);

                if (currentChar > 'z')
                    currentChar = (char)(currentChar % 'z' + 'a');
                else if (currentChar < 'a')
                    currentChar = (char)(currentChar + 25);
            }

            stringBuilder.append(currentChar);
        }

        return stringBuilder.toString();
    }
}

