import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 用两个栈来实现一个队列的功能
 * 入队=压入栈A
 * 出队=若B为空则从A弹出之后压入B，再弹出；若B不为空，则直接弹出。
 */
public class TwoStactToQueue {
    private Stack stackA = new Stack();
    private Stack stackB = new Stack();
    public void queue(){
        int[] array = {1,2,3,4};
        for(int i = 0; i < array.length; i++){
            System.out.println("将"+array[i]+"压入到栈A中");
            push(array[i]);
        }
        System.out.println("栈A中共有："+stackA.size()+" 个数字");
        pop();

    }
    public void push(int a){
        stackA.push(a);
    }
    public void pop(){
        int tem;
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(stackB.empty()){
            while(!stackA.empty()){
                tem = Integer.parseInt(stackA.pop().toString());
                stackB.push(tem);
                System.out.println("将 "+tem+" 压入到栈B中");
            }
            int size = stackB.size();
            System.out.println("栈B中共有："+stackB.size()+" 个数字");
            for(int i = 0; i< size; i++){
                int t = Integer.parseInt(stackB.pop().toString());
                arrayList.add(t);
                System.out.println("从栈B中弹出 "+t);
            }
        }else{
            int size = stackB.size();
            System.out.println("栈B中共有："+stackB.size()+" 个数字");
            for(int i = 0; i< size; i++){
                int t = Integer.parseInt(stackB.pop().toString());
                arrayList.add(t);
            }
        }
        System.out.println("出队顺序为： "+arrayList);
    }
}
