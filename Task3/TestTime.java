public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // Display times before change
        System.out.println("t1 before: " + t1.toString());
        System.out.println("t2 before: " + t2.toString());

        // Change times
        t1.nextSecond();
        t2.previousSecond();

        // Display times after change
        System.out.println("t1 after nextSecond: " + t1.toString());
        System.out.println("t2 after previousSecond: " + t2.toString());
    }
}