public class Unit2Task1 {
    public static void main(String[] args){
        double x = 10;
        int y = 1;
        double z = 0.1;
        while(y!=8){
            x=x+x*z;
            y++;
            System.out.println(x);
        }
        System.out.println(x);

    }
}
