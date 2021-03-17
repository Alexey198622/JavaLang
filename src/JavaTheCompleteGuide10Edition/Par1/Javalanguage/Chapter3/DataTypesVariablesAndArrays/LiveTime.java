package JavaTheCompleteGuide10Edition.Par1.Javalanguage.Chapter3.DataTypesVariablesAndArrays;

// Продемонстрировать срок действия переменной

public class LiveTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {

            int y = -1; // Перменная у инициализируется при
            // каждом вхождении в блок кода

            System.out.println("y равно: " + y);

            // Здесь всегда выводится значение -1

            y = 100;
            System.out.println("y теперь равно: " + y);
        }
    }
}
