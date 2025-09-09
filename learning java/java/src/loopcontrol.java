import java.util.*;
public class loopcontrol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int totalsum = 0;
//        int i = 1;
//        while(i<=n){
//            if(i%2==0){
//                totalsum+=i;
//            }
//            i++;
//        }
//        System.out.println(totalsum);
//
//          for(int i =1;i<=10;i++){
//              System.out.println(n+ "X" + i + "=" +(n*i));

        long fact = 1;   // use long to handle big results
        int i = 1;
        while(i<=n) {
            fact = fact * i;
            i++;// multiply step by step
        }
        System.out.println( fact);
    }
    }





