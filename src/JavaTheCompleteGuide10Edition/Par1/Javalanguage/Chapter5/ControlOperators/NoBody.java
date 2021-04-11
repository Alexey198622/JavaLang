package JavaTheCompleteGuide10Edition.Par1.Javalanguage.Chapter5.ControlOperators;

// Целевая часть цикла может быть пустой

public class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;

        // Рассчитать среднее значение переменной i и j
        while (++i < --j);
            System.out.println("Среднее значение равно " + i);

    }
}
