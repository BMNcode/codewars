package resolveKata;

public class ATM {

    public int solve(int n) {
        int[] bank = {500, 200, 100, 50, 20, 10};
        int result = 0;

        for (int i = 0; i < bank.length; i++) {

            if (n >= bank[i]) {
                n = n - bank[i];
                result++;
                i--;
            }
            if (n == 0) return result;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new ATM().solve(1500));
    }

}

