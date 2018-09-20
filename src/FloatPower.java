/**
 * 求一个浮点型数的base次方
 */
public class FloatPower {
    public void getPowerOfFloat(){
        int exponent = -1;
        double base = 2;
        double result = base;
        if(exponent==0){
            result = 1;
        }else if(exponent<0){
            if(exponent == -1){
                result = 1/base;
            }
            for(int j=-2;j>=exponent;j--){
                double temp = base;
                temp *= base;
                System.out.println(temp);
                result = 1/(temp);
            }
        }
        for(int i=1;i<exponent;i++){
            result *= base;
        }
        System.out.println(result);
    }
}
