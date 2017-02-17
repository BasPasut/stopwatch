package stopwatch;

import java.math.BigDecimal;

/**
 * Add BigDecimal objects from an array.
 * 
 * @author Pasut Kittiprapas
 *
 */
public class TestSumBigDecimal implements Runnable {
	int counter;
	static final int ARRAY_SIZE = 500000;
	BigDecimal sum;

	public TestSumBigDecimal(int counter) {
		this.counter = counter;
		this.sum = new BigDecimal(0.0);
	}

	@Override
	public void run() {
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			this.sum = this.sum.add(values[i]);
		}
	}

	public String toString() {
		return String.format("Sum array of BigDecimal with count=%,d\n", counter) + String.format("sum = " + this.sum);
	}
}
