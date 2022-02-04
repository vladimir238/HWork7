public class HourPayWork extends WorkerSalary {
    HourPayWork[] hourpays;
    int ideWoker;
    String name;
    int everMontEar;
    //    hourpays=new HourPayWork[10];

    public HourPayWork(int ideWoker, String name, int everMontEar) {
        this.ideWoker = ideWoker;
        this.name = name;
        this.everMontEar = everMontEar;
    }

    public HourPayWork() {
        this(0000, "Неизвестный", 0);

    }

    public void fillUpArr(){}

}


