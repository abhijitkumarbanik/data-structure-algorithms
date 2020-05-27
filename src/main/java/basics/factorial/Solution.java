package basics.factorial;

public class Solution {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    //3! = 3*2*1
    public static int factorial(int num)
    {
        if(num == 0 || num == 1)
            return num;
        return num = num * factorial(num-1);
    }
}
