package Recursion.SingleBranch;

import java.util.ArrayList;

public class ArraySearchWithVoid {

    public static void search(int arr[], int search, int index, ArrayList<Integer> list)
    {
        if(arr.length==index)
        {
            System.out.println(list);
            return;
        }
        if(arr[index]==search)
        {
            list.add(index);
        }
        search(arr,search,index+1,list);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,5,14,10,15,10,21,19,10};
        int search = 10;
        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        search(arr,search,index,list);
    }
}
