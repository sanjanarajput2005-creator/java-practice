import java.util.Scanner;
class Loopdivisibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int i=1;
        while(i<=50){
            if(i%n==0){
            
            System.out.println(i);
            }
            i++;
        }
    }
}