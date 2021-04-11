package JavaTheCompleteGuide10Edition.Par1.Javalanguage.Chapter5.ControlOperators;

// Продемонстрировать применение оператора do-while

public class DoWhile {
    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("Такт " + n);
            n--;
        } while (n > 0);
    }
}
