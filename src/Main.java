import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MakeArr arrWork = new MakeArr();
        HourPayWork[] bigArr ;
        bigArr = arrWork.makeArr();

        for (int i = 0; i < 10; i++) {
            System.out.println(bigArr[i].name + "   " + bigArr[i].ideWoker);
        }
    }
}

