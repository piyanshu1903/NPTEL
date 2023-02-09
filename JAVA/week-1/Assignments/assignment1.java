import java.util.Scanner;
public class assignment1 {
    

    public static void main(String[] args) {

	 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
      //define size of array
       s = input.nextInt();
     //The array is defined "arr" and inserted marks into it.
      int[] arr = new int[s];   
      for(i=0;i<arr.length;i++)
	  {
	arr[i]=input.nextInt();
        }
        result=arr[0];
        float avgMarks=0;
      for(i=0;i<arr.length;i++)
	  {
        avgMarks+=arr[i];
            
            if(arr[i]>result)
            {
                result=arr[i];
            }
        }
        avgMarks/=arr.length;
        System.out.print(result+"\n"+avgMarks);

    }
        


}