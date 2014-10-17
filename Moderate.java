public class Moderate{
	//19.1 swap two integers in place
	public static void swap(int a, int b){
		a = a-b;
		b = a+b;
		a = b-a;
	}

	//19.3 compute number of trailing zeros in n factorial
	public static int zeros(int num){
		int count = 0;
		for(int i=5; num/i>0; i*=5)
			count += num/i;
		return count;
	}

	//19.4 find maximum of two integers without using if-else
	public static int max(int n1, int n2){
		int c = n1-n2;
		int k = (c>>31) & 1;
		return n1-k*c;
	}

	//19.8 Design a method to find the frequency of occurrences of any given word in a book
	public static HashMap<String, Integer> createDic(String[] book){
		HashMap<String,Integer> wordMap = new HashMap<String,Integer>();
		for(String s: book){
			if(wordMap.containsKey(s))
				wordMap.put(s,wordMap.put(s)+1);
			else
				wordMap.put(s,1);
		}
	}
	public static int getFrequency(HashMap<String,Integer> map, String s){
		if(map.containsKey(s))
			return map.get(s);
		return 0;
	}

	//19.10 Implement rand7() by given rand5()
	//rand7: 1-7, rand5: 1-5
	public static int rand7(){
		while(true){
			int k = 5*(rand5()-1)*(rand5()-1); //k: 0-24
			if(k<=20)
				return (k+1)%7;
		}
	}
}