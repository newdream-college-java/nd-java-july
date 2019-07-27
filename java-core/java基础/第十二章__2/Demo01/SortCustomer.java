package chapter12_2;

public class SortCustomer {
	String tem = "111";
	public void sort(String[] cust){
		for (int i = 1; i < cust.length; i++) {
			if(cust[i].compareToIgnoreCase(cust[i-1])<0){
				tem = cust[i];
				cust[i] = cust[i-1];
				cust[i-1] = tem;
			}
		}
	}
}
