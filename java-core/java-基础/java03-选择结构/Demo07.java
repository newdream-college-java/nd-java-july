import java.util.Scanner;
public class Demo07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		char a = '女';//22899 Unicode码
		System.out.println((int)a);
		//提示
		System.out.println("请输入的100成绩和性别：");
		double score = input.nextDouble();
		//char sex ?????
		//String sex = input.next();
		char sex = input.next().charAt(0);//”男“
		if(score<10){
			if(sex=='女'){
				System.out.println("恭喜你进入决赛女子组");
			}else{
				System.out.println("恭喜你进入决赛男子组");
			}
		}



	}
}	