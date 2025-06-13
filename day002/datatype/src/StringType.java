import java.util.Arrays;

/*
* 字符串
* 字符串声明：
* 1.String str = "are you ok?";
* 2.String str1 = new String("yes!");
* 特性：
* 字符串是不可变的，因为String类是用final修饰的
* 每次声明时会在常量池中检查该字符串是否已存在，如果存在直接引用，如果常量池中没有才会创建
* 当使用new创建字符串时，不使用常量池
*
* 常用方法：
* 字符串长度：int length()
* 字符串判空：isEmpty()
*
* 字符串比较：boolean equals() 比较字符串的内容，==比较字符串的引用地址
* equalsIgnoreCase() 比较字符串的内容，不区分大小写
* compareTo() ‌负数‌：当前对象小于参数对象，零‌：两对象相等，正数‌：当前对象大于参数对象
* 获取字符串长度: int length()
* 获取字符串内容： char charAt()
* 分割字符串，将字符以特定的符号分割，并返回字符串数组：split()
* 去除两边的空格：trim()
* 查找某个字符第一次（indexOf()）或最后一次（lastIndexOf()）出现的位置,可以设定从哪个位置开始：indexOf()，lastIndexOf()
* 查找字符串是否包含指定的字符串 contains()
* 截取字符串,可以指定开始（包含）和结束(不包含)的位置：subString()
*
*
*
*
*
* */
public class StringType {
    public static void main(String[] args) {
        System.out.println("*******声明*******");
        stringDeclaration();
        System.out.println("*******方法*******");
        stringMethods();
    }

    public static void stringDeclaration(){
        String str = "123";
        String str1 = "123";
        String str2 = new String("123");
        String str3 = new String();
        str3 = "123";
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        //直接声明地址比较
        System.out.println("直接声明地址比较:"+(str==str1));
        //直接声明与new的字符串地址比较
        System.out.println("直接声明与new地址比较:"+(str==str2));
        System.out.println("先new字符串对象，再赋值的地址比较:"+(str==str3));
    }
    public static void stringMethods(){
        String str = "123";
        String str1 = "123";
        String str2 = new String("123");
        char[] chars = str.toCharArray();
        String str3 = "q,ere,ttt,d;dfd,aa,s,,,";
        String str4 = "      qq     qqq     ";
        String str5 = "qwerty";
        String str6 = "QWERTY";
        String str7 = "Ali";
        String str8 = "lih";
       //equals();
        System.out.println("equals():"+str.equals(str1));
        System.out.println("\"123\".length():"+str.length());
        System.out.println("\"123\".charAt(0):"+str.charAt(0));
        String strs[] = str3.split(",");
        System.out.println("\"q,ere,ttt,d;dfd,aa,s,,,\".split():"+ Arrays.toString(strs));
        System.out.println("\"      qq     qqq     \".trim():"+ str4.trim());
        System.out.println("\"      qq     qqq     \".indexOf('q',8):"+ str4.indexOf('q',8));
        System.out.println("\"q,ere,ttt,d;dfd,aa,s,,,\".substring(5，6):"+ str3.substring(5,6));
        System.out.println("\"q,ere,ttt,d;dfd,aa,s,,,\".contains(\"ttt\"):"+ str3.contains("ttt"));
        System.out.println("\"QWERTY\".equalsIgnoreCase(\"qwerty\"):"+ str5.equalsIgnoreCase(str6));
        System.out.println("\"QWERTY\".compareTo(\"qwerty\"):"+ str5.compareToIgnoreCase(str6));

    }
}
