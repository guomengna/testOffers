import java.util.LinkedList;

/**
 * 输出链表的倒数第k个结点
 */
public class KNodeOfLink {
    public void getKNode(int k){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        int size = linkedList.size();
        String result="";
        if(k<=size){
            result = linkedList.get(size-k);

        }
        System.out.print("倒数第"+k+"个节点为： "+result);
    }
}
