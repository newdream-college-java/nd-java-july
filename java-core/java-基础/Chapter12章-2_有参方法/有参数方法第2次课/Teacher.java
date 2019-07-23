package 有参数方法第2次课;

public class Teacher {
    //属性
    //方法
    /**
     * 1、方法的命名规则：小驼峰命名法
     * 2、数组作为参数定义的时候，需要些类型和数组名
     * 3、调用数组作为参数的方法是，只需要传入数组名
     */
    //public void calcScore(int a,int b,int c,int d, int e) {
    public void calcScore(double[] scores) {//形参：形式参数
        //计算平局分（总分）
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum+=scores[i];
        }
        System.out.println("平均分为："+sum/scores.length);
        //和最高分（假设）
        double max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(max<scores[i]) {
                max = scores[i];
            }
        }
        System.out.println("最高分为："+max);
    }
}
