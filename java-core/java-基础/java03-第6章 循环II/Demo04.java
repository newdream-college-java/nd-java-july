/*练习2：统计1~100中5和3的公倍数的个数*/
public class Demo04{
	public static void main(String[] args){
		int tj = 0;//表示公倍数的个数
		for(int i=1;i<=100;i++){
			//方式一：if判断是否需要统计
			//if(i%3==0&&i%5==0){//i是3和5的公倍数
			//	tj++;
			//}
			//方式二：使用continue
			if(i%3!=0||i%5!=0{//i不是3和5的公倍数
				continue;//结束本次循环，直接进入下一次循环
			}
			tj++;
		}
		System.out.println("5和3的公倍数有："+tj);
	}
}