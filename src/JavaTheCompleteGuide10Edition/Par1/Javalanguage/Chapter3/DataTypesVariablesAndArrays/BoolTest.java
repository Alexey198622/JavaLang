package JavaTheCompleteGuide10Edition.Par1.Javalanguage.Chapter3.DataTypesVariablesAndArrays;

// Продемонстрировать применение значений типа boolean

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);

        // Значение типа boolean может управлять оператором if

        if (b) System.out.println("Этот код выполняется.");

        b = false;

        if (b) System.out.println("Этот код не выполняется.");

        // Результат сравнения - значение типа boolean
        System.out.println("10 > 9 равно " + (10 > 9));






    }
}
