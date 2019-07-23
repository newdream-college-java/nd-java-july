/**
 * 设计一个判断某年是否闰年的方法，然后在 main 方法中调用，输出结果
 * @author 54975
 *
 */
public class year {
	public boolean juDge(int year){
		if(year%4==0&&year%100!=0||year%400==0){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		year y=new year();
		if(y.juDge(2019)){
			System.out.println("是闰年");
		}else{
			System.out.println("是平年");
		}
	}
}
