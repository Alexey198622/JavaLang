package JavaTheCompleteGuide10Edition.Par1.Javalanguage.Chapter4.Operations;

// Продемонстрировать применение операции инкремента ++

public class IncDec {
    public static void main(String[] args) {
        int a = 1, b = 2, c, d;
        c = ++b;
        d = a++;
        c++;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
