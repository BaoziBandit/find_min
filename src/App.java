import java.util.*;

public class App {
    public static void main(String[] args){
        int[] numbers = readIntegers();
        System.out.println("Min : " + findMin(numbers));
    } 

    public static int[] readIntegers(){
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[0];

        while(scan.hasNextInt()){
            int newNum = scan.nextInt();
            int[] newArray = new int[nums.length + 1];
            for(int i=0; i < newArray.length; i++)
            {
                if(i == nums.length)
                {
                    newArray[i] = newNum;
                }
                else
                    newArray[i] = nums[i];
            }
            nums = newArray;
        }

        scan.close();
        return nums;
    }

    public static int findMin(int[] nums){
        int min = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] < min)
            {
                min = nums[i];
            }
        }
        return min;
    }
}
