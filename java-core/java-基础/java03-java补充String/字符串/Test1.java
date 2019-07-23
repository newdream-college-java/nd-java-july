package 字符串;

public class Test1 {
    public static void main(String[] args) {
        String s ="abc";
        String s1 = "abc";
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        
        String s2 = new String("abc");
        String s3 = new String("abc");
        System.out.println(s2==s3);
        //字符串判断要用equals   比较的是地址指向的内容
        System.out.println(s2.equals(s3));
        
        
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true
        
        
        
    }
}
