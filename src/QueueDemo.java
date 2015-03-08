class Queue{
	char q[];
	private int putidx,getidx;
	
	public Queue(int i){
		q = new char[i];
		putidx = getidx = 0;
	}
	
	public char put(char c){
		if(putidx == q.length){
			System.out.println(" Queue is full");
			return c;
		}
		q[putidx++] = c;
		return c;
	}
	
	public char get(){
		if(getidx == putidx){
			System.out.println(" Queue is empty");
			return (char) 0;
		}
		return q[getidx++];
	}
}
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;
		
		System.out.println("Using bigQ to store Alphabet");
		for(i = 0;i<26;i++)
			bigQ.put((char)('A' + i));
		
		System.out.println("Content of bigQ");
		for(i = 0;i<26;i++){
			ch = bigQ.get();
			if(ch != (char)0) System.out.print(ch);
		}
		
		System.out.println('\n');
		
		System.out.println("Using smallQ to genenrate error");
		for(i = 0;i<5;i++){
			System.out.print("Attempting to store " + (char)('Z'-i ) );
			smallQ.put((char)('Z'-i));
			System.out.println();
		}
		
		System.out.print("Contents of small queue");
		for(i = 0;i<5;i++){
			ch = smallQ.get();
			
			if(ch != (char)0) System.out.print(ch);
		}
	}

}
