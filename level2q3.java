public class level2q3 {
    static boolean isLeap(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        int year = 2024;
        System.out.println(year + " is leap? " + isLeap(year));
    }
    
}
