package Recursion.SingleBranch;

import java.util.ArrayList;

public class ArraySearch {
	static ArrayList<Integer> search(int[] arr, int search,int index)
	{
		if(arr.length==index)
		{
			ArrayList<Integer> list = new ArrayList<>();
			return list;
		}
		
		ArrayList<Integer> list = search(arr,search,index+1);
		if(arr[index] == 10)
		{
			list.add(index);
		}
		return list;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,10,15,10,25,30,10,45,10};
		int search = 10;
		int index = 0;
		ArrayList<Integer> list = search(arr,search,index);
		System.out.println(list);

	}

}
