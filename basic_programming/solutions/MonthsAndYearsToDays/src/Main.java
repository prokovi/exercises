public class Main {

    public static void main(String[] args) {
        int years = 0;
        int months = 13;
        int days = showDays(years, months);
        System.out.println(days);
    }

    public static int showDays(int x1, int x2) {
        if (x2 > 12) {
            System.out.println("Months should be under 13");
        }
        int result = x1 * 365 + x2 * 29;
        return result;
    }
}
