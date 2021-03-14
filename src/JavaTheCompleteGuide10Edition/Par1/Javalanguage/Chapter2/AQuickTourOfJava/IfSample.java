package JavaTheCompleteGuide10Edition.Par1.Javalanguage.Chapter2.AQuickTourOfJava;

public class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше y");

        x = x * 2;
        if ( x == y) System.out.println("x равно y");

        x = x * 2;
        if (x > y) System.out.println("x теперь больше y");

        // Этот оператор небудет ничего выводить

        if (x == y) System.out.println("Вы неувидите этого");
    }
}
