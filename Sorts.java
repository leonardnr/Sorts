/**
 * Sorts
 *
 * 		Quadratic sorts
 */
import java.util.Random;
public class Sorts{
	public static void main(String[] args) {
		int[] nums  = randomArray(5, -300, 0);
		print(nums);
		print(bubbleSorts(nums));

		// int[] nums  = randomArray(5, -1000, 1000);
		// print(nums);
		// print(selectionSorts(nums));
		
		// int[] nums  = randomArray(5, -300, 0);
		// print(nums);
		// print(insertionSorts(nums));
		




	}
	/**
	 * insertionSorts
	 * 		sorts an array numerically
	 *
	 * @param  nums - array to be sorted
	 * @return  sorted array
	 */
	public static int[] insertionSorts(int[] nums){
  		for (int i = 1; i < nums.length; i++){
  			int j = i;
  			int b = nums[i];
  			while ((j > 0) && (nums[j-1] > b)){
  				nums[j] = nums[j-1];
  				j--;
  			}
 			nums[j] = b;
  		}

  		return nums;
	}

	/**
	 * bubbleSorts
	 *
	 * 		sorts an array numerically
	 *
	 * @param nums - array to be sorted
	 * @return sorted array
	 */
	public static int[] bubbleSorts(int[] nums){
		boolean hasMadeSwitcheroo = true;

		while(hasMadeSwitcheroo){
			hasMadeSwitcheroo = false;
			for(int i = 0; i < nums.length; i++){
				if(i < nums.length - 1){
					if(nums[i] > nums[i + 1]){
						int temp = nums[i];
						nums[i] = nums[i + 1];
						nums[i + 1] = temp;
						hasMadeSwitcheroo = true;
					}
				}
			}
		}

		return nums;
	}

	/**
	 * selectionSorts
	 *
	 * @param  nums - the array to be sorted
	 * @return  the sorted array
	 */
	public static int[] selectionSorts(int[] nums){
		int max = 0;
		int switchSpot = 0;

		for(int i = 0; i < nums.length; i++){
			max = nums[i];
			switchSpot = i;
			for(int j = i; j < nums.length; j++){
				if(nums[j] < max){
					max = nums[j];
					switchSpot = j;
				}
			}
			int temp = nums[i];
			nums[i] = max;
			nums[switchSpot] = temp;

		}

		return nums;
	}
	/**
	 * randomArray
	 *
	 * 		returns an array with random ints in it
	 *
	 * @param length - length of the array
	 * @param min - min value of any int in the array
	 * @param max - max value of any int in the array
	 *
	 * @return an array and random ints
	 */
	public static int[] randomArray(int length, int min, int max){
		Random r = new Random();
		int[] nums = new int[length];

		for(int i = 0; i < length; i++){
			nums[i] = r.nextInt((max + 1) - min) + min;
		}

		return nums;
	}

	/**
	 * print
	 *
	 * 		prints a given array in a beaticous fashion
	 * 
	 * @param  numPrint the array to printed out in a prety fashion
	 */
	public static void print(int[] numPrint){
		System.out.print("[");
		for(int i = 0; i < numPrint.length; i++){
			System.out.print(numPrint[i]);
			if(i < numPrint.length - 1){
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.println();
	}	
}