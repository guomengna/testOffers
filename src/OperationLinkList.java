import java.util.LinkedList;

public class OperationLinkList {
    /**
     * 反转链表
     */
    public ListNode ReverseList(ListNode head){
        ListNode newHead = null;//存储反转之后的新的头结点
        ListNode node = head;//当前的结点
        System.out.println("开始之前，头结点为： "+node.data);
        ListNode preNode = null;//当前结点的前一个结点
        while(node!=null){
            ListNode nextNode = node.next;
            if(nextNode==null){//当前结点的下一个结点为空
                newHead = node;//当前结点就是反转后的头结点
            }
            node.next = preNode;//当前结点的下一个指向前一个结点
            preNode = node;//将当前结点复制给前一个结点
            node = nextNode;//当前结点后移
        }
        System.out.println("反转后的头结点为： "+newHead.data);
        return newHead;
    }

    /**
     * 输入两个单调递增的链表，
     * 输出两个链表合成后的链表，
     * 当然我们需要合成后的链表满足单调不减规则。
     */
    public LinkedList mergeLinkedlist(LinkedList l1, LinkedList l2){
        LinkedList l3 = new LinkedList();
        if(l1==null){
            l3 = l2;
            return l3;
        }else if(l2 == null){
            l3 = l1;
            return l3;
        }else if(l1==null && l2==null){
            l3=null;
            return l3;
        }else{
            //开始比较
            int m = l1.size();//存储l1中未比较的数量
            int n = l2.size();//存储l2中未比较的数量
            int i = 0;//存储l1指针的位置
            int j = 0;//存储l2指针的位置
            System.out.println("m="+m+" n="+n);
            while(m>0 || n>0){
                if(m>0 && n>0){//两个链表的剩余比较长度都大于0
                    if((Integer)l1.get(i)<(Integer)l2.get(j)){
                        l3.add(l1.get(i));
                        System.out.println("l1的数比较小，add to l3 "+l1.get(i));
                        i += 1;//l1中的值小，加入l3中，指针后移1
                        m -= 1;//剩余数量-1
                    }else if((Integer)l1.get(i)>(Integer)l2.get(j)){
                        l3.add(l2.get(j));
                        System.out.println("l2的数比较小，add to l3 "+l2.get(i));
                        j += 1;//l2中的值小，加入l3中，指针后移1
                        n -= 1;//剩余数量-1
                    }else if((Integer)l1.get(i)==(Integer)l2.get(j)){
                        l3.add(l1.get(i));
                        i += 1;//l1中的值与l2中的值相等，加入l3中，指针都后移1
                        j += 1;
                        m -= 1;//剩余数量-1
                        n -= 1;
                    }
                }else if(m == 0 && n>0){//l1已经比较完了
                    System.out.println("l1已经比较完了");
                    for(int k=j;k<l2.size();k++){//把l2剩余的值复制给l3
                        l3.add(l2.get(k));
                        System.out.println("add to l3 "+l2.get(k));
                    }
                    n=0;
                }else if(n == 0 && m>0){//l2已经比较完了
                    for(int k=i;k<l1.size();k++){//把l1剩余的值复制给l3
                        l3.add(l1.get(k));
                        System.out.println("add to l3 "+l1.get(k));
                    }
                    m=0;
                }
            }
            System.out.println("l3的大小为： "+l3.size());
            System.out.println("l3为： "+l3);
            return l3;
        }
    }
}
