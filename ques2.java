public class ques2 {
    public static int add(int num[]){
                int watertrap=0;

        int leftmax[]= new leftmax[num.length];
        leftmax[0]=num[0];
        for(int i=1;i<leftmax.length;i++){
            leftmax[i]=Math.max(mum[i],leftmax[i-1]);
        }
        int rightmax[]=new rightmax[num.length];
        rightmax[rightmax.length-1]= num[num.length-1];
        for(int i=rightmax.length-2;j>0;i--){
            rightmax[i]=Math.max(num[i],rightmax[i+1]);
        }
        for(i=0;i<num.length;i++){
            int waterHeight= Math.min(leftmax[i],rightmax[i]);
            watertrap += waterHeight-num[i];
           return watertrap;
        }
        
    }
    public static void main(String args[]){
        int num={5,4,1,6,3};
        add(num);
    }
    }
    

