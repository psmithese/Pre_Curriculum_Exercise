package UnderstandingAlgorithm;

public class SumArray {
    public static void main(String[] args) {
        //declare the sum which is the total of the integers
        int sum = 0;

        //declare the array
        int [] nums = {2,4,6,8,10};

        //Create a loop for the entire array and add them to the integer sum
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }

        System.out.println(sum);
    }

}
