import java.util.ArrayList;

/**
 * 旋转数组
 */
public class RotateArrayList {

    /**
     * 获取数组最小值的下标
     * @param a
     */
    public int getMinIndex(int[] a){
        int tem = a[0];
        int index = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]<tem){
                tem = a[i];
                index = i;
            }
        }
        return index;
    }

    /**
     * 根据数组与index旋转数组
     * @param a
     * @param index
     */
    public int[] rotate(int[] a, int index){
        int[] b = new int[a.length];
        int bIndex = 0;
        for(int i=index;i<a.length;i++){
            b[bIndex] = a[i];
            bIndex += 1;
        }
        for(int i=0;i<index;i++){
            b[bIndex] = a[i];
            bIndex += 1;
        }
        return b;
    }


}
