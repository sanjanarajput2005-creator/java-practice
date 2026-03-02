import java.util.Scanner;

class simplecalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();

        System.out.println("Enter operator(+,-,*,/):");
        char operator = sc.next().charAt(0);

        double result = 0;

        //switch case for operation
        switch (operator){
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                if(b!=0)
                  result = a/b;
                else {
                  System.out.println("This approach reaches to infinity, so this is invalid.");
                  return;
                }
                break;

            default:
                System.out.println("invalid operator");
                return;
        }

            System.out.println("result:"+result);



    }
}
