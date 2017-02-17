package stopwatch;

/**
 * Append chars to StringBuilder.
 * 
 * @author Pasut Kittiprapas
 *
 */
public class AppendStringBuilder implements Runnable {
	int count;
	String result;

	/**
	 * Initialize the AppendStringTask with a specific size.
	 * 
	 * @param count
	 */
	public AppendStringBuilder(int count) {
		this.count = count;
		this.result = "";
	}

	/**
	 * Add char 'a' to the StringBuilder until it reaches final size and print
	 * 
	 * the result length to the console.
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < count) {
			builder = builder.append(CHAR);
		}
		// now create a String from the result, to be compatible with task 1.
		this.result = builder.toString();

	}

	public String toString() {
		return String.format("Append %,d chars to StringBuilder\n", count)
				+ String.format("final string length = " + result.length());
	}
}
