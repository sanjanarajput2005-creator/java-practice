import java.util.Scanner;
class digitcount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int count=0;
        while(n>0){
            n=n/10;
            count=count+1;
        }
        System.out.println("number of digit=" +count);
    }
}