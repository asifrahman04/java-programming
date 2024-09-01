 import java.util.Scanner;

public class fseries {

    public static void main(String[] args) {
        int num,num1=0,num2=1,num3,i;
        Scanner n= new Scanner(System.in);
        System.out.println("enter the number that u want find fibo sereis");
        num= n.nextInt();
        System.out.print(num1+""+num2);
        for(i=2;i<num;i++)
        {
          num3= num1+num2;
          System.out.print(""+num3);
          num1=num2;
          num2=num3;
          n.close();
        }
        
        
   

                              }
}
