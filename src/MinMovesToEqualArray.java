/**
 * 
 * @author Sam
 *
 */
public class MinMovesToEqualArray {
	
	public static int minMoves(int[] nums){
		if (nums.length == 1){
			return 0; // A array of length 1 is an array with all equal elements
		}
		int initialSum = 0;
		int minimum = -99;
		for(int i = 0; i < nums.length; i++){
			initialSum += nums[i];
			if (minimum == -99){
				minimum = nums[i];
			} else if(minimum > nums[i]) {
				minimum = nums[i];
			}
		}
		return initialSum - minimum * nums.length;
	}

	public static void main(String[] args) {
		int[] testArray = {1,2,3};
		System.out.println(minMoves(testArray));

	}

}
