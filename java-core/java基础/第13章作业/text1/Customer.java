package job02.text1;

public class Customer {
	public String[] sortCus(String[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				int re=arr[j].compareTo(arr[j+1]);
				if(re>0) {
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					continue;
				}
			}
			
		}
		return arr;
	}
	
	
	public void show(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
}
