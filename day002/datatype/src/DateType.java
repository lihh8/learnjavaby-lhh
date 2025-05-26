/**
 *java数据类型共有八种，分别是
 * byte: 大小1字节 ,默认值0 ,取值范围  -128~127；
 * short：大小2字节，默认值0 ,取值范围 -2^15 ~ 2^15-1
 * int：  大小4字节，默认值0 ,取值范围 -2^31 ~ 2^31 -1（约 ±21 亿）
 * long： 大小8字节，默认值0L ,取值范围 -2^63 ~ 2^63 -1
 * float：大小4字节，默认值0.0f,取值范围 +—3.4E38，精度约6~7位小数 例如 ：30.123456789f 输出结果为 30.123457
 * double：大小8字节，默认值0.0d  精度约15~16位小数
 * char： 大小2字节，默认值 /u0000
 * boolean： 1位 ，默认值 false
 *
 * 声明局部变量时，必须进行初始化。
 * 声明全局变量时，如果没有初始化，会使用默认值。
 *
 * 整型默认类型为int,浮点型默认类型为double
 *
 *
 * 定义方式：数据类型  变量名称 [= 初始值];
 * 例：byte a = 1;
 *    int b = 3;
 *    double c = 5.31;
 *    char d = 'X';
 *    boolean  e = true;
 */
public class DateType {
    static byte a ;
    static short b ;
    static long d ;
    static int c ;
    static float e ;
    static double f ;
    static char g ;
    static boolean h;
    public static void main(String[] args) {
        byte a1;
        short b1;
        long d1;
        int c1;
        float e1;
        double f1;
        char g1;
        byte a2 = 125;
        short b2 = 128;
        int c2 = 566;
        long d2 = 10020;
        float e2 = 30.123456789f;
        double f2 = 25.1234567890987654321;
        char g2 = 'S';
        //测试默认值
        System.out.println("默认值:");
        System.out.println("byte:"+a+"\n"+"short:"+b+"\n"+"int:"+c+"\n"+"long:"+d+"\n"+"float:"+e+"\n"+"double:"+f+"\n"+"char:"+g+"\n"+"boolean:"+h);
        //30.123456789f 输出结果为 30.123457
        System.out.println("float浮点精度:"+e2);
        System.out.println("double浮点精度:"+f2);
    }
}
