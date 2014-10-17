public class SystemDesignAndMemoryLimit{
	/** 11.4
	* You have an array with number from 1 to N(less than 32000). You only have 4KB memory to use.
	* The array may have duplicate entries, print all duplicates.
	*/
	public static void checkDuplicates(int[] array){
		BitSet bs = new BitSet(32000);
		for(int a: array){
			int b = a-1;
			if(bs.get(b))
				System.out.println(a);
			else
				bs.set(b);
		}
	}

	
}