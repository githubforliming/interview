package strategy;

/**
 * 排序
 * 
 * @author LM
 *
 */
public class Sorter<T> {
	// 选择排序 每次把最小的放i对应下表
//	public static void sort(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			int minPos = i ;
//			for (int j = i+1; j < arr.length; j++) {
//				minPos = arr[j] < arr[minPos] ? j :minPos; 
//			}
//			// 交换位置
//			swap(arr,i,minPos);
//		}
//	}
	/**
	 * 
	 * @param arr
	 * @param i
	 * @param minPos
	 */
//	private static void swap(int[] arr, int i, int minPos) {
//		int tmp = arr[i];
//		arr[i] = arr[minPos];
//		arr[minPos] = tmp;
//	}

	// 选择排序 每次把最小的放i对应下表
//	public static void sort(Cat[] arr) {
//			for (int i = 0; i < arr.length; i++) {
//				int minPos = i ;
//				for (int j = i+1; j < arr.length; j++) {
//					minPos = arr[j].compareTo(arr[minPos]) == -1 ? j :minPos; 
//				}
//				// 交换位置
//				swap(arr,i,minPos);
//			}
//		}
	/**
	 * 
	 * @param arr
	 * @param i
	 * @param minPos
	 */
//		private static void swap(Cat[] arr, int i, int minPos) {
//			Cat tmp = arr[i];
//			arr[i] = arr[minPos];
//			arr[minPos] = tmp;
//		}

	// 选择排序 每次把最小的放i对应下表
//		@SuppressWarnings("unchecked")
//		public static void sort(MyComparable[] arr) {
//				for (int i = 0; i < arr.length; i++) {
//					int minPos = i ;
//					for (int j = i+1; j < arr.length; j++) {
//						minPos = arr[j].compareTo(arr[minPos]) == -1 ? j :minPos; 
//					}
//					// 交换位置
//					swap(arr,i,minPos);
//				}
//		}
	/**
	 * 
	 * @param arr
	 * @param i
	 * @param minPos
	 */
//			private static void swap(MyComparable[] arr, int i, int minPos) {
//				MyComparable tmp = arr[i];
//				arr[i] = arr[minPos];
//				arr[minPos] = tmp;
//			}

	// 选择排序 每次把最小的放i对应下表
	public void sort(T[] arr, MyComparator<T> comparator) {
		for (int i = 0; i < arr.length; i++) {
			int minPos = i;
			for (int j = i + 1; j < arr.length; j++) {
				minPos = comparator.compare(arr[j], arr[minPos]) == -1 ? j : minPos;
			}
			// 交换位置
			swap(arr, i, minPos);
		}
	}

	/**
	 * 
	 * @param arr
	 * @param i
	 * @param minPos
	 */
	void swap(T[] arr, int i, int minPos) {
		T tmp = arr[i];
		arr[i] = arr[minPos];
		arr[minPos] = tmp;
	}
}
