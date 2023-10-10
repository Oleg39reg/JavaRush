package Boolean;

public class Example2 {
    static public void main(String[]args){
        int min = 0;
        int max = 100;
        int temp = -20;
        boolean isIce = (temp<min);//true
        boolean isSteam = (temp>max);//false
        System.out.println(isIce+" "+isSteam);
    }
}
