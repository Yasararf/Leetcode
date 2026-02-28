class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) return paths;
        
        if (root.left == null && root.right == null) {
            paths.add(String.valueOf(root.val));
            return paths;
        }
        
        for (TreeNode child : new TreeNode[]{root.left, root.right}) {
            if (child != null) {
                for (String path : binaryTreePaths(child)) {
                    paths.add(root.val + "->" + path);
                }
            }
        }
        
        return paths;
    }
}