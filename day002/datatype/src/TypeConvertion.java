/*
类型转换：
类型从小精度范围 —>大精度范围 无精度损失，都可以进行自动类型转换（隐式转换）
byte -> short -> int -> long -> float -> double
大精度范围 ->  小精度范围 需要强制转换,强制转换后会损失精度,
如果转换后的数值超过了该类型最大限度，则取最大数
double -> float -> long -> int -> short -> byte

特殊类型转换:
char <-> int
char a = 'A';
int ascii = a;
int number = 66;
char b = (char)number;

字符串 <-> 数值



 */
public interface TypeConvertion {
    public static void main(String[] args) {
        //自动转换
        autoConvertion();
        //强制转换
        typeCase();
        //特殊转换
        specialTypeCase();
    }
    public static void autoConvertion(){
        byte byte_num0 = 3;
        short short_num1 = byte_num0;
        int int_num = short_num1;
        long long_num = int_num;
        float float_num = long_num;
        double double_num = float_num;
        System.out.println("***********自动转换**********");
        System.out.println("byte_num0:"+byte_num0);
        System.out.println("short_num1:"+short_num1);
        System.out.println("int_num:"+int_num);
        System.out.println("long_num:"+long_num);
        System.out.println("float_num:"+float_num);
        System.out.println("double_num:"+double_num);
    }
    public static void typeCase(){
        double double_num = 895.6655333125454545454;
        float float_num = (float) double_num;
        long long_num = (long)float_num;
        int int_num = (int)long_num;
        short short_num = (short) int_num;
        byte byte_num = (byte)short_num;
        System.out.println("***********强制转换**********");
        System.out.println("double_num:"+double_num);
        System.out.println("float_num:"+float_num);
        System.out.println("long_num:"+long_num);
        System.out.println("int_num:"+int_num);
        System.out.println("short_num:"+short_num);
        System.out.println("byte_num:"+byte_num);
    }
    public static void specialTypeCase(){
        char a = 'A';
        int ascii = a;
        int number = 66;
        char b = (char)number;
        System.out.println("***********特殊转换**********");
        System.out.println("ascii:" + ascii);
        System.out.println("b:" + b);
    }

}
