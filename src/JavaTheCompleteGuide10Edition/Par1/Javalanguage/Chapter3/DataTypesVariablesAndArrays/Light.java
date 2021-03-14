package JavaTheCompleteGuide10Edition.Par1.Javalanguage.Chapter3.DataTypesVariablesAndArrays;

public class Light {
    public static void main(String[] args) {
        int Lightspeed;
        long days;
        long seconds;
        long distance;

        // Приблизительная скорость света, миль в секунду

        Lightspeed = 186000;

        days = 1000; // Указать количество дней

        seconds = days * 24 * 60 * 60; // Преобразовать в секунды

        distance = Lightspeed * seconds; // Вычислить расстояние

        System.out.print("За " + days);
        System.out.print(" дней свет пройдёт около ");
        System.out.println(distance + " миль");

    }
}
