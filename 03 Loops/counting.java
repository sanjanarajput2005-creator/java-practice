import java.util.Scanner;
class counting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
         int count=0;
        for(int i=1;i<=n;i++){
            if(i%7==0){
                count=count+1;
            }
        }
         System.out.println("count=" +count);

    }
}