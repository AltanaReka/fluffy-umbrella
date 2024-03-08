import java.util.Random;

public class RandomSent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] sentence = new String [args.length];
		for (int i= 0; i<args.length; i++) {
			sentence[i] = args[i];
		}
		String [] shuffled = new String[sentence.length];
		
		do {
			
			for (int i= sentence.length-1; i>=0; i--) {
				Random random = new Random();
				int idx = random.nextInt(sentence.length);
				shuffled[idx] = sentence[i];
			}
			
			printSent(shuffled);
			System.out.println();
		} while (!sameArray(sentence, shuffled));
	}
	
	public static void printSent(String[] sent) {
		
		for (String element : sent ) {
			System.out.print(element + " ");
		}
	}
	
	public static boolean sameArray(String[] sent, String[] shuffle) {
		
		for (int i= 0; i<sent.length; i++) {
			if (!sent[i].equals(shuffle[i])) {
				return false;
			}
		} return true;
	}
	

}
