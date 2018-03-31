package output;
import java.util.Scanner; 
import java.util.Arrays;
public class RemoveDuplicate {
    
     private static int noOfDistinctArray(int[] num) {
         
         int n=1;
         for(int i=0;i<num.length-1;i++){
             if(num[i]!=num[i+1])n++;
         }
         return n;
     }
   
     private static int[] removeDuplicates(int[] num) {
       if (num == null || num.length == 0) return num;  
       Arrays.sort(num);
       int n=noOfDistinctArray(num);
      // System.out.println("Distinct no       : " + n);
       int res[]=new int[n],i;
       n=0;
       for( i=0;i<num.length-1;i++){
           if(num[i]!=num[i+1])res[n++]=num[i];
       }
       res[n++]=num[i];
       return res;
    }
    public static void main(String args[]){
        int[] num = new int[5];
        Scanner scan = new Scanner(System.in);  // Reading from System.in
        
        for(int i=0;i<num.length;i++){
            System.out.println("Enter a number: ");
             num[i] = scan.nextInt();
        }
         
            System.out.println("Array with Duplicates       : " + Arrays.toString(num));
            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(num)));
        
    } 
}
