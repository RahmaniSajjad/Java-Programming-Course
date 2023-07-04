import java.util.Scanner;

public class session_2 {
    public static void main(String[] args) {
        // input_if_else
        /*Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        if (a % 1 != 0) System.out.println("Not integer");
        else if (a % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");*/
        // برای بیش از یک دستور : {}



        // switch
        /*
                در روش اول بعد هر کیس اتوماتیک بریک میکنه
                ولی در روش دوم باید خودت بریک بنویسی وگرنه بریک نمیکنه و دستورات کیس های پایینش هم ران میشه
         */
        // برای boolean, long, float, double نمیشه استفاده کرد
        //Scanner input = new Scanner(System.in);
        // way 1
        /*char a = input.next().charAt(0);  // input.next().toLowerCase().charAt(0); (better)
        switch (a) {
            case 'a', 'A' -> {
                System.out.println("its a");
                System.out.println("ok");
            }
            case 'b', 'B' -> System.out.println("its b");
            default -> System.out.println("none of them");
        }*/

        // way 2
        /*int b = input.nextInt();
        switch (b) {
            case 4:
            case 3:
                System.out.println("more than 2");
            case 2:
            case 1:
                System.out.println("more than 0");
                System.out.println("ok");
                break;
            default:
                System.out.println("else");
        }*/



        // for
        /*int a;
        for (a = 1; a <= 10; a++)  // for (variable(optional),... ; condition(optional),... ; action(optional),... )
            System.out.print(a + "\t");
        System.out.println("\nafter for i: " + a);*/

        /*int b;
        for (b = 1; b <= 100; b++) ; // فور تا هرجایی که به ; برسد را حلقه محسوب میکند
        System.out.println("after for b: " + b);*/

        /*for (int i = 1; i <= 10; i++)  // اگر متغیر داخل فور تعریف شود خارج آن در دسترس نیست
        {  // برای زمانی که بیش از یک دستور برای فور وجود دارد
            System.out.print(i);
            System.out.print('-');
        }
        System.out.println('\b');*/

        /*for (char i = 'A'; i <= 'z'; i++)  // داخل کد اسکی جلو میره
            System.out.print(i + "\t");
        System.out.println();*/

        /*for (int i = 1; i <= 10; i++) {
            if (i == 5)
                continue;
            if (i == 8)
                break;
            System.out.print(i + "\t");
        }
        System.out.println();*/



        // forEach
        /*char[] chars = "Sajjad".toCharArray();

        for (char i : chars) {
            System.out.println(i);
        }*/



        // while_doWhile
        /*
    for (x; y; z) {
        body();
    }

    Is equals with :

    x;
    while (y) {
        body();
        z;
    }
 */
        /*int i1 = 0;
        while (i1 <= 10) {
            System.out.print(i1 + "\t");
            i1++;
        }
        System.out.println("\ni1 after while: " + i1);*/

        /*int i2 = 0;
        while (i2 <= 10) {
            i2++;
            System.out.print(i2 + "\t");
        }
        System.out.println("\ni2 after while: " + i2);*/

        //System.out.println("---------------------------------------");

        /*int j1 = 0;
        do {
            System.out.print(j1 + "\t");
            j1++;
        } while (j1 != 0 & j1 != 10);
        System.out.println("\nj1 after while: " + j1);*/

        /*int j2 = 0;
        do {
            j2++;
            System.out.print(j2 + "\t");
        } while (j2 != 0 & j2 != 10);
        System.out.println("\nj2 after while: " + j2);*/



        // labelForLoop
        /*label1:
        for (int i = 0; i < 20; i++) {
            for (int j = 1; j < 10; j++) {
                if (j % 8 == 0) {
                    break;
                }
                if (i % 5 == 0) {
                    continue label1;
                }
                System.out.format("i : %d - j : %d\t\t", i, j);
            }
            System.out.println();
        }*/
    }
}
