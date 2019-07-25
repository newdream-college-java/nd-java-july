
public class Manage {
	String name;
	int age;
	boolean card;
	Manage[] arr=new Manage[1000];
	
	public void add(Manage cus){
		boolean flag=false;
		for(int i=0;i<1000;i++){
			if(arr[i].equals(null)){
				arr[i]=cus;
				flag=true;
				break;
			}
		}
		if(!flag){
			System.err.println("Êı×éÒÑÂú");
			return;
		}
	}
	
	public void sort(){
		Manage a=new Manage();
		for(int i=0;i<arr.length-1;i++){
			if(arr[i+1]==null){
				break;
			}
			if(arr[i].name.compareTo(arr[i+1].name)>0){
				a=arr[i];arr[i]=arr[i+1];arr[i+1]=a;
			}
		}
	}
}
