public class HourPayWork extends WorkerSalary {
    HourPayWork[] bigArr;
    int ideWoker;
    String name;
    int everMontEar;

    public HourPayWork(int ideWoker, String name, int everMontEar) {

        this.ideWoker = ideWoker;
        this.name = name;
        this.everMontEar = everMontEar;
    }

    public HourPayWork() {
        this(0000, "Неизвестный", 0);

    }

    public void fillUpArr() {
    }

    public void print() {
        for (int i = 0; i < bigArr.length; i++) {
            if (bigArr[i] != null) {
                System.out.println(bigArr[i].ideWoker);
            }


        }
    }
}








