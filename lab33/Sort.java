package lab33;

import java.util.Arrays;

public class Sort {
	static <E> void swap(E[] array, int i, int j) {
		E temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	static <E extends Comparable<E>> void bubbleSort(E[] array) {
		int n = array.length;
		for(int i = 0; i < n - 1; i++) {
			boolean flag = false;
			for(int j = 0; j < n - 1 - i; j++) {
				if(array[j].compareTo(array[j+1]) > 0) {
					swap(array, j, j+1);
					flag = true;
				}
			}
			if(flag == false) {
				break;
			}
		}
	}
	static <E extends Comparable<E>> void mergeSort(E[] array) {
		if(array.length > 1) {
			int mid = array.length / 2;
			E[] leftArray = Arrays.copyOfRange(array, 0, mid);;
			E[] rightArray = Arrays.copyOfRange(array, mid, array.length); 
			
			mergeSort(leftArray);
			mergeSort(rightArray);
			
			merge(array,leftArray, rightArray);
		}
	}
	static <E extends Comparable<E>> void merge(E[] array, E[] leftArray, E[] rightArray) {
		int i = 0, j = 0, k = 0;
		while(i < leftArray.length && j < rightArray.length) {
			if(leftArray[i].compareTo(rightArray[j]) > 0) {
				array[k++] = leftArray[i++];
			}
			else array[k++] = rightArray[j++];
		}
		while(i < leftArray.length) {
			array[k++] = leftArray[i++];
		}
		while(j < rightArray.length) {
			array[k++] = rightArray[j++];
		}
	}
}