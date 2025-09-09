public class recurssion {
//    static void printPattern(int n, int i) {
    // base case
//        if (i > n) return;
//
//        // print stars for this row
//        printStars(i);
//
//        // move to next line
//        System.out.println();
//
//        // recursive call for next row
//        printPattern(n, i + 1);
//    }
//
//    static void printStars(int j) {
//        if (j == 0) return;
//        System.out.print("*");
//        printStars(j - 1); // recursive call to print remaining stars
//    }
//
//    public static void main(String[] args) {
//        int rows = 4;
//        printPattern(rows, 1);
//

    static void printpattern(int n, int i) {
        if (i > n) return;
        printstars(n - i + 1);
        System.out.println();
        printpattern(n, i+1);
    }

    static void printstars(int j) {
        if (j == 0) return;
        System.out.print("*");
        printstars(j - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        printpattern(n, 1);
    }
}
