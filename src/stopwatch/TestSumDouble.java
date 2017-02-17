package stopwatch;

/**
 * Add Double objects from an array.
 * 
 * @author Pasut Kittiprapas
 *
 */
public class TestSumDouble implements Runnable {
	int counter;
	static final int ARRAY_SIZE = 500000;
	Double sum;

	/**
	 * To intialize TestSumDouble with the counter.
	 * 
	 * @param counter
	 */
	public TestSumDouble(int counter) {
		this.counter = counter;
		this.sum = new Double(0.0);
	}

	@Override
	public void run() {
		Stopwatch timer = new Stopwatch();
		// create array of values to add, before we start the timer
		Double[] values = new Double[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);
		timer.start();
		// count = loop counter, i = array index
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			this.sum = this.sum + values[i];
		}
	}

	public String toString() {
		return String.format("Sum array of Double objects with count=%,d\n", counter)
				+ String.format("sum = " + this.sum);
	}
}
