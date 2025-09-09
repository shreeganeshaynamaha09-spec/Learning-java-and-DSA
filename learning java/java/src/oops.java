//1. Write a Java class Calculator with a method add that takes two numbers and prints their sum.

//class calculator {
//    void sum(int a, int b) {
//        int sum = a + b;
//        System.out.println("sum is = " + sum);
//    }
//
//
//    public static void main(String[] args) {
//        calculator c1 = new calculator();
//        c1.sum(5, 6);
//    }
//}

// 2. Create a class Student with variables name and age. Add a method to display student details.
//class student{
//    String name;
//    int age;
//
//    public void printinfo(){
//        System.out.println("name: "+ name+" age: "+ age);
//    }
//
//    public static void main(String[] args) {
//        student s1 = new student();
//        s1.name = "manisha";
//        s1.age = 23;
//        s1.printinfo();
//    }
//}

//3. Write a class Rectangle that has length and width. Add a method to calculate and return the area.

//class rectangle{
//    int l;
//    int b;
//    rectangle(int l ,int b){
//        this.l=l;
//        this.b=b;
//    }
//    float area(){
//        return 2*l*b;
//    }
//
//    public static void main(String[] args) {
//        rectangle r1 = new rectangle(45,7);
//        System.out.println("area of rectangle is "+ r1.area());
//    }
//}

//4. Use constructor in a class Book that takes title and author when creating an object.

//class book{
//    String title;
//    String author;
//
//    book(String t, String a) {
//        this.title = t;
//        this.author = a;
//    }
//    void bookinfo(){
//        System.out.println("title is: "+ title+" by" + author);
//    }
//
//    public static void main(String[] args) {
//        book b1 = new book("nature is love"," sam ravula");
//        b1.bookinfo();
//    }
//}
//
//class employee{
//    String name;
//    int salary;
//
//    int getsalary(){
//        return salary;
//    }
//    String getname(){
//       return name;
//    }
//    void setname(String newname){
//        name= newname;
//    }
//
//    public static void main(String[] args) {
//        employee e1 = new employee();
//        e1.setname("samba");
//        e1.salary = 50000;
//
//        System.out.println(" employee name is: " + e1.getname());
//        System.out.println(" employee salary is: "+ e1.getsalary());
//
//    }
//}

//class cellphone{
//    void display(){
//        System.out.println("Ringing ");
//    }
//    void display2(){
//        System.out.println("vibrating");
//    }
//
//    public static void main(String[] args) {
//        cellphone c1 = new cellphone();
//        c1.display();
//        c1.display2();
//    }
//}
//Create a class Square with method to initialize its side, calculate area, perimeter
//
// class square{
//    int side;
//
//    public void setside(int s){
//        side = s;
//
//    }
//    public int area(){
//        return side * side;
//    }
//    public int perimeter(){
//        return 4*side;
//    }
//
//    public static void main(String[] args) {
//        square s1 = new square();
//        s1.setside(5);
//        System.out.println("Area of square is: "+s1.area());
//        System.out.println("perimeter of square is: "+s1.perimeter());
//    }
//}


//                          polymorphism
//class Calculator {
//    // add 2 integers
//    int add(int a, int b) {
//        return a + b;
//    }
//
//    // add 3 integers
//    int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    // add 2 doubles
//    double add(double a, double b) {
//        return a + b;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Calculator c = new Calculator();
//        System.out.println(c.add(2, 3));         // 5
//        System.out.println(c.add(2, 3, 4));      // 9
//        System.out.println(c.add(2.5, 3.7));     // 6.2
//    }
//}

