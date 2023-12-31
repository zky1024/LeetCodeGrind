package lc112_path_sum;


class SolutionLC112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (null == root) {
            return false;
        }
        int val = root.val;
        if (targetSum == val) {
            if (null == root.left && null == root.right) {
                return true;
            } else {
                return hasPathSum(root.left, targetSum - val) || hasPathSum(root.right, targetSum - val);
            }
        } else {
            return hasPathSum(root.left, targetSum - val) || hasPathSum(root.right, targetSum - val);
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}