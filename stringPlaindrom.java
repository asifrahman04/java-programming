   

   public class stringPlaindrom {
    public static void main(String [] args){
        String s="java";
        String rev="0"; 
        for(int i=s.length();i>=0;i--)
        {
        rev=rev+s.charAt(i);
        }
        String s1=rev;
        if(s.equals(s1))
        {
            System.out.println("plaindrome");
        }
        else{
            System.out.println("not plaindome");
        }

    }
   
    
    
}
