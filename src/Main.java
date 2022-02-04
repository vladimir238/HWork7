import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        HourPayWork[] arrWork = new HourPayWork[10];
//        arrWork[1] = new HourPayWork(534, "Петров A.C.", 345);
//        int n = 10;
//        for (int i = 0; i < arrWork.length; i++) {
//            String str = Integer.toString(i);
//            arrWork[i] = new HourPayWork(n + 10, str+"Петров", n + 100);
//            n += 100;
//        }
        MakeArr arrWork = new MakeArr();
        HourPayWork[] bigArr ;
        bigArr = arrWork.makeArr();

        for (int i = 0; i < 10; i++) {
            System.out.println(bigArr[i].name + "   " + bigArr[i].ideWoker);
        }
    }
}

