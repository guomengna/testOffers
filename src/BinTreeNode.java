import javax.swing.tree.TreeNode;
import java.util.Enumeration;

public class BinTreeNode implements TreeNode {
    public BinTreeNode left;
    public BinTreeNode right;
    public TreeNode getChildAt(int childIndex){
        return null;
    }

    public int getChildCount(){
        return 0;
    }

    public TreeNode getParent(){
        return null;
    }

    public int getIndex(TreeNode node){
        return 0;
    }

    public boolean getAllowsChildren(){
        return false;
    }

    public boolean isLeaf(){
        return false;
    }
    public Enumeration children(){
        return null;
    }

}
