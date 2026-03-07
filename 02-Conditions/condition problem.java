import java.util.Scanner;
class i {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary");
        double salary = sc.nextDouble();
        if(salary>50000){
            bonus = salary*0.20;
        }
        else{
            bonus = salary*0.10;
        }
        System.out.println("bonus amount:"+bonus);
        System.out.println("Total salary after bonus:"+(salary+bonus));
    
        

    }
}
