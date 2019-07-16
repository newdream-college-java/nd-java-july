/*1.4、输出 10000-99999 里面的所有回文数。说明：例如：12321 是回文数，个位与 万位相同，十位与千位相同。12321 99999 99899*/
public class Work4{
	public static void main(String[] args){
		for(int i = 10000;i<=99999;i++){
			if(i%10==i/10000%10 && i/10%10==i/1000%10){
				System.out.println("回文数："+i);
			}
		}
	}
}