import java.util.Scanner;
    
    public class add {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.println("enter the first num");
      int  num1= n.nextInt();
      System.out.println("enter the second num");
      int num2= n.nextInt();
      System.out.println("enter the third num");
        int num3=n.nextInt();
        if(num1>num2)
        {
            System.out.println("latgest number is" +num1);

        }
        else if(num2>num3)
        {
            System.out.println("largest num is"+num2);
        }
        else
        {
            System.out.println("largest num is "+num3);
        }

    n.close();
    }
    
}
