import java.util.Stack;

public class OperationStack {
    /**
     * 定义栈的数据结构，
     * 请在该类型中实现一个能够得到栈中所含最小元素的min函数
     * 时间复杂度应为O（1）
     */
    Stack stack = new Stack();
    public int push(int a){
        int minimize = 99999;
        if(stack.isEmpty()){
            stack.push(a);
            minimize = a;
        }else if(a<Integer.parseInt(stack.peek().toString())){
            minimize = a;
            stack.push(a);
        }else {
            minimize = Integer.parseInt(stack.peek().toString());
            int temp = pop();
            stack.push(a);
            stack.push(temp);
        }
        return minimize;
    }
    public int pop(){
        int b = Integer.parseInt(stack.pop().toString());
        return b;
    }
    public void min(){
        int min = 9999;
        min=push(23);
        min=push(26);
        min=push(268);
        min=push(13);
        min=push(33);
        min=push(93);
        System.out.println(min);
    }

}
