import java.util.Scanner;
class d  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = sc.nextDouble();
         System.out.println("Enter second number");
        double b = sc.nextDouble();
        //swapping numbers without using third variable
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("After swapping:");
         System.out.println("a:"+a);
          System.out.println("b:"+b);
        //System.out.println("cube:"+cube);

    }
}
