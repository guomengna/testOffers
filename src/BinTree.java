import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树
 * @author guomn
 *
 */
public class BinTree{
    public BinTree lchild;//左孩子
    public BinTree rchild;//右孩子
    public BinTree root;//根
    public int data;//数据域
    ArrayList<Integer> temp = new ArrayList<>();

    private List<BinTree> datas;//存储所有的节点
    public BinTree(BinTree lchild, BinTree rchild, int data) {
        super();
        this.lchild=lchild;
        this.rchild=rchild;
        this.data=data;

    }

    public void setData(int data) {
        this.data = data;
    }

    public void setDatas(List<BinTree> datas) {
        this.datas = datas;
    }

    public void setLchild(BinTree lchild) {
        this.lchild = lchild;
    }

    public void setRchild(BinTree rchild) {
        this.rchild = rchild;
    }

    public void setRoot(BinTree root) {
        this.root = root;
    }

    public BinTree getLchild() {
        return lchild;
    }

    public BinTree getRchild() {
        return rchild;
    }

    public List<BinTree> getDatas() {
        return datas;
    }


    public BinTree(int data) {
        this(null,null,data);
    }
    public BinTree() {
        super();
    }

    public void createTree(int[] objs) {

        datas=new ArrayList<BinTree>();
        for(int i:objs) {
            datas.add(new BinTree(i));
        }
        root=datas.get(0);//将第一个作为根节点
        temp.add(root.data);
        for(int i=0;i<objs.length/2;i++) {
            datas.get(i).lchild=datas.get(i*2+1);
            if(i*2+2<datas.size()) {
                datas.get(i).rchild=datas.get(i*2+2);
            }
        }
    }
    //先序遍历
    public void preorder(BinTree root) {
        if(root!=null) {
            visit(root.getData());
            preorder(root.lchild);
            preorder(root.rchild);
        }
    }
    //中序遍历
    public void inorder(BinTree root) {
        if(root!=null) {
            inorder(root.lchild);
            visit(root.getData());
            inorder(root.rchild);
        }
    }
    //后序遍历
    public void afterorder(BinTree root) {
        if(root!=null) {
            inorder(root.lchild);
            inorder(root.rchild);
            visit(root.getData());
        }
    }

    private void visit(int obj) {
        System.out.print(obj+" ");
        temp.add(obj);
    }
    public int getData() {
        return data;
    }
    public BinTree getRoot() {
        return root;
    }

    public ArrayList<Integer> getTemp() {
        return temp;
    }
}
