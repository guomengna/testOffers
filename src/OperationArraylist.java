import java.util.ArrayList;
import java.util.LinkedHashMap;

public class OperationArraylist {
    /**数组中出现超过一半的数字
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
     * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
     * 如果不存在则输出0。
     */
    public void ifmoreThanHalf(int[] a){
        int size = a.length;
        int halfSize = size/2;
        int result=0;
        for(int i=0;i<size;i++){
            int test = a[i];
            int times = 0;
            System.out.println("test is "+test);
            for(int j=0;j<size;j++){
                if(test == a[j]){
                    times += 1;
                }
            }
            if(times > halfSize){
                result = test;
            }
        }
        System.out.println(result+"");
    }
    /**
     * 寻找数组中的K个最小的值
     */
    public ArrayList<Integer> findKsmall(ArrayList<Integer> input, int k){
        ArrayList<Integer> output = new ArrayList<>();
        int count=0;
        for(int i=0;i<input.size();i++){
//            System.out.println("i = "+i+" and output.size is: "+output.size());
            if(output.size()<k){
                for(int j=0;j<input.size();j++){
                    if(count==input.size()-k){
                        output.add(input.get(i));
                        break;
                    }else if(input.get(i)<input.get(j)){
//                        System.out.println("input("+i+")="+input.get(i));
//                        System.out.println("input("+j+")="+input.get(j));
                        count += 1;
                    }
                }
                count = 0;
            }
        }
        System.out.print("前"+k+"个小的数为： ");
        for(int h=0;h<output.size();h++){
            System.out.print(output.get(h)+" ");
        }
        return output;
    }

    /**
     * 给一个数组，返回最大连续子序列的和
     * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)
     */
    public int continueSubsequence(int[] a){
        int resultStart = 0;
        int resultEnd = 0;
        int maxSum = 0;
        int sum = 0;
        for(int j=0;j<a.length;j++){
            for(int i=0;i<a.length;i++){
                sum += a[i];
                if(sum>maxSum){
                    maxSum = sum;
                    resultStart = j;
                    resultEnd = i;
                }
            }
            sum = 0;
        }
        System.out.println("最大和为： "+maxSum+"。" +
                "取最大值是从"+resultStart+"到"+resultEnd);
        return maxSum;
    }
    /**
     * 求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）
     * 1~13中包含1的数字有1、10、11、12、13因此共出现6次
     */
        //从1到n之间的数总共有多少个1出现
        public int NumberOf1Between1AndN_Solution(int n) {
            int count = 0;//1的个数
            int i = 1;//当前位，1表示个位，10表示十位，每次1*10表示前移一位
            int current = 0,after = 0,before = 0;
            while((n/i)!= 0){
                current = (n/i)%10; //当前位数字
                before = n/(i*10); //高位数字
                after = n-(n/i)*i; //低位数字
                //如果为0,出现1的次数由高位决定,等于高位数字 * 当前位数
                if (current == 0)
                    count += before*i;
                    //如果为1,出现1的次数由高位和低位决定,高位*当前位+低位+1
                else if(current == 1)
                    count += before * i + after + 1;
                    //如果大于1,出现1的次数由高位决定,//（高位数字+1）* 当前位数
                else{
                    count += (before + 1) * i;
                }
                //前移一位
                i = i*10;
            }
            System.out.println(count);
            return count;
        }
        //用StringBuffer存储1~N范围内所有数字，再用append拼接起来，
        // 用一遍循环遍历sb.charAt[i]=='1'判断1出现的次数
        public int NumberOf1Between1AndN_Solution1(int n) {
            StringBuffer stringBuffer = new StringBuffer();
            int count = 0;
            if(n>0){
                for(int i=1;i<=n;i++){
                    stringBuffer.append(i);
                }
                String s = stringBuffer.toString();
                System.out.println(s);
                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)=='1'){
                        count += 1;
                    }
                }
            }
            System.out.println(count);
            return count;
        }
    /**
     * 正整数数组中，把数组排成最小数
     * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323
      */
    public String minNumberInArray(int[] a){
        //冒泡排序，替换<运算符
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(isSmaller(a[j]+"",a[i]+"")){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0;i<a.length;i++){
            stringBuffer.append(a[i]);
        }
        System.out.print(stringBuffer.toString());
        return stringBuffer.toString();
    }
    //a是否小于等于b
    public Boolean isSmaller(String a, String b){
        Boolean result = false;
        int count = 0;
        for(int i=0;i<a.length();i++){
            String left = a+b;
            String right = b+a;
            if(left.charAt(i)<right.charAt(i)){
                result = true;
                break;
            }else if(left.charAt(i)>right.charAt(i)){
                result = false;
                break;
            }else if(left.charAt(i)==right.charAt(i)){
                count++;
            }
        }
        if(count==a.length()){
            result = true;
        }
        return result;
    }

    /**
     * 第一个只出现一次的字符
     * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)
     * 中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）
     */
    public int firstCharOnlyOnce(String s){
        int result = 0;
        for(int i=0;i<s.length();i++){
            int count = 1;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    count += 1;
                }
            }
            if(count == 1){
                result = i;
                break;
            }
            System.out.println(s.charAt(i)+"出现了"+count+"次");
        }
        System.out.println("the char is "+s.charAt(result)+" and it's position is: "+result);
        return result;
    }

    /**
     * 数组中的逆序对
     * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
     * 输入一个数组,求出这个数组中的逆序对的总数P，并将P对1000000007取模的结果输出。 即输出P%1000000007
     * 例如：
     * 输入：1,2,3,4,5,6,7,0
     * 输出：7
     */
    public void countsOfReversePair(int[] a){
        int count = 0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j]){
                    count += 1;
                }
            }
        }
        System.out.println(count%1000000007+"");
    }

    public int firstCharOnlyOnce1(String str){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                int time = map.get(str.charAt(i));
                map.put(str.charAt(i),++time);
            }else {
                map.put(str.charAt(i),1);
            }
        }
        int pos = -1;
        int i=0;
        for(;i<str.length();i++){
            char c = str.charAt(i);
            if(map.get(c) == 1){
                return i;
            }
        }
        return pos;
    }

    /**
     * 输入两个链表，找出它们的第一个公共节点
     */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        return null;
    }
}
