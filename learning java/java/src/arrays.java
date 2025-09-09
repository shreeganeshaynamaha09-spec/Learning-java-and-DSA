import java.util.*;
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float totalsum = 0;
//        System.out.println("enter the value of n: ");
//        int n = sc.nextInt();
//        float[] arr= new float[n];
//        System.out.println("enter the" + n +"values");
//        for(int i = 0;i<=n-1;i++){
//            arr[i] = sc.nextFloat();
//        }
//        for(int i=0;i<=n-1;i++){
//            totalsum +=arr[i];
//        }
//        System.out.println(totalsum);

//         int[] arr ={100,200,6,9,407};
//         int n = sc.nextInt();
//         boolean found = false;
//         for (int i =0; i<=arr.length-1; i++) {
//             if (n == arr[i]) {
//                 found = true;
//                 break;
//             }
//         }
//         if(found){
//             System.out.println("found");
//         }
//         else{
//                System.out.println("not found");
//            }
//        float sum=0;
//        int n =sc.nextInt();
//        int[] marks = new int[n];
//        System.out.println("enter the marks");
//        for(int i =0;i<=n-1;i++){
//            marks[i] = sc.nextInt();
//            sum+=marks[i];
//        }
//        System.out.println(sum/2);
//        }
//        System.out.print("Enter number of rows: ");
//        int rows = sc.nextInt();
//        System.out.print("Enter number of columns: ");
//        int cols = sc.nextInt();
//
//        int[][] matrix1 = new int[rows][cols];
//        int[][] matrix2 = new int[rows][cols];
//        int[][] sum = new int[rows][cols];
//
//        // Input first matrix
//        System.out.println("Enter elements of first matrix:");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                matrix1[i][j] = sc.nextInt();
//            }
//        }
//
//        // Input second matrix
//        System.out.println("Enter elements of second matrix:");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                matrix2[i][j] = sc.nextInt();
//            }
//        }
//
//        // Add matrices
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                sum[i][j] = matrix1[i][j] + matrix2[i][j];
//            }
//        }
//
//        // Print result
//        System.out.println("Sum of matrices:");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(sum[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        sc.close();




        int[] arr = {10,20,30,400,50};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}


