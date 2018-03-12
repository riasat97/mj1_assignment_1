package output;
import java.util.Scanner; 

public class LargestSmallest {
    
    private static int largestNumber(int[] num) {
       
        int max=num[0];
        int n=num.length;
        int i=0;
        while(i<n){
            if(num[i]>max)
                max=num[i];
            i++;
        }
        return max;
    }
    private static int smallestNumber(int[] num) {
       
         int min=num[0];
         int n=num.length;
         int i=0;
         while(i<n){
            if(num[i]<min)
                min=num[i];
            i++;
         }
        return min;
    }
    public static void main(String args[]){
        int[] num = new int[5];
        Scanner scan = new Scanner(System.in);  // Reading from System.in
        
        for(int i=0;i<num.length;i++){
            System.out.println("Enter a number: ");
             num[i] = scan.nextInt();
        }
        int largestNumber=largestNumber(num);
        int smallestNumber=smallestNumber(num);
       
        System.out.println("The largest and smallest numbers among ");
         for(int i=0;i<num.length;i++){
            System.out.println(num[i]+"  ");
        }
        System.out.println("are :"+largestNumber+"(largest)  "+smallestNumber+
                "(smallest)");   
    }
    
}
