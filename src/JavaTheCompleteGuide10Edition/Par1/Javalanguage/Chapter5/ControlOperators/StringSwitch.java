package JavaTheCompleteGuide10Edition.Par1.Javalanguage.Chapter5.ControlOperators;

// Использование символьных строк для управления оператором switch

public class StringSwitch {
    public static void main(String[] args) {
        String str ="два";
        switch (str) {
            case "Один":
                System.out.println("Один");
                break;

            case "Два":
                System.out.println("Два");
                break;

            case "Три":
                System.out.println("Три");
                break;
            default:
                System.out.println("Не совпало");
                break;
        }
    }
}
