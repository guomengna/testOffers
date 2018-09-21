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
    /**
     * 输入两个整数序列，第一个序列表示栈的压入顺序，
     * 请判断第二个序列是否可能为该栈的弹出顺序。
     * 假设压入栈的所有数字均不相等。
     * 例如序列1,2,3,4,5是某栈的压入顺序，
     * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
     * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。
     * （注意：这两个序列的长度是相等的）
     */
    public boolean isPushAndPop(int[] a, int[] b ){
        boolean flag = false;
        if(a.length==0 || b.length==0 || a.length!=b.length){
            System.out.println("两个数列的长度不对，因此不会是对应的压入和弹出顺序。");
        }
        //使用辅助栈，执行入栈操作，当栈顶元素与出栈序列中的不同时，继续入栈操作。
        //当栈顶元素与出栈序列中的元素相同时开始出栈操作，每次出栈出栈序列的位置也要下移
        Stack stack = new Stack();
        int i=0, j=0;
        stack.push(a[i]);
        while((!stack.isEmpty()) && i<a.length && j<b.length){
            if((Integer.parseInt(stack.peek().toString())==b[j])){
                stack.pop();
                j += 1;
                System.out.println("弹出");
            }else if(i<a.length-1){
                i += 1;
                stack.push(a[i]);
            }else if(i==a.length-1 && j!=b.length-1){
                flag = false;
                break;
            }
        }
        if(stack.isEmpty()){
            flag = true;
        }
        return flag;
    }
}
