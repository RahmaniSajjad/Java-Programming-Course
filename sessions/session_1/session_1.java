public class session_1 {
    // اسم فایل و کلاس اصلیش باید یکسان باشد
    // اسم کلاس آپر کمل کیس (پاسکال کیس)
    // اسم توابع کمل کیس
    // and /**/ for comment
    public static void main(String[] arg) {
        /*System.out.println("hello world !");*/


        //ToDo: complete it


        //EscapeSequence
        /*System.out.print("****\rSajjad^\b\tRahmani\n\"_\'_\\");*/
        /*
                \r      return first
                \b      backspace
                \t      tab
                \n      next line
                \"      "
                \'      '
                \\      \
        */


        //FormatSpecifiers
        /*System.out.printf("int 1   is : %d.\n", 1381);
        System.out.printf("int 2   is : %8d.\n", 1381);
        System.out.printf("int 3   is : %08d.\n", 1381);
        System.out.printf("int 4   is : %+8d.\n", 1381);
        System.out.printf("int 5   is : %,8d.\n", 1381);
        System.out.printf("int 6   is : %+,8d.\n", 1381);
        System.out.printf("int 7   is : %+,8d.\n", -1381);
        System.out.printf("int 8   is : %-,8d.\n", 1381);
        System.out.printf("int 9   is : %-,8d.\n", -1381);
        System.out.println();

        System.out.printf("float 1 is : %f.\n", Math.PI);
        System.out.printf("float 2 is : %.2f.\n", Math.PI);
        System.out.printf("float 3 is : %8.2f.\n", Math.PI);
        System.out.printf("float 4 is : %-8.2f.\n", Math.PI);
        System.out.println();

        System.out.printf("char    is : %c\n", 'S');
        System.out.println();

        System.out.printf("string is  : %s\n", "Sajjad Rahmani");*/


        //DataType
        //System.out.println(Byte.MIN_VALUE); // برای یافتن مینیمم و ماکسیمم هر دیتاتایپی

        /*System.out.println(Byte.MIN_VALUE);  // 1 byte
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);  // 2 byte
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);  // 4 byte
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);  // 8 byte
        System.out.println(Long.MAX_VALUE);  // برای long بعد عدد یه l باید بزاری که int درنظر نگیره

        System.out.println(Float.MIN_VALUE);  // 4 byte
        System.out.println(Float.MAX_VALUE);  // برای float بعد عدد یه f باید بزاری

        System.out.println(Double.MIN_VALUE);  // 8 byte
        System.out.println(Double.MAX_VALUE);  // برای double بعد عدد یه d باید بزاری*/

        // String & character & boolean
        //char c = 's';      // 2 byte
        //boolean b = true;  // 1 bit
        //String s = "Sajjad";

        // تغییر نوع
        //int i = (int) (1.5);
        // اگر متغیری از نوع بزرگتر را به متغیری از نوع کوچکتر بخواهی اختصاص دهی باید تغییر نوع بدی

        // Integer i = Integer.parseInt(string);  تغییر نوع از استرینگ به عددی
        // String s  = String.valueOf(b);         تغییر نوع از عددی به استرینگ

        // در محاسبات ریاضی پیشفرض عدد را اینت میگیرد اگر حاصل بزرگ است به لانگ تبدیل کن تا اورفلو نکند
        //System.out.println("Without change type (overflowed): " + Short.MAX_VALUE * Integer.MAX_VALUE);
        //System.out.println("With change type (correct answer): " + (long) (Short.MAX_VALUE) * Integer.MAX_VALUE);

        // different between int & float & double
        //int c1 = 5 / 3;
        //float c2 = 5f / 3;  // اگر F را نذاري اينت در نظر ميگيره
        //double c3 = 5d / 3;  // اگر D را نذاري اينت در نظر ميگيره
        //System.out.println(c1 + "\t" + c2 + "\t" + c3);



        /*int a = 54, b = 113;
        int max = (a > b) ? a : b;
        System.out.println("Maximum between a and b :" + max);*/



        /*System.out.println(Math.pow(4, 0.5));*/



        /*double c = 0.0 / 0.0; // double a = Double.NaN;  // مقدار مبهم
        double d = Double.MAX_VALUE * 2;  // مثبت بی نهایت
        double e = Double.MAX_VALUE * (-2);  // منفی بی نهایت
        System.out.println(c + "\t\t" + d + "\t\t" + e);*/


        // change two numeric variable
        /*int f = 1, g = 2;
        System.out.println("f = " + f + "\tg = " + g);
        f = f + g;
        g = f - g;
        f = f - g;
        System.out.println("f = " + f + "\tg = " + g);*/


        //Logical_and_Bit_Operators
        /*
                    logical operators
                    !    --->    not
                    &&   --->    and
                    ||   --->    or

                    bit operators
                    (اعداد را به مبنای 2 می برد
     سپس بین بیت های متناظر عملگر را انجام می دهد
     و در نهایت حاصل را به مبنای 10 برده و چاپ می کند)
                    ~   --->    not
                    &   --->    and
                    |   --->    or
                    ^   --->    xor  (اگر دو طرف یکسان نادرست - اگر متفاوت درست)
                    <<  --->    left shift (عدد سمت چپ را به تعداد عدد سمت راست دوبرابر میکند)
                    >>  --->    right shift (عدد سمت چپ را به تعداد عدد سمت راست نصف میکند)
         */


        //different_between_bitOperator_logicalOperator
        /*
                عملگر های
                |       ||
                &       &&
                بجز فرق پایین در شرط ها فرق دیگری ندارند (زیرا بولین در واقع صفر و یک است)
                همچنین ! از منطقی و ^ از بیتی در شرط ها قابل استاده است
         */
/*
        int a=10;
        if( false && a++>0);
        System.out.println(a);
        // عملگر های منطقی بهینه است و هرجا به جواب برسد سایر خوانده نمیشود

        a=10;
        if( false & a++>0);
        System.out.println(a);
        // عملگر های بیتی بهینه نیست و همه کد خوانده میشود
 */
    }
}
