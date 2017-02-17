package stopwatch;

/**
 * Append chars to String.
 * 
 * @author Pasust Kittiprapas
 *
 */
public class AppendString implements Runnable {
	int count;
	String result;
	final char CHAR;

	/**
	 * Initialize the AppendStringTask with a specific size.
	 * 
	 * @param size
	 * 
	 */
	public AppendString(int count) {
		this.count = count;
		this.result = "";
		this.CHAR = 'a';
	}

	/**
	 * Add char 'a' to the String until it reaches final size and print the
	 * result length to the console.
	 */
	@Override
	public void run() {
		
		int k = 0;
		while (k++ < count) {
			this.result = this.result + this.CHAR;
		}

	}

	public String toString() {
		return String.format("Append %,d chars to String\n", this.count)
				+ String.format("final string length = %d", result.length());

	}
}
