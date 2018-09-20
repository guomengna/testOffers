
public class Number1InBinary {
    public int getNumberOf1(int a){
        //转换为二进制
        String b = Integer.toBinaryString(a);
        System.out.println("b="+b+" and b.length="+b.length());
        char[] tem = b.toCharArray();
        int count = 0;
        for(int i=0;i<b.length();i++){
            char t = tem[i];
            if(t=='1'){
                count += 1;
            }
        }
        return count;
    }
}
