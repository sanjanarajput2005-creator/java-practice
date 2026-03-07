import java.util.Scanner;
class c  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        double l = sc.nextDouble();
        System.out.println("Enter breadth");
        double b = sc.nextDouble();
        double area = l*b;
        System.out.println("area:"+area);

    }
}
