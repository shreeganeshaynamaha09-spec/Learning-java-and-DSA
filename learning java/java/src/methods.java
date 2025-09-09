import java.util.*;
public class methods {
//    static void table(int n){
//        for(int i =1;i<=10;i++){
//            System.out.println(n + "X"+ i + "="+ n*i);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number: ");
//        int n = sc.nextInt();
//        table(n);

        static void pattern(int n){
            for(int i=n-1;i>=0;i--){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        pattern(n);
    }
}
