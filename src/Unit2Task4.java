import java.util.Scanner;

public class Unit2Task4 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int res=0;
        if(a!=0 & b!=0){
        while(b!=0) {
            res+=a;
            b--;
        }
        }
        else{
            res=0;
        }
        System.out.println(res);
    }
}
