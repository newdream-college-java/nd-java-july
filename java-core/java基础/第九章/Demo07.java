/*1.7、假设有一个长度为 5 的数组 int [] array = new int[]{1,3,-1,5,-2}现创建
一 个新数组 newArray[]，要求新数组中元素的存放顺序与原数组的元素逆序，并
且如果原数组 的元素值小于 0，在新数组中按 0 存储。编程输出新数组数据*/
public class Demo07{
	public static void main(String [] args){
		int [] array ={1,3,-1,5,-2};
		int [] Array=new int[5];
		int j=4;
		for(int i=0;i<5;i++){
			if(array[i]<0){
				Array[j]=0;
			}else{
				Array[j]=array[i];
			}
			j--;
		}
		System.out.print("原数组数据为：");
		for(int i=0;i<5;i++){
			System.out.print(array[i]+" \t");
		}
		System.out.println("");
		System.out.print("新数组数据为：");
		for(int i=0;i<5;i++){
			System.out.print(Array[i]+" \t");
		}
	}	
}