import java.util.Scanner;

public class Change_base {
    public static String change_base(int num, int output_base) {
        char[] chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            result.append(chars[num % output_base]);
            num /= output_base;
        }
        result.reverse();
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int base = input.nextInt();
        System.out.print(change_base(num, base));
    }
}
