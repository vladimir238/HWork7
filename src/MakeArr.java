public class MakeArr {
    public HourPayWork[] makeArr(){
        HourPayWork[] arrWork = new HourPayWork[10];
        int n = 10;
        for (int i = 0; i < arrWork.length; i++) {
            String str = Integer.toString(i);
            arrWork[i] = new HourPayWork(n + 10, str+"Петров", n + 100);
            n += 100;
        }
        return arrWork;

    }


}
