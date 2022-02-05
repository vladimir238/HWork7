import java.util.Arrays;

public class MakeArr {
    String[] familyName = {"Калиновер", "Чаплыгина", "Бабейчик", "Бабенцов", "Дернова", "Дерменджи", "Залюков", "Калитвянский", "Зальмунин", "Чанчиков"};
    HourPayWork[] arrWork = new HourPayWork[10];

    public HourPayWork[] makeArr() {
        int n = 10;
        for (int i = 0; i < 5; i++) {
            //    String str = Integer.toString(i);
            arrWork[i] = new HourPayWork(n + 10, familyName[i], n + 100);
            n += 100;
        }
        return arrWork;

    }

    public void print(HourPayWork[] bigArr) {
        for (int i = 0; i < bigArr.length; i++) {
            if (bigArr[i] != null) {
                System.out.println(bigArr[i].ideWoker);
            }
        }


    }
}
