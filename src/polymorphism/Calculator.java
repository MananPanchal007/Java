package polymorphism;

public class Calculator {
    public static void main(String[] arg){
        Features.add(5,6, 6);
    }
}

class Features{
    static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

//    Method overloading
    static void add(double a, double b){
        System.out.println(a+b);
    }
}