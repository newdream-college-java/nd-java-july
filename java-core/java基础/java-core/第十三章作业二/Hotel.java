package chapter_13_2;
/*1.2、需求说明编程实现添加客户，客户信息包括:姓名、年龄、是否有会员卡。*/
public class Hotel {
		Customer[] cus1=new Customer[3];
		public void addCus(Customer cus){
			int i = 0;
			for (; i < cus1.length; i++) {
				if(cus1[i]==null){				
					cus1[i]=cus;
					break;
				}
			}
			if(i==cus1.length){
				System.out.println("数组已满。。。");
				return;
			}
			System.out.println(cus.name+"\t"+cus.age+"\t"+cus.card);		
		}
		public static void main(String[] args) {
			Hotel h1=new Hotel();
			Customer c1=new Customer();
			c1.name="陈良财";
			c1.age=18;
			c1.card=true;
			Customer c2=new Customer();
			c2.name="刘备";
			c2.age=38;
			c2.card=true;
			Customer c3=new Customer();
			c3.name="关于";
			c3.age=28;
			c3.card=false;
			Customer c4=new Customer();
			c4.name="关于";
			c4.age=28;
			c4.card=false;
			System.out.println("客户信息：");
			h1.addCus(c1);
			h1.addCus(c2);
			h1.addCus(c3);
			h1.addCus(c4);
		}
			
}
