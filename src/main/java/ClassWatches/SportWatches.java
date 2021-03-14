package ClassWatches;

public class SportWatches extends Watches{
    public int second;

    public SportWatches () {
        this.hour = 0;
        this.brand = "Default";
        this.cost = 0;
        this.minute = 0;
        this.second = 0;
    }

    public void changeTime (int h, int m, int s) {
        if (s != 0 && (s + this.second) >= 60) {
            int rem = (this.second + s) / 60;
            this.minute += rem;
            this.second = (this.second + s) % 60;
        } else {
            this.second += s;
        }

        if (m != 0 && (m + this.minute) >= 60) {
            int rem = (this.minute + m) / 60;
            this.hour += rem;
            this.minute = (this.minute + m) % 60;
        } else {
            this.minute += m;
        }

        if (h != 0 && h >= 24) {
            this.hour = (this.hour + h) % 24 - 1;
        } else {
            this.hour += h;
        }
    }

    public void setDefaultTime (int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    public SportWatches (int h, int m, int s, int c, String b) {
        this.hour = h;
        this.minute = m;
        this.second = s;
        this.cost = c;
        this.brand = b;
    }

    @Override
    public void getTime () {
        System.out.println(this.hour + ":" + this.minute + ":" + this.second);
    }
}
