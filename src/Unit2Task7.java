public class Unit2Task7 {
    public static void main(String[] args){
        int x=0;
        int res=0;
        while(x!=100){
            if(x%2!=0){
               res+=x;
            }
            x++;
        }
        System.out.println(res);
    }
}
