/**
 * 斐波那契数列
 */
public class Feibonaqie {
    public void getFei(int n){
        int a[] = new int[n+2];
        a[0] = 1;
        a[1] = 1;
        int i = 1;
        for (i=1;i<=n;i++){
            a[i+1] = a[i]+a[i-1];
        }
        System.out.println("长度为"+(n+2)+"的斐波那契数列为： ");
        for (int j=0;j<n+1;j++){
            System.out.print(a[j]+" ");
        }
        System.out.println();
        System.out.print("第 "+n+" 个斐波那契数为： "+a[n]+" ");
    }
}
