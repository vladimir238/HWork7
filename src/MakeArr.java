import java.util.Arrays;

public class MakeArr {
    String[] familyName={"Калиновер","Чаплыгина","Бабейчик","Бабенцов","Дернова","Дерменджи","Залюков","Калитвянский","Зальмунин","Чанчиков"};


    public HourPayWork[] makeArr(){
        HourPayWork[] arrWork = new HourPayWork[10];
        int n = 10;
        for (int i = 0; i < 5; i++) {
        //    String str = Integer.toString(i);
            arrWork[i] = new HourPayWork(n + 10, familyName[i], n + 100);
            n += 100;
        }
        return arrWork;

    }




}
