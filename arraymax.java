public class arraymax {
    public static void main(String [] args){
        int arr [] = {98,23,85,65};
        int max= arr[0];
        int min= arr[0];
         for( int i=0;i<arr.length;i++)
         {
             if(arr[i]> max)
             {
                 max = arr[i];
             }
             if(arr[i]< min)
             {
                 min=arr[i];
             }
         }
         
             System.out.println("min elemennt:"+min);
             System.out.println("max element:"+max);
     }
 
     
    
}
