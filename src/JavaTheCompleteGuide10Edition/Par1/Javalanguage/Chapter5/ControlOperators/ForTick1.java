package JavaTheCompleteGuide10Edition.Par1.Javalanguage.Chapter5.ControlOperators;

// Объявить переменную управления циклом в самом цикле for

public class ForTick1 {
    public static void main(String[] args) {

        // Здесь переменная n объявляется в самом цикле for
        for (int n = 10; n > 0; n--) {
            System.out.println("такт " + n);
        }
    }
}
