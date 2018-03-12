package output;
//program to find the second highest number in an interger array

public class SecondLargest
{
    public  void sort(int[] arr){
        
        int temp;
        int size=arr.length-1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
	public static void main(String[] args)
	{
            Output obj=new Output();
            int arr[]={5,10,3,4,9};
            
            obj.sort(arr);
            System.out.println("The numbers are :");
            for(int i=0;i<arr.length;i++){
                System.out.println(" "+arr[i]);
            }
            System.out.println("The second highest number is :"+arr[1]);
       	}
}