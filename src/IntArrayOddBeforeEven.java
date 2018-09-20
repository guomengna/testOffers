import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入一个整数数组，实现调整数组中数字的顺序，
 * 使得奇数位于数组的前半部分，偶数位于后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变
 */
public class IntArrayOddBeforeEven {
    public void oddBeforeEven(){
        Integer a[] = {2,3,1,4,6,5,7,8};
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if((a[i]%2)==1){
                b.add(a[i]);
            }else{
                c.add(a[i]);
            }
        }
        int bSize = b.size();
        System.out.println("b size is "+bSize+"");
        System.out.println("odd array is: "+b);
        int cSize = c.size();
        System.out.println("c size is "+cSize+"");
        System.out.println("even array is: "+c);
        for(int j=0;j<c.size();j++){
            b.add(c.get(j));
        }
        System.out.println("result is: "+b);
    }
}
