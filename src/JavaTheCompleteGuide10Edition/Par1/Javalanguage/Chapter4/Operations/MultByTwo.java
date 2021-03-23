package JavaTheCompleteGuide10Edition.Par1.Javalanguage.Chapter4.Operations;

// Применение сдвига в лево в качестве быстрого способа умножения на 2

public class MultByTwo {
    public static void main(String[] args) {
        int i, num = 0xFFFFFFE;

        for (i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}
