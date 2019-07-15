/*
练习1：循环100次 java3 最牛逼！！ 
然后再循环输出200句：6个月后，个个是高富帅！！！
*/
public class Demo06{
	public static void main(String[] args){

		int a=22;
		System.out.println((a++)-(++a)+(--a)+(a--));

		int i = 1;
		while(i<=100){
			System.out.println("第"+i+"次输出：java3班最牛逼！！");
			//i=i+1;
			//i+=1;
			i++;
		}

		//记分牌归0
		i=1;
		while(i<=200){
			System.out.println("第"+i+"次输出：6个月后，个个是高富帅！！！");
			//i=i+1;
			//i+=1;
			i++;
		}


	}
}