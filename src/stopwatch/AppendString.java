package stopwatch;

/**
 * Append chars to String.
 * @author Pasust Kittiprapas
 *
 */
public class AppendString implements Runnable{
	int count;
	
	/**
	 * Initialize the AppendStringTask with a specific size.
	 * 
	 * @param size
	 *            
	 */
	public AppendString(int count){
		this.count = count;
	}
	
	/**
	 * Add char 'a' to the String until it reaches final size and print the
	 * result length to the console.
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		System.out.printf("Append %,d chars to String\n", count);
		String result = ""; 
		int k = 0;
		while(k++ < count) {
			result = result + CHAR;
		}
		System.out.println("final string length = " + result.length());
		
	}
}
