import static java.lang.String.format;

public class Clock {
    public static void main(String[] args) {
        int hour = 0, minute = 0, second = 0;
        //System.out.print("\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        while (true) {
            System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b");
            String text = format("%02d : %02d : %02d", hour, minute, second);
            System.out.print(text);

            second++;
            //second *= 50;

            while (second >= 60) {
                second -= 60;
                minute += 1;
            }
            while (minute >= 60) {
                minute -= 60;
                hour += 1;
            }
            try {
                Thread.sleep(1000);
            } catch (Exception exception) {
                System.out.println(exception);
            }
        }
    }
}