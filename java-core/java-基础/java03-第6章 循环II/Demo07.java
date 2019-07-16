/*
求整年天数问题：
求出1900-1-1到2019-1-1的总天数
1900年总天数+1901年+1902+....+2018年+2019年的1天
闰年：366天
平年：365天


*/
public class Demo07{
	public static void main(String[] args){
		int days =0;//总天数
		for(int i=1900;i<2019;i++){
			if(i%4==0&&i%100!=0||i%400==0){//闰年
				days+=366;
			}else{//平年
				days+=365;
			}	
		}
		System.out.println(days+1);

	}
}