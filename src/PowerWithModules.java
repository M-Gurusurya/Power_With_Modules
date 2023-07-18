import java.util.Scanner;

public class PowerWithModules {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int C=scanner.nextInt();
        System.out.println(findPowerWithModules(A,B,C));
    }
    public static int findPowerWithModules(int A,int B,int C)
    {
        int result=1;
        for(int i=0;i<B;i++)
        {
            result=(result*A)%C;
        }
        return result%C;
    }
}
