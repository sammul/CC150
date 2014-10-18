public class Hard{
	//20.1 Add two numbers without using +
	public static int add(int num1, int num2){
		int sum = num1 ^ num2;
		int carry = (num1&num2)<< 1;
		return add(sum,carry);
	}

	//20.2 Shuffle cards, randomly order the card
	public static void shuffle(int[] cards){
		int temp, index;
		for(int i=0; i<cards.length; i++){
			index = (int)(Math.random()*(cards.length-i))+i;
			temp = cards[index];
			cards[index] = cards[i];
			cards[i] = temp;
		}
	}

	//20.3 Randomly generate a set of m integers from an array of size n with equal probability
	public static int[] generate(int[] array, int m){
		int n = array.length;
		int[] res = new int[m];
		for(int i=0; i<m; i++){
			int index = (int)(Math.random()*(n-i))+i;
			res[i] = array[index];
			array[index] = array[i];
		}
		return res;
	}

	//20.9 Ger and maintain median of a long sequence of number
	Private PriorityQueue<Integer> maxHeap, minHeap;
	public int getMedian(){
		if(maxHeap.isEmpty())
			return minHeap.peek();
		else if(minHeap.isEmpty())
			return maxHeap.peek();
		else{
			if(maxHeap.size()==minHeap.size())
				return (maxHeap.peek()+minHeap.peek())/2;
			else if(maxHeap.size()>minHeap.size())
				return maxHeap.peek();
			else
				return minHeap.peek();
		}
	}
	public void addNew(int randNum){
		if(maxHeap.size()==minHeap.size()){
			if((minHeap.peek()!=null && minHeap.peek()<randNum)){
				maxHeap.offer(minHeap.poll());
				minHeap.offer(randNum);
			}
			else
				max.offer(randNum);
		}
		else{
			if(randNum<maxHeap.peek()){
				minHeap.offer(maxHeap.poll());
				maxHeap.offer(randNum);
			}
			else
				minHeap.offer(randNum);
		}
	}
}