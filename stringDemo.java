public class stringDemo {
    public static void main(String[] args ) 
    {
        String s1="haii";
        String s2= "hallo";
        if(s1==s2)
        {
            System.out.println("same content");
        }
        else{
            System.out.println("not same content");
    
    }
    System.out.println(s1. charAt(2));
    System.out.println(s1.length());
    System.out.println(s2.length());
     String s3=s1.concat(s2);
     
     System.out.println( " "+s3 );
     System.out.println(s1.equals(s2));
     String s4="sara love asif";
     String s5=s4.replace("love", "dont love");
     System.out.println(s5);
     s1.toUpperCase();
     System.out.println(s1.indexOf('i'));

    
}
}
