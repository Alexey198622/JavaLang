package JavaTheCompleteGuide10Edition.Par1.Javalanguage.Chapter3.DataTypesVariablesAndArrays;

// Усовершенствованная версия предыдущей программы

public class AutoArray {
    public static void main(String[] args) {
        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println(
                "В апреле " + month_days + " дней"
        );
    }
}
