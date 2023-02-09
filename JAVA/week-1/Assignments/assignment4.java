import java.util.Scanner;
public class assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
        int result=0;

        int sum=0;
        int org=n;
        while(n>0)
        {
            sum+=Math.pow(n%10,3);
            n/=10;
        }
        if(sum==org)
        {
            result=1;
        }
        System.out.print(result);

    }
}
