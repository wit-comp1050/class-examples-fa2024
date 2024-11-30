package examples;

public class Arrays {

	public static void main(String[] args) {
		int a = 5;
		int[] nums = new int[3]; // pre-filled with 0
		System.out.println(a);
		System.out.println(nums); // print memory reference
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
//		//System.out.println(nums[3]); // avoid index out of bound exception
//		
//		changing array values
//		
		nums[0] = 6;
		System.out.println(nums[0]); // prints 6
//		
//		
		//assigning array content while creating array instance 
//		
		int[] x = {7, 4, 8, 0}; 
		System.out.println(x[2]); // prints 8
//		
		x[3] = x[1] + x[0]; // {7, 4, 8, 11}
		System.out.println(x[3]); // prints 11
//		
		x[3] += x[2]; // 8 + 11 = 19 ------ {7, 4, 8, 19}
//		
		System.out.println(x[3]);//prints 19 
//		
		System.out.println(x.length); // prints 4
//		
		for (int i = 0; i<x.length; i++) {
			System.out.printf("%d ", x[i]);
		}

	}

}
