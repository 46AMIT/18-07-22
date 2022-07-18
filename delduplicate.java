import java.util.*; 
class delduplicate {
    public static void removeDuplicates(int[] a)
    {
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++)
		set.add(a[i]);
		System.out.print(set);
    }
		public static void main(String[] args)
    {
        int a[] = {3,3,4,5,7,8,9};
        removeDuplicates(a);
    }
	}