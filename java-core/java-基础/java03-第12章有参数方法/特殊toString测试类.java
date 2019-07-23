
public class 特殊toString测试类 {
    public static void main(String[] args) {
       特殊的toString sb = new 特殊的toString();
       System.out.println(sb);//自动调用toString方法
       //父类：Object 的toString
       System.out.println(sb.toString());//手动调用toString方法
    }
}
