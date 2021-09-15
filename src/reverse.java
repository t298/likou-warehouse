/*
给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
如果反转后整数超过 32 位的有符号整数的范围 [−2^31,  2^31 − 1] ，就返回 0。
假设环境不允许存储 64 位整数（有符号或无符号）。
&&	称为逻辑与运算符。当且仅当两个操作数都为真，条件才为真。
||  称为逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。
/=  把变量除以右侧的值然后赋值给自身。
*/
public class reverse {
    public int reverses(int x) {
        int res = 0;
        while(x!=0) {
            //每次取末尾数字
            int tmp = x%10;
            //判断是否 大于 最大32位整数
            if (res>214748364 || (res==214748364 && tmp>7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if (res<-214748364 || (res==-214748364 && tmp<-8)) {
                return 0;
            }
            res = res*10 + tmp;
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        reverse reverse = new reverse();
        System.out.println(reverse.reverses(-123455));
    }
}

