package JavaTheCompleteGuide10Edition.Par1.Javalanguage.Chapter2.AQuickTourOfJava;

public class BlochTest {
    public static void main(String[] args) {
        int x, y;

        y = 20;

        // Адресатом этого оператора цикла служит блок кода

        for (x = 0; x < 10; x++) {

            System.out.println("Значение х: " + x);
            System.out.println("Значение y: " + y);

            y = y - 2;
        }
    }
}
