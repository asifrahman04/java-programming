import java.util.Scanner;
public class pattern {
    public static void main(String [] args){
        int num,i,j;
        Scanner n = new Scanner(System.in);
        System.out.println("enter the number");
        num=n.nextInt();
        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print( j);
            }
                    System.out.println(" ");

        }


    }
    
}
