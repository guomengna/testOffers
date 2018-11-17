import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class Tools {
    /**
     * 输出所有和为S的连续正数序列。
     * 序列内按照从小至大的顺序，
     * 序列间按照开始数字从小到大的顺序
     */
    public void LianxuS(int s){

        ArrayList<ArrayList> list = new ArrayList<>();
        if(s<=2){
            System.out.println("s值过小，请重新输入s");
            return;
        }
        for(int i=1;i<=s;i++){
            ArrayList<Integer> arrayList = new ArrayList<>();
            int t = i;
            arrayList.add(i);
            for(int j=i+1;j<=s;j++){
                t = t+j;
                arrayList.add(j);
                if(s == t){
                    list.add(arrayList);
                    break;
                }
            }
        }
        for(int k=0;k<list.size();k++){
            System.out.println(list.get(k));
        }
    }
    /**
     * 输入一个递增排序的数组和一个数字S，
     * 在数组中查找两个数，使得他们的和正好是S，
     * 如果有多对数字的和等于S，输出两个数的乘积最小的。
     */
    public void LianxuSwith2number(int[] list, int s){
        int t = 0;
        int chengji = 0;
        ArrayList<ArrayList> list1 = new ArrayList<>();
        for(int i=0;i<list.length;i++){
            for(int j=i+1;j<list.length;j++){
                ArrayList<Integer> list2 = new ArrayList<>();
                t = list[i]+list[j];
                list2.add(list[i]);
                list2.add(list[j]);
                if(t == s){
                    list1.add(list2);
                }
            }
        }
        if(list1.size() == 1){
            System.out.println(list1.get(0));
        }else if(list1.size() > 1){
            int minichengji = Integer.parseInt(list1.get(0).get(0).toString())*Integer.parseInt(list1.get(0).get(1).toString());
            ArrayList<Integer> list3 = new ArrayList<>();
            list3.add(Integer.parseInt(list1.get(0).get(0).toString()));
            list3.add(Integer.parseInt(list1.get(0).get(1).toString()));
            for(int i=1;i<list1.size();i++){
                chengji = Integer.parseInt(list1.get(i).get(0).toString())*Integer.parseInt(list1.get(i).get(1).toString());
                if(chengji < minichengji){
                    minichengji = chengji;
                    list3.clear();
                    list3.add(Integer.parseInt(list1.get(i).get(0).toString()));
                    list3.add(Integer.parseInt(list1.get(i).get(1).toString()));
                }
            }
            System.out.println(list3.get(0)+" "+list3.get(1));
        }else if(list1.size() < 1){
            System.out.println("没有这样的两个整数");
        }
    }
    /**
     * 字符串循环左移n位
     */
    public void moveLeft(String s, int n){
        char[] c = s.toCharArray();
        char[] newChar = new char[s.length()];
        for(int i=0;i<s.length()-n;i++){
            newChar[i] = c[i+n];
        }
        for(int j=n,k=0;j>0;j--,k++){
            newChar[s.length()-j] = c[k];
        }
        System.out.println(newChar);
    }
    /**
     * 翻转单词顺序
     */
    public void fanzhuanWord(String s){
        char[] c = s.toCharArray();
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            String s1 = String.valueOf(c1);
            if(s1.equals(" ")){
                String tempString = s.substring(0,i);
                arrayList.add(tempString);
                s = s.substring(i+1,s.length());
                i=0;
            }
        }
        arrayList.add(s);
        System.out.println("arrayList's size is: "+arrayList.size());
//        for(int j=0;j<arrayList.size();j++){
//            System.out.print(arrayList.get(j)+" ");
//        }
//        System.out.println();
        for(int k=3;k>=0;k--){
            System.out.print(arrayList.get(k)+" ");
        }
    }
    /**
     * 求1+2+3+...+n，
     * 不能使用乘除法、for、while、if、else、
     * switch、case等关键字及条件判断语句（A?B:C）
     */
    public int sum(int n){
        int sum = n;
        boolean bool=(n!=0) && ((sum+=sum(n-1))!=0);
        return sum;
    }

    /**
     * 数组中重复的数字
     * @param number，输入的数组
     * @param numberth，第numberth个重复的数字
     */
    public int duplication(int[] number, int numberth){
        LinkedHashMap<Integer,Integer> hashMap = new LinkedHashMap<>();
        for(int i=0;i<number.length;i++){
            if (hashMap.containsKey(number[i])){
                int count = hashMap.get(number[i]);
                hashMap.put(number[i],++count);
            }else{
                hashMap.put(number[i],1);
            }
        }

        Set<Integer> set = new HashSet<>();
        for(int i=0;i<number.length;i++){
            if (hashMap.get(number[i])>1){
                set.add(number[i]);
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>(set);
//        for(int j=0;j<arrayList.size();j++){
//            System.out.println(arrayList.get(j));
//        }
        if(numberth>set.size()){
            System.out.println("超出索引，没有第"+numberth+"个重复的数字");
        }else {
            System.out.println(arrayList.get(numberth));
            return arrayList.get(numberth);
        }
        return -1;
    }

    /**
     * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1].
     * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
     * 不能使用除法。
     * @param a
     * @return
     */
    public int[] getB(int[] a){
        int[] b = new int[a.length];
        for(int i=0;i<b.length;i++){
            b[i] = 1;
            for(int j=0;j<a.length;j++){
                if(j!=i){
                    b[i] *= a[j];
                }else if(i==j){
                    b[i] *= 1;
                }
            }
        }
        for(int k=0;k<b.length;k++){
            System.out.print(b[k]+" ");
        }
        return b;
    }

    /**
     * 字符串匹配
     * 模式中的字符'.'表示任意一个字符，
     * '*'表示它前面的字符可以出现任意次（包含0次）
     * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，
     * 但是与"aa.a"和"ab*a"均不匹配
     */
    public boolean ifMatch(char[] a, char[] b){
        boolean flag = false;
        ArrayList<String> arrayListA = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            arrayListA.add(String.valueOf(a[i]));
//            System.out.print(arrayListA.get(i)+" ");
        }
//        System.out.println();
        ArrayList<String> arrayListB = new ArrayList<>();
        for(int i=0;i<b.length;i++){
            arrayListB.add(String.valueOf(b[i]));
//            System.out.print(arrayListB.get(i)+" ");
        }
        for(int i=0;i<arrayListA.size();i++){
//            System.out.println("A:i="+i);
            if(arrayListA.get(i).equals("*")){
                arrayListA.remove(i);
                String s = arrayListA.get(i-1);
//                System.out.println("s="+s);
                if(arrayListA.get(i-1).equals(s)){
                    arrayListA.remove(i-1);
                    i -= 1;
                }
            }
        }
        for(int i=0;i<arrayListB.size();i++){
//            System.out.println("B:i="+i);
            if(arrayListB.get(i).equals("*")){
                arrayListB.remove(i);
                String s = arrayListB.get(i-1);
                if(arrayListB.get(i-1).equals(s)){
                    arrayListB.remove(i-1);
                    i -= 1;
                }
                i += 1;
            }
        }
//        for(int j=0;j<arrayListA.size();j++){
//            System.out.print(arrayListA.get(j)+" ");
//        }
//        System.out.println();
//        for(int j=0;j<arrayListB.size();j++){
//            System.out.print(arrayListB.get(j)+" ");
//        }
        if(arrayListA.size() == arrayListB.size()){
            //开始比较AB是否相同
            for(int indexA=0,indexB=0;indexA<arrayListA.size();){
                if(ifEqual(arrayListA.get(indexA),arrayListB.get(indexB))){
                    indexA += 1;
                    indexB += 1;
                }else {
                    break;
                }
                flag = true;
            }
        }else {
            flag = false;
        }
//        System.out.println();
        System.out.println("result is: "+flag);
        return flag;
    }
    public boolean ifEqual(String a, String b){
        boolean flag = false;
        if(a.equals(b)){
            flag = true;
        }else if(a.equals(".")){
            flag = true;
        }else if(b.equals(".")){
            flag = true;
        }
        return flag;
    }

    /**
     * 滑动窗口最大值
     * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
     */
    public ArrayList<Integer> MaxInWindows(int[] num, int size){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<num.length-size+1;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=i;j<i+size;j++){
                temp.add(num[j]);
            }
            int max = temp.get(0);
            for(int j=1;j<temp.size();j++){
                if(temp.get(j)>max){
                    max = temp.get(j);
                }
            }
            result.add(max);
        }
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i));
        }
        return result;
    }

    /**
     * 矩阵中的路径
     */
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        char[][] chars = new char[3][4];
        char[] temp;
        String s = String.valueOf(matrix);
        for(int i=0;i<rows;i++){
            String tem = s.substring(i*cols,i*cols+cols);
            char[] a = tem.toCharArray();
            System.out.println(a);
            chars[i] = a;
        }//矩阵建立好了
        //开始判断路径是否存在
        ArrayList<String> index = new ArrayList<>();//存储已经访问过的矩阵字符的编号。用ij形式表示。

        return false;
    }


}
