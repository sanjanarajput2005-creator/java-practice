import java.util.Scanner;
class loopfactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        
        int fact;
        if(n==1){
           fact=1;
        }
        else{
        for(int i=1;i<=n;i++){

        
            fact=fact*i;
        }
            System.out.println("Factorial=" +fact);

        }
        
    }
}