package strategy;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
//		int[] arr = {9,5,7,6,3,88,5,12};
//		Sorter sorter = new Sorter();
//		sorter.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
//		Cat[] arr = {new Cat(1),new Cat(23),new Cat(33),new Cat(4)};
//		Sorter sorter = new Sorter();
//		sorter.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
//		Dog[] arr = {new Dog(11),new Dog(2),new Dog(43),new Dog(8)};
//		Sorter sorter = new Sorter();
//		sorter.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		Cat[] arr = {new Cat(11),new Cat(2),new Cat(43),new Cat(8)};
		Sorter<Cat> sorter = new Sorter<Cat>();
		sorter.sort(arr,new CatComparatorOne());
		System.out.println(Arrays.toString(arr));
		sorter.sort(arr,new CatComparatorTwo());
		System.out.println(Arrays.toString(arr));
		// 策略 就是每次比较的时候 我需要传递一个比较策略  方便修改比较策略 
	}
}
