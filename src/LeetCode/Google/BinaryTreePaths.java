/**
 * @author Maddy
 * Ver 1.0 Oct 24, 2017 12:49:46 AM
 * Given a binary tree, return all root-to-leaf paths.
 * Ex:
 * I/P:
 *    1
 *	/   \
 * 2     3
 *  \
 *   5
 * O/P: ["1->2->5", "1->3"]
 */

package LeetCode.Google;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		System.out.println(binaryTreePaths(root));
	}

	/**
	 * @param root
	 */
	private static List<String> binaryTreePaths(TreeNode root) {
		List<String> paths = new ArrayList<String>();
		if (root != null) {
			binaryTreePaths(root, paths, "");
		}
		return paths;
	}

	/**
	 * @param root
	 * @param paths
	 * @param string
	 */
	private static List<String> binaryTreePaths(TreeNode root, List<String> paths, String path) {
		if (root.left == null && root.right == null) {
			paths.add(path + root.val);
		}
		if (root.left != null) {
			binaryTreePaths(root.left, paths, path + root.val + "->");
		}
		if (root.right != null) {
			binaryTreePaths(root.right, paths, path + root.val + "->");
		}
		return paths;
	}

}

/**
 * Definition for a binary tree node.
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
