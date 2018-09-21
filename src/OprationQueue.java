import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class OprationQueue {
    /**
     * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
     */
    //使用队列，根先入队。
    // 元素出队的时候讲他的左右两个孩子按顺序入队
    public void printBinTree(BinTree binTree){
        Queue<BinTree> queue = new LinkedList<BinTree>();
        List<Integer> a = new ArrayList<>();
        BinTree current = new BinTree();
        queue.add(binTree.getRoot());
        while((!queue.isEmpty())){
            current = ((LinkedList<BinTree>) queue).pop();
            if(current.lchild!=null){
                queue.add(current.lchild);
            }
            if(current.rchild!=null){
                queue.add(current.rchild);
            }
            a.add(current.data);
        }
        System.out.println("a.size is: "+a.size());
        for(int j=0;j<a.size();j++){
            System.out.println(a.get(j));
        }
    }

}
