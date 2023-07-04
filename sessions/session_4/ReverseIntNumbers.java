public class ReverseIntNumbers {
    public static void main(String[] args) {
        int n,o=0;
        n=123;
        while (n>0){
            o=o*10+n%10;
            n=n/10;
        }
        System.out.print(o);
    }
}
