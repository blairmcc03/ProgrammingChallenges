import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int tests = s.nextInt();
        for(int i=0; i < tests; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = a % b;
            System.out.println(c);
        }
    }
}
