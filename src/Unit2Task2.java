public class Unit2Task2 {
    public static void main(String[] args){
        int x=1;
        int y=2;
        int n=24;
        for(int i=3;i<27;i+=3){
            x*=y;
            System.out.println("через "+i+" часов амеб будет = "+ x);
        }
    }
}
