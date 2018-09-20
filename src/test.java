import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class test {

    public static void main(String[] args) {
//        OperateCheckerboard operateCheckerboard = new OperateCheckerboard();
//        operateCheckerboard.solusion(5, 4);

        //4
        //二叉树
        /*
		BinTree bintree=new BinTree();
		int[] objs= {0,1,2,3,4,5,6,7};
		bintree.createTree(objs);
		bintree.preorder(bintree.getRoot());
		System.out.println();
		bintree.inorder(bintree.getRoot());
		System.out.println();
		bintree.afterorder(bintree.getRoot());*/
        /*
        int[] preOrder={1,2,4,7,3,5,6,8};
        int[] inOrder={4,7,2,1,5,3,8,6};
        getTree(preOrder, inOrder);
        BinTree binTree = getTree(preOrder, inOrder);
        System.out.print("end!");
        binTree.preorder(binTree);*/

        //5
        /*
        TwoStactToQueue twoStactToQueue = new TwoStactToQueue();
        twoStactToQueue.queue();*/

        //6
        /*
        RotateArrayList rotateArrayList = new RotateArrayList();
        int[] a = {3,4,5,1,2};
        System.out.print("旋转之前的数组为： ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int index = rotateArrayList.getMinIndex(a);
        int[] b;
        b = rotateArrayList.rotate(a,index);
        System.out.print("旋转之后的数组为： ");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }*/

        //7
        /*
        Feibonaqie feibonaqie = new Feibonaqie();
        feibonaqie.getFei(39);*/

        //十进制专为二进制，二进制中1的个数
        /*
        Number1InBinary number1InBinary = new Number1InBinary();
        int number = number1InBinary.getNumberOf1(-1);
        System.out.print("number of 1 is:  "+number+"");*/

        //求一个浮点型数的base次方
        /*
        FloatPower floatPower = new FloatPower();
        floatPower.getPowerOfFloat();*/

        //数组中奇数位于前半部分
        /*
        IntArrayOddBeforeEven intArrayOddBeforeEven =
                new IntArrayOddBeforeEven();
        intArrayOddBeforeEven.oddBeforeEven();*/

        //输出链表的倒数第k个结点
        /*
        KNodeOfLink kNodeOfLink = new KNodeOfLink();
        kNodeOfLink.getKNode(1);*/

        //反转链表
        /*
        LinkedList<ListNode> linkedList = new LinkedList<>();
        linkedList.add(new ListNode(1));
        linkedList.add(new ListNode(2));
        linkedList.get(0).next = linkedList.get(1);
        linkedList.add(new ListNode(3));
        linkedList.get(1).next = linkedList.get(2);

        OperationLinkList operationLinkList = new OperationLinkList();
        System.out.println("headNode is : "+linkedList.get(0).data);
        System.out.println("link size is : "+linkedList.size());
        operationLinkList.ReverseList(linkedList.get(0));*/

//        OperationLinkList operationLinkList = new OperationLinkList();
        //合并链表\
        /*
        LinkedList a = new LinkedList();
        a.add(1);
        a.add(5);
        a.add(25);
        a.add(49);
        LinkedList b = new LinkedList();
        b.add(3);
        b.add(4);
        b.add(11);
        b.add(12);
        b.add(50);
        b.add(60);
        System.out.println(a.size());
        System.out.println(b.size());
        operationLinkList.mergeLinkedlist(a,b);*/

        //树的子树
        /*
        OperationTree operationTree = new OperationTree();
        operationTree.ifSubTree();*/

        //
        /*
        OperationTree operationTree = new OperationTree();
        int a[] = {8};
        BinTree tree = new BinTree();
        tree.createTree(a);
        int b[] = {6};
        BinTree tr1 = new BinTree();
        tr1.createTree(b);
//        System.out.print("tr1先根遍历：");
//        tree.preorder(tr1.getRoot());
//        System.out.println();
        int c[] = {10};
        BinTree tr2 = new BinTree();
        tr2.createTree(c);
//        System.out.print("tr2先根遍历：");
//        tree.preorder(tr2.getRoot());
//        System.out.println();
        int d[] = {5};
        BinTree tr3 = new BinTree();
        tr3.createTree(d);
//        System.out.print("tr3先根遍历：");
//        tree.preorder(tr3.getRoot());
//        System.out.println();
        int e[] = {7};
        BinTree tr4 = new BinTree();
        tr4.createTree(e);
//        System.out.print("tr4先根遍历：");
//        tree.preorder(tr4.getRoot());
//        System.out.println();
        int f[] = {9};
        BinTree tr5 = new BinTree();
        tr5.createTree(f);
//        System.out.print("tr5先根遍历：");
//        tree.preorder(tr5.getRoot());
//        System.out.println();
        int g[] = {11};
        BinTree tr6 = new BinTree();
        tr6.createTree(g);
//        System.out.print("tr6先根遍历：");
//        tree.preorder(tr6.getRoot());
//        System.out.println();

        tree.setLchild(tr1);
        tree.setRchild(tr2);

        tr1.setLchild(tr3);
        tr1.setRchild(tr4);

        tr2.setLchild(tr5);
        tr2.setRchild(tr6);

//        System.out.println("tree节点数为："+tree.getTemp().size());

        operationTree.exchangeLeftRight(tree);*/

        //顺时针打印矩阵
        /*
        int[][] a = {{1,2,3,4},{5,6,7,8},
                {9,10,11,12},{13,14,15,16}};
        OperateMatrix operateMatrix = new OperateMatrix();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList=operateMatrix.printMatrix2(a);
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }*/

        OperationStack operationStack = new OperationStack();
        operationStack.min();


    }
    /**
     * 根据先序遍历和中序遍历获取到二叉树
     * @param preOrder
     * @param inOrder
     * @return
     */
    public static BinTree getTree(int[] preOrder,int[] inOrder){
        if(preOrder.length == 0 && inOrder.length == 0){
            return null;
        }
        BinTree binTree = new BinTree(preOrder[0]);
        int index = search(0, inOrder.length, inOrder, binTree.getData());
        binTree.setLchild(getTree(Arrays.copyOfRange(preOrder, 1, index+1),
                Arrays.copyOfRange(inOrder, 0, index)));
        binTree.setRchild(getTree(Arrays.copyOfRange(preOrder, index+1, preOrder.length),
                Arrays.copyOfRange(inOrder, index+1, inOrder.length)));
        binTree.preorder(binTree.getRoot());
        return binTree;
    }
    public static int search(int start, int end, int[] inOrder, int data){
        for(int i = start; i < end; i++){
            if(data == inOrder[i]){
                return i;
            }
        }
        return -1;
    }

}
