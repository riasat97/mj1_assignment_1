package output;
import java.util.ArrayList;
import java.util.Scanner; 
import java.util.Arrays;
public class MissingNumberInArray {
    
    public static void main(String args[]){
        int[] arr1 = {1,2,3,4,5,10},arr2={2,3,1,0,5};
         ArrayList<Integer> missing = new ArrayList<>();
        int i,j,n=0;
        for( i=0;i<arr1.length;i++){
           for( j=0;j<arr2.length;j++){
               if(arr1[i]== arr2[j]){
                   break;
               }            
           }
             if(j==arr2.length){
              missing.add(arr1[i]);
             }     
       }
         
            System.out.println("Array 1 : " + Arrays.toString(arr1));
            System.out.println("Array 2 : " + Arrays.toString(arr2));
            System.out.println("Missing elements in array 2  : ");
            for(i=0;i<missing.size();i++)
            System.out.println("  " +missing.get(i));        
    } 
}
