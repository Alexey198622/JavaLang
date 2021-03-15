package JavaTheCompleteGuide10Edition.Par1.Javalanguage.Chapter3.DataTypesVariablesAndArrays;

// Продемонстрировать область видимости блока кода

public class Scope {
    public static void main(String[] args) {
        int x; // эта переменная доступна всему
               //коду из метода main()

        x = 10;
        if (x == 10) {
            // начало новой области действия,
            int y = 20; // Доступно только этому блоку кода
            // обе переменные х и у доступны в
            //этой области действия

            System.out.println("x и y: " + x + " " + y);

            x = y * 2;

            // у= 100; // ОШИБКА! переменная у недоступна
            // в этой области действия, тогда как
            // переменная х доступна и здесь

            System.out.println("x равно " + x);
        }
    }
}
