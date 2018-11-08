import java.awt.*;
import java.util.ArrayList;

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

}
