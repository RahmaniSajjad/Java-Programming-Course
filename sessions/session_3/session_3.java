import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class session_3 {
   /* public static void main(String[] args) {
        // آرایه
        *//*
            سایز آرایه ثابت است
            عناصر آرایه باید از یک نوع باشند
         *//*

        ///// Define an array

        // way 1
        // int[] arr = {2, 87, 85, 9};

        // way 2
        int[] arr = new int[4];
        arr[0] = 2;
        arr[1] = 87;
        arr[2] = 85;
        arr[3] = 9;
        printArray(arr);
        System.out.println("--------------------------");


        ///// Reverse An Array

        // int[] reversedArr = arr;
        // نکته : اگر به صورت بالا بنویسی جفتش را به یک حافظه ارجاع میده
        // و تغییر هرکدوم دیگری را تغییر میده
        int[] reversedArr = arr.clone();
        for (int i = 0; i < reversedArr.length / 2; i++) {
            int keeper = reversedArr[i];
            reversedArr[i] = reversedArr[reversedArr.length - 1 - i];
            reversedArr[reversedArr.length - 1 - i] = keeper;
        }
        printArray(arr);
        printArray(reversedArr);
        System.out.println("--------------------------");


        ///// print a random element of array
        // redefine an array
        //arr = new int[10]  // for redefine with size
        arr = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int randomIndex = (int) (Math.random() * arr.length);  // between 0 & arr.length-1
        System.out.println(arr[randomIndex]);
        System.out.println("--------------------------");


        ///// Shuffle An Array
        int[] shuffledArr = arr.clone();
        for (int i = 0; i < shuffledArr.length; i++) {
            int rand = (int) (Math.random() * i);
            int keeper = shuffledArr[rand];
            shuffledArr[rand] = shuffledArr[i];
            shuffledArr[i] = keeper;
        }
        printArray(arr);
        printArray(shuffledArr);
        System.out.println("--------------------------");
    }

    // آرایه اصلی و آرایه متد هردو به یک آدرس ارجاع داده می شوند پس
    // تغییر هرکدام دیگری را هم تغییر می دهد
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.print("\b\n");
    }*/





    // آرایه دو بعدی
/*    public static void main(String[] args) {
        ///// Define An 2dArray
        // way 1
        int[][] matrix1 = {  // 2 in 3
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("Matrix1 :");
        printMatrix(matrix1);
        System.out.println("--------------------------");

        // way 2
        int[][] matrix2 = new int[3][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 4;
        matrix2[2][0] = 5;
        matrix2[2][1] = 6;
        System.out.println("Matrix2 :");
        printMatrix(matrix2);
        System.out.println("--------------------------");


        ///// product of two matrix
        // matrix1(p*q) * matrix2(q*r) = productMatrix(p*r)
        int p = matrix1.length;
        int q = matrix1[0].length;  // = matrix2.length
        int r = matrix2[0].length;
        int[][] productMatrix = new int[p][r];
        for (int i = 0; i < p; i++)
            for (int j = 0; j < r; j++)
                for (int k = 0; k < q; k++)
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
        System.out.println("Matrix1 * Matrix2 :");
        printMatrix(productMatrix);
        System.out.println("--------------------------");
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.print("\b\n");
        }
    }*/





    // arrayList
/*    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        // add a item
        arr.add(1);

        // add some items
        Integer[] arr_tmp = {10, 20, 30};
        // way 1
        //arr.addAll(Arrays.asList(arr_tmp));
        //way 2
        Collections.addAll(arr, arr_tmp);

        // get a element from index
        System.out.println(arr.get(0));

        // get a index from element
        System.out.println(arr.indexOf(20));  // -1 means not found

        // print array
        System.out.println(arr);

        // print array size
        System.out.println(arr.size());

        // change an item
        arr.set(0, 100);
        System.out.println(arr);

        // remove an item
        arr.remove(0);
        System.out.println(arr);

        // remove all items
        arr.clear();
        System.out.println(arr);

        // sort array
        arr_tmp = new Integer[]{15, 14, 16, 11};
        Collections.addAll(arr, arr_tmp);
        System.out.println("before sort :        " + arr);
        Collections.sort(arr);
        System.out.println("after sort :         " + arr);
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println("after reverse sort : " + arr);

        // is an element exist in arrayList ?
        boolean status = arr.contains(11);
        if (status)
            System.out.println("arr contains 11");

        // is some elements exist in arrayList ?
        arr_tmp = new Integer[]{15, 11};
        status = arr.containsAll(Arrays.asList(arr_tmp));
        if (status)
            System.out.println("all elements in arr_tmp are exist in arr");
    }*/






    // try catch
/*    public static void main(String[] args) {
        var input = new Scanner(System.in);
        // test : 5 | 0 | p

        String error = "";
        try {
            System.out.println(10 / input.nextInt());

        } catch (ArithmeticException arithmeticException) {
            error = arithmeticException.toString();
            System.out.println("you can't divide by zero.");

        } catch (Exception exception) {
            error = exception.toString();

        } finally {  // always run
            if (!error.isEmpty()) {
                System.out.println("Errored because : " + error);
            }
        }
    }*/

}
