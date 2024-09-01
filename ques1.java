public class ques1 {
 public static boolean num(int arr[]){
    for(int i=0;i<arr.length;i++){
       int start=arr[i];
        for(int j=i+1;j<arr.length;j++){
           int second=arr[j];
            if(arr[i]==arr[j]){
                return true;
            }
            
        }
    }
    return false;
 }
 public static void main(String args[]){
    int arr[]={1,2,4,6,1};
    num(arr);

 }
    
}
