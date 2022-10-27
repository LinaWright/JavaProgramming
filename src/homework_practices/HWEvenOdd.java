package homework_practices;

public class HWEvenOdd {
    public static void main(String[] args) {

int[] number = {4,1,3,12,5};

int even = 0;
int odd = 0;
        for (int i = 0; i < number.length; i++) {
          if(number[i]%2==0){
              even += 1;
          }else{
              odd += 1;
          }
        }
        System.out.println(even);
        System.out.println(odd);
}
}
/*
for each loop

        for(int number: nums){

            if(number % 2 == 0){
                even++;
                evenNums += number + " ";
            } else {
                odd++;
                oddNums += number + " ";
            }

        }
 */
/*
int[] nums = {4, 1, 3, 12, 5, 20, 13};
        int even = 0;
        int odd = 0;
        String evenNums = "";
        String oddNums = "";

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                even++;
                evenNums += nums[i] + " ";
            } else {
                odd++;
                oddNums += nums[i] + " ";
            }

        }

        System.out.println("Even counter: " + even);
        System.out.println("Even numbers: " + evenNums);

        System.out.println("Odd counter: " + odd);
        System.out.println("Odd numbers: " + oddNums);

Average Number from Array
Given an int array calculate the average number
-> Make it flexible so it will work with any array size
Examples:
[1,2,3] -> average: 2
[10, 15, 5, 6] -> average: 9
[4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
 */