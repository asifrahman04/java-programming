import java.util.ArrayList;
import java .util.List;

public class demo {
    public static void main(String[] args) {  
    List<Integer> l= new ArrayList<>();
    l.add(85);
    l.add(90);
    l.add(90);
    l.add(100);
    l.add(200);
     System.out.println(l);
     System.out.println( l.get( 2));
     l.remove( 2);
     System.out.println(l);
     System.out.println(l.indexOf(90));

    }
    }
