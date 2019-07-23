package 字符串;

/**
 * 1、 二维数组 {1,2,3,4}--------一层楼房 4间房
 * 
 * {{1,2},{3,4}}----二层楼房 每层2间房 2、二维数组的使用 1）申明 int[][] arr; 2) 定义 arr=new
 * int[2][2];//2层 每层2间 3）赋值 层下标从0开始 间下标从0开始 arr[0][0] =1; 第1层的第1间房 住的数字1
 * arr[0][1]=2;
 * 
 * arr[1][0]=3; arr[1][1]=4; 4)使用 最大层数=数组名.length 每层的最大间数=数组名[0].length for(int
 * i=0;i<arr.length;i++){//i-层 for(int j =0;j<arr[0].length;j++){
 * System.out.println(arr[i][j]); } }  *  
 * 
 * 
 * 
 * 练习1：定义字符串2维数组，保存四大美人，然后输出。
 *  
 */
public class 二维数组 {
    public static void main(String[] args) {
        int[][] arr;
        arr = new int[2][2];
        arr[0][0] = 1; // 第1层的第1间房 住的数字1
        arr[0][1] = 2;

        arr[1][0] = 3;
        arr[1][1] = 4;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

    }
}
