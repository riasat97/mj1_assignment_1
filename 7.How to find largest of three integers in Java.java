package output;
import java.util.Scanner; 

public class LargestOfThree {
    
    private static int largestNumber(int a, int b) {
       
        return (a>b)?a:b;
    }
    public static void main(String args[]){
        int[] num = new int[3];
        Scanner scan = new Scanner(System.in);  // Reading from System.in
        
        for(int i=0;i<num.length;i++){
            System.out.println("Enter a number: ");
             num[i] = scan.nextInt();
        }
        int largestNumber=largestNumber(num[0],num[1]);
        largestNumber=largestNumber(largestNumber,num[2]);
        System.out.println("largest number among "+num[0]+", "+num[1]+" and "+
                 num[2]+ " is : "+largestNumber);
    }

    
    
}
