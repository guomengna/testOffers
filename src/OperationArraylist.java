import java.util.ArrayList;

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
    public void minNumberInArray(int[] a){

    }
}
