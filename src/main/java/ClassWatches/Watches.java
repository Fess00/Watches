package ClassWatches;

public class Watches {

        public int hour;
        public int minute;
        public int cost;
        public String brand;

        public Watches () {
            this.hour = 0;
            this.brand = "Default";
            this.cost = 0;
            this.minute = 0;
        }

        public Watches (int h, int m, int c, String b) {
            this.hour = h;
            this.minute = m;
            this.cost = c;
            this.brand = b;
        }

        public void setDefaultTime (int h, int m) {
            this.hour = h;
            this.minute = m;
        }

        public void getBrand () {
            System.out.println(this.brand);
        }

        public void getCost () {
            System.out.println(this.cost);
        }

        public void changeTime (int h, int m) {
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

        public void getTime () {
            System.out.println(this.hour + ":" + this.minute);
        }
}
