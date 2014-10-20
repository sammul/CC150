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

	public static void findMissingInt(String filename){
		Scanner s = new Scanner(new FileReader(filename));
		long size = Integer.MAX_VALUE-Integer.MIN_VALUE;
		byte[] field = new byte[0xFFFFFFFF/8];
		while(s.hasNextInt()){
			long v = s.nextInt();
			v = v-Integer.MIN_VALUE;
			field[l/8] |= 1<<(l%8);
		}
		for(int i=0; i<field.length; i++){
			for(int j=0; j<8; j++){
				if(field[i] & (1<<j) == 0){
					long l = i*8+j;
					System.out.println(l+Integer.MIN_VALUE);
				}
			}
		}
	}
}