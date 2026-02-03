package Arrays;
import java.util.*;
public class ArrayBasics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		System.out.println("Enter the array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		int sum=0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		System.out.println("Numbers divisible by 2 : ");
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			min = Math.min(min, arr[i]);
			max=Math.max(max, arr[i]);
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("Sum of elements : "+ sum);
		System.out.println("Minimum element : "+ min);
		System.out.println("Maximum element : "+ max);
	}
}
