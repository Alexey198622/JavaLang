package JavaTheCompleteGuide10Edition.Par1.Javalanguage.Chapter4.Operations;

// Продемонстрировать применение тернарной операции

public class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ?  -i : i; // Получить абсолютное значение переменной i

        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);

        i = -10;
        k = i < 0 ?  -i : i; // Получить абсолютное значение переменной i

        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);
    }
}
