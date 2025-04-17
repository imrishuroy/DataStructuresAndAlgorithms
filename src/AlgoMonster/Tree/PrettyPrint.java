package AlgoMonster.Tree;

public class PrettyPrint {
    private static final String INDENT_PER_LEVEL = "  ";

    public static void main(String[] args) {

        // Constructing the example tree:
        //      /
        //    foo
        //      baz
        //    bar
        TreeNode<String> root = new TreeNode<>("/");
        root.left = new TreeNode<>("foo");
        root.left.left = new TreeNode<>("baz");
        root.right = new TreeNode<>("bar");

        PrettyPrint printer = new PrettyPrint();
        System.out.println("Pretty Printed Tree:");
        printer.prettyPrint(root);


    }

    public void prettyPrint(TreeNode<String> root){
        dfs(root, "");
    }

    public void dfs(TreeNode<String> node, String indentLevel){
        if (node == null) {
            return;
        }
        String currentIndentLevel = indentLevel + INDENT_PER_LEVEL;
        System.out.println(currentIndentLevel + node.val);
        dfs(node.left, currentIndentLevel);
        dfs(node.right, currentIndentLevel);
    }
}
