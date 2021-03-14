package ClassWatches;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Watches reg = new Watches(4, 8, 15000, "TIMEX");
        SportWatches sport = new SportWatches(3, 15, 0, 30000, "Casio");
        sport.setDefaultTime(20,45,15);
        sport.getTime();
        sport.changeTime(1,13,120);
        sport.getTime();
        reg.setDefaultTime(2,6);
        reg.getTime();
        reg.changeTime(0,120);
        reg.getTime();
    }
}
