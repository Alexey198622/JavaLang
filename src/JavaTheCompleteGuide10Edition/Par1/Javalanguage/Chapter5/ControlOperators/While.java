package JavaTheCompleteGuide10Edition.Par1.Javalanguage.Chapter5.ControlOperators;

//Продемонстрировать применение оператора цикла While

public class While {
    public static void main(String[] args) {
        int n = 10;
        while (n > 0) {
            System.out.println("Такт " + n);
            n--;
        }
    }
}
