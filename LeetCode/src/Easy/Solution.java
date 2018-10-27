package Easy;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
	public static int numJewelsInStones(String J, String S) {
		int len = S.length();
		int count = 0;
		for (int i = 0; i < len; ++i) {
			if (J.indexOf(S.charAt(i)) >= 0) {
				++count;
			}
		}
		return count;
	}

	public static int climbStairs(int n) {
		double sqrt5 = 2.23606797749979;
		return (int) (sqrt5 / 5 * (Math.pow((1 + sqrt5) / 2, n * 1.0) - Math.pow((1 - sqrt5) / 2, n * 1.0)));
	}
}
