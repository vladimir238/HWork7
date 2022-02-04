import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HourPayWork[] arrWork = new HourPayWork[10];
        arrWork[1] = new HourPayWork(534, "Петров A.C.", 345);
        int n = 10;
        for (int i = 0; i < arrWork.length; i++) {
            String str = Integer.toString(i);
            arrWork[i] = new HourPayWork(n + 10, str+"Петров", n + 100);
            n += 100;
        }
        for (HourPayWork a : arrWork) {
            System.out.println(a.name+a.ideWoker+a.everMontEar);
        }
    }
}
