package JavaTheCompleteGuide10Edition.Par1.Javalanguage.Chapter3.DataTypesVariablesAndArrays;

// Вычислить площадь круга

public class Area {
    public static void main(String[] args) {

        double pi, r, a;

        r = 10.8; // Радиус окружности
        pi = 3.1416; // Приблизительное значение числа пи
        a = pi * r * r;

        System.out.println("Площадь круга равна " + a);
    }
}
