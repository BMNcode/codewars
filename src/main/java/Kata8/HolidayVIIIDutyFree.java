package Kata8;

public class HolidayVIIIDutyFree {


    public static int dutyFree(int normPrice, int discount, int hol) {

        double percent = discount/100.0;

        return (int) Math.floor(hol /(normPrice * percent));

    }

    public static void main(String[] args) {
        System.out.println(dutyFree(10, 10, 500));
    }

}
