
public class A{
	public static void main(String [] args){
		int sum=0;
		for(int i=1;i<=100;i++){
		sum+=i;
		if(sum>500){
		System.out.println("此时已经加道了："+i);
		break;
		}
		}
}
}