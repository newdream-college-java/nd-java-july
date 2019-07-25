package chapter12_1;

public class Person {
	String name;
	String sex;
	String age;
	
	public void show(Person psn){
		System.out.println("-----------人员信息--------------");
		System.out.println("人员信息如下：");
		System.out.println("姓名-->"+psn.name);
		System.out.println("性别-->"+psn.sex);
		System.out.println("年龄-->"+psn.age);
		
	}
	

}
