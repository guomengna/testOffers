import java.util.ArrayList;

public class OperateMatrix {
    //蛇形读取数据
    public void printMatrix(int[][] a){
        int lenght = a[1].length;
        int depth = a.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<lenght && i>=0 && j<depth && j>=0){
            if(j>=0 && j<lenght && i%2==0){
                arrayList.add(a[i][j]);
                if(j==3 && i%2==0){
                    j = lenght-1;
                    i += 1;
                }else if(j==0 && i%2==1) {

                    j = 0;
                    i += 1;
                }else{
                    j += 1;
                }
            }else if(j>=0 && j<lenght && i%2==1){
                arrayList.add(a[i][j]);
                if(j==3 && i%2==0){

                    j = lenght-1;
                    i += 1;
                }else if(j==0 && i%2==1) {

                    j = 0;
                    i += 1;
                }else {
                    j -= 1;
                }
            }
        }
        for(int k=0; k<arrayList.size();k++){
            System.out.print(arrayList.get(k)+" ");
        }
    }

    public ArrayList<Integer> printMatrix2(int [][] array) {
        ArrayList<Integer> result = new ArrayList<Integer> ();
        //如果传入的参数为空，则返回空
        if(array.length==0){
            return result;
        }
        int n = array.length;
        int m = array[0].length;
        if(m==0){
            return result;
        }
        int layers = (Math.min(n,m)-1)/2+1;//这个是层数
        for(int i=0;i<layers;i++){
            for(int k = i;k<m-i;k++)
                result.add(array[i][k]);//左至右
            for(int j=i+1;j<n-i;j++)
                result.add(array[j][m-i-1]);//右上至右下
            for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--)
                result.add(array[n-i-1][k]);//右至左
            for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--)
                result.add(array[j][i]);//左下至左上
        }
        return result;
    }
}
