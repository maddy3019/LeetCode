/**
 * @author Maddy
 * Ver 1.0 Sep 23, 2017 9:04:05 PM
 * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.
 * Ex 1:
 * MovingAverage m = new MovingAverage(3);
 * m.next(1) = 1
 * m.next(10) = (1 + 10) / 2
 * m.next(3) = (1 + 10 + 3) / 3
 * m.next(5) = (10 + 3 + 5) / 3
 */

package LeetCode.Google;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindow {

	static int wSize;

	/** Initialize your data structure here. */
	List<Integer> window = new ArrayList<Integer>();

	/**
	 * @param size
	 */
	public SlidingWindow(int size) {
		wSize = size;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SlidingWindow obj = new SlidingWindow(3);
		double average = obj.next(1);
		System.out.println(average);
		double average1 = obj.next(10);
		System.out.println(average1);
		double average2 = obj.next(3);
		System.out.println(average2);
		double average3 = obj.next(5);
		System.out.println(average3);
	}

	/**
	 * @param val
	 * @return average
	 */
	private double next(int val) {
		double sum = 0;
		if (window.size() < wSize) {
			window.add(val);
		} else {
			window.remove(0);
			window.add(val);
		}
		for (Integer i : window) {
			sum += i;
		}
		return (double) sum / window.size();
	}
}
