package Recursion.SingleBranch;

import java.util.ArrayList;

public class NArmStrongNumber {

	static int count = 0;
	public static int count(int start)
	{
		if(start == 0)
		{
			return 0;
		}
		
		count = count(start/10)+1;
		return count;
	}

	public static boolean isArmstrong(int num, int org, int result, int count)
	{
		if(num==0)
		{
			if(result == org)
		{
			return true;
		}
		else
		{
			return false;
		}
		}
		result = result +(int)Math.pow(num%10,count);
		boolean check = isArmstrong(num/10, org, result, count);
		return check;
	}

	public static ArrayList<Integer> getAllArmStrongList(int start, int end, ArrayList<Integer> list)
	{
		if(start==end)
		{
			return list;
		}
		if(isArmstrong(start,start,0,count(start)))
		{
			list.add(start);
		}
		getAllArmStrongList(start+1,end,list);
		return list;
	}
	

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		int start = 1;
		System.out.println(getAllArmStrongList(start, 1000, list));
	}

}
