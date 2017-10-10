/**
 * @author Maddy
 * Ver 1.0 Oct 9, 2017 7:33:41 PM
 * Given two 1d vectors, implement an iterator to return their elements alternately.
 * Ex:
 * I/P:
 * v1 = [1, 2]
 * v2 = [3, 4, 5, 6]
 * O/P:
 * [1, 3, 2, 4, 5, 6]
 */

package LeetCode.Google;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ZigzagIterator {

	private Iterator i, j, temp;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Your ZigzagIterator object will be instantiated and called as such:
		 * ZigzagIterator i = new ZigzagIterator(v1, v2); while (i.hasNext()) v[f()] =
		 * i.next();
		 */
		List<Integer> v1 = new ArrayList<Integer>();
		v1.add(1);
		v1.add(2);
		List<Integer> v2 = new ArrayList<Integer>();
		v2.add(3);
		v2.add(4);
		v2.add(5);
		v2.add(6);
		ZigzagIterator i = new ZigzagIterator(v1, v2);
		List<Integer> v = new ArrayList<Integer>();
		while (i.hasNext()) {
			v.add(i.next());
		}
		for (int item : v) {
			System.out.println(item);
		}
	}

	/**
	 * @return
	 */
	private int next() {
		if (i.hasNext()) {
			temp = i;
			i = j;
			j = temp;
		}
		return (int) j.next();
	}

	/**
	 * @return
	 */
	private boolean hasNext() {
		return i.hasNext() || j.hasNext();
	}

	/**
	 * Constructor
	 */
	public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
		i = v1.iterator();
		j = v2.iterator();
	}

}
