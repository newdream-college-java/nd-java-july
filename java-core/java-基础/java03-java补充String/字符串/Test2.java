package 字符串;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "  abc  我，123刚刚def刚  刚  ";
        /**
         * 字符串属性
         */
        // 1.字符串比较器
        System.out.println(s.CASE_INSENSITIVE_ORDER);
        /**
         * 字符串方法
         */
        // 1.根据下标取单个字符
        System.out.println(s.charAt(0));
        // 2.查找字符下标 是否存在我
        System.out.println(s.indexOf('你'));
        if (s.indexOf("刚刚1") != -1) {
            System.out.println("存在刚刚1");
        } else {
            System.out.println("存在刚刚1");
        }
        // 3.是否包含
        System.out.println(s.contains("刚刚"));
        // 4.追加
        System.out.println(s.concat("我是追加到字符串后面的字符串"));
        System.out.println(s);// s的值变了没有？
        // 5.取首尾空格
        System.out.println(s.trim());
        // 6.转大小写
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        // 7.区分大小写比较与不区分大小写比较
        System.out.println(s.equals("  Abc  我，123刚刚def刚   刚  "));
        System.out.println(s.equalsIgnoreCase("  Abc  我，123刚刚def刚   刚  "));
        // 8.比较大小
        System.out.println(s.compareTo("def")); // 小于
        // 9.分割
        s = "1900-1-1";
        String[] ss = s.split("-");
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
        // 10,替换
        s = "今天开始就要学习下一门课程H5啦！！";
        System.out.println(s.replace("今天", "明天"));

        // 11.截取
        System.out.println(s.substring(6, 8));// 包前不包后
        System.out.println(s.substring(6));// 从6开始到结束

        /**
         * 输入一个邮箱地址，判断邮箱的格式是否正确
         */
        Scanner input = new Scanner(System.in);
        // 提示
        System.out.println("请输入你邮箱：");
        String email = input.next();
        /*
         * 1.必须包含. 和@ 2.必须@在.之前 3.必须以.com 或.cn 或.com.cn 结尾
         */
        boolean flag = false;
        if (email.contains(".") && email.contains("@")) {
            if (email.indexOf(".") > email.indexOf("@")) {
                // 12.字符串以什么开始，字符串以什么结束
                if (email.endsWith(".com") || email.endsWith(".cn") || email.endsWith(".com.cn")) {
                    flag = true;
                    System.out.println("邮箱合法！！");
                }
            }
        }
        if (!flag) {
            System.out.println("邮箱格式不合法");
        }

        // 13.字符串转为字符数组
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + "\t");
        }
        System.out.println();
        // 14.字符串数组转为字符串
        String s2 = new String(chs);
        System.out.println(s2);

        // 15.字符串转字节数组
        // 今天开始就要学习下一门课程H5啦！
     /*
      *  gbk编码 ---国标码：一个汉字对应2个字节
      *  utf-8编码---国际通用码：一个汉字对应3个字节
      */
       // byte[] bytes = s2.getBytes();//我这里默认utf-8拆字符串
        byte[] bytes =  s2.getBytes("gbk");
        System.out.println(bytes.length+"个字节");
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        // 16.字节数组转字符串
        //String s3= new String(bytes);//默认按utf-8编码字符串
        String s3 = new String(bytes,"gbk");
        System.out.println(s3);

    }
}
