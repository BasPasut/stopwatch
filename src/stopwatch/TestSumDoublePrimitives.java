package stopwatch;

/**
 * Add double primitives from an array.
 * 
 * @author Pasut Kittiprapas
 *
 */
public class TestSumDoublePrimitives implements Runnable {
	int counter;
	static final int ARRAY_SIZE = 500000;
	double sum;

	public TestSumDoublePrimitives(int counter) {
		this.counter = counter;
		this.sum = 0.0;
	}

	@Override
	public void run() {
		Stopwatch timer = new Stopwatch();
		// create array of values to add before we start the timer
		double[] values = new double[ARRAY_SIZE];
		for (int k = 0; k < ARRAY_SIZE; k++)
			values[k] = k + 1;
		timer.start();
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0; // reuse the array when get to last value
			this.sum = this.sum + values[i];
		}
	}

	public String toString() {
		return String.format("Sum array of double primitives with count=%,d\n", counter)
				+ String.format("sum = " + this.sum);
	}
}
