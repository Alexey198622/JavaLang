package JavaTheCompleteGuide10Edition.Par1.Javalanguage.Chapter5.ControlOperators;

// Применение  цикла for в стиле for each для обращения к двухмерному массиву

public class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];

        // Присвоить значение элементам массива nums
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }

        // Использовать цикл for в стиле for each для суммирования и вывода значений
        for (int x[] : nums) {
            for (int y : x) {
                System.out.println("Значение равно: " + y);
                sum += y;
            }
        }
        System.out.println("Сумма: " + sum);
    }
}
