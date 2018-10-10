import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

public class OperationTree {
    /**
     * 输入两棵二叉树A，B，判断B是不是A的子结构。
     * 空树不是任意一个树的子结构
     */
    public void ifSubTree(){
        BinTree treeA = new BinTree();
        int a[] = {1,2,3};
        treeA.createTree(a);
        BinTree treeB = new BinTree();
        int b[] = {1,2,3,4,5,6};
        treeB.createTree(b);
        treeA.preorder(treeA.getRoot());
        ArrayList<Integer> resultA = new ArrayList<>();
        ArrayList<Integer> resultB = new ArrayList<>();
        System.out.println("tree A ");
        resultA = treeA.getTemp();
        treeB.preorder(treeB.getRoot());
        System.out.println("tree B ");
        resultB = treeB.getTemp();
        if(resultA.size()<resultB.size()){
            System.out.println("tree A is smaller than tree B");
            int i=0;//A的长度
            int j=0;//B的长度
            int prepare=0;//对比长度
            ArrayList<Integer> pre = new ArrayList<>();
            while(i<treeA.getTemp().size()&&j<treeB.getTemp().size()){
                if(treeA.getTemp().get(i)==treeB.getTemp().get(j)){
                    //指针一起下移
                    i += 1;
                    j += 1;
                    prepare += 1;
                    pre.add(treeA.getTemp().get(i));
                    System.out.println("pre's size is: "+pre.size());
                }else if(treeA.getTemp().get(i)!=treeB.getTemp().get(j)){
                    for(int k=pre.size();k<treeB.getTemp().size();k++){
                        if(treeA.getTemp().get(i)==treeB.getTemp().get(k)){
                            System.out.println(treeB.getTemp().get(k)+"匹配");
                            pre.add(treeB.getTemp().get(k));
//                            System.out.println("pre's size is: "+pre.size());
                            break;
                        }
                    }
                    i += 1;
                }
            }
            System.out.println("pre's size is: "+pre.size());
            if(pre.size()==treeA.getTemp().size()){
                System.out.println("tree A is subtree of tree B");
            }
        }else if(resultA.size()>resultB.size()){
            System.out.println("tree B is smaller than tree A");
            int i=0;//A的长度
            int j=0;//B的长度
            int prepare=0;//对比长度
            ArrayList<Integer> pre = new ArrayList<>();
            while(i<treeA.getTemp().size()&&j<treeB.getTemp().size()){
                if(treeA.getTemp().get(i)==treeB.getTemp().get(j)){
                    //指针一起下移
                    i += 1;
                    j += 1;
                    prepare += 1;
                    pre.add(treeA.getTemp().get(i));
                    System.out.println("pre's size is: "+pre.size());
                }else if(treeB.getTemp().get(j)!=treeA.getTemp().get(i)){
                    for(int k=pre.size();k<treeA.getTemp().size();k++){
                        if(treeB.getTemp().get(j)==treeA.getTemp().get(k)){
                            System.out.println(treeA.getTemp().get(k)+"匹配");
                            pre.add(treeA.getTemp().get(k));
//                            System.out.println("pre's size is: "+pre.size());
                            break;
                        }
                    }
                    i += 1;
                }
            }
            System.out.println("pre's size is: "+pre.size());
            if(pre.size()==treeA.getTemp().size()){
                System.out.println("tree A is subtree of tree B");
            }
        }
    }

    /**
     * 操作给定的二叉树，将其变为源二叉树的镜像
     * 左右子树交换
     */

    public void exchangeLeftRight(BinTree tree){

        if(tree.getRoot()!=null){
            System.out.println("根节点不为空: "+tree.getRoot().data);
            BinTree temptree = tree.rchild;
            System.out.println("右孩子: "+tree.getRchild());
            tree.lchild = tree.getRchild();
            tree.rchild = temptree;
            if(tree.lchild!=null){
                exchangeLeftRight(tree.lchild);
                System.out.println("左孩子不为空"+tree.lchild.data);
            }
            if(tree.rchild!=null){
                exchangeLeftRight(tree.rchild);
                System.out.println("右孩子不为空");
            }
        }else {
            System.out.println("root is null");
        }
    }

    /**
     * 输入一棵二叉树，求该树的深度。
     * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，
     * 最长路径的长度为树的深度。
     */
    public int TreeDepth(BinTreeNode pRoot)    {
        if(pRoot == null){
            return 0;
        }
        Queue<BinTreeNode> queue = new LinkedList<BinTreeNode>();
        queue.add(pRoot);
        int depth = 0, count = 0, nextCount = 1;
        while(queue.size()!=0){
            BinTreeNode top = queue.poll();
            count++;
            if(top.left != null){
                queue.add(top.left);
            }
            if(top.right != null){
                queue.add(top.right);
            }
            if(count == nextCount){
                nextCount = queue.size();
                count = 0;
                depth++;
            }
        }
        return depth;
    }
}
