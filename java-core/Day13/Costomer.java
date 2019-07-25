/**
 * 
 * @author 54975
 *编程实现添加客户，客户信息包括:姓名、年龄、是否有会员卡。
 */
public class Costomer {
	String name;
	String age;
	boolean menmor=false,flas=false;
	Costomer[] arrays=new Costomer[2];
	public void addCostomer(Costomer a){
		for(int i=0;i<arrays.length;i++){
			if(arrays[i]==null){
				flas=true;
				arrays[i]=a;
				break;
			}
		}
		if(!flas){
			System.out.println("客户已满");
			return;
		}
	}
	public void show(){
		System.out.println("客户信息");
		for (int i = 0; i < arrays.length; i++) {
			if(arrays[i]!=null){
			System.out.print(arrays[i].name+"\t"+arrays[i].age+"\t"+arrays[i].menmor+"\n");
			}
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public boolean isMenmor() {
		return menmor;
	}
	public void setMenmor(boolean menmor) {
		this.menmor = menmor;
	}
	public String toString() {
		return "Costomer [age=" + age + ", menmor=" + menmor + ", name=" + name
				+ "]";
	}
	
}
