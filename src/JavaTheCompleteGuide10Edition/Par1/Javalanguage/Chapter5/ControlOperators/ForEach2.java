package JavaTheCompleteGuide10Edition.Par1.Javalanguage.Chapter5.ControlOperators;

// Применение  оператора break в цикле for в стиле for each

public class ForEach2 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        // Использовать цикл встиле for each для вывода и суммирования значений из части массива

        for (int x : nums) {
            System.out.println("Значение равно: " + x);
            sum += x;
            if ( x == 5) break; // Прервать цикл после 5 значений
        }
        System.out.println("Сумма пяти первых элементов равна: " + sum);
    }
}
