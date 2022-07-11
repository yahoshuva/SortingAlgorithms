
public class InsertionSortDemo {
public void print(int arr[]) {
	for(int i =0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		
	}
	
	System.out.println();
}
public void sorting(int arr[]) {
	int n=arr.length;
	for(int i=1; i<n;i++) {
		int temp=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>temp) {
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]=temp;
	}
	
}
	public static void main(String[] args) {
		InsertionSortDemo a = new InsertionSortDemo();
		int arr[]= {3,1,5,2,6,4};
		a.print(arr);
		a.sorting(arr);
		a.print(arr);
		

	}

}
