
public class Bubblesort {
	public void print(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void bubblesort(int arr[]) {
		int n=arr.length;
		boolean isSwapped;
		// two for loops one is outer for loop and second is inner for loop
		// outer for loop is used to keep track of each iteration
		// inner for loop is used for comparision of each adjacent elements
		
		for(int i=0;i<n-1;i++) { //n=5-1=4 as four times the loop iterates
		
			isSwapped=false;
			
			for(int j=0;j<n-1-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp =arr[j];
					
					arr[j]=arr[j+1];
				
					arr[j+1]=temp;
					
					isSwapped=true;
				}
			}
			if(isSwapped==false)
				break;
		}
			
	}

	public static void main(String[] args) {
		Bubblesort a = new Bubblesort();
		int arr[]= {5,1,9,2,10};
		a.print(arr);
		a.bubblesort(arr);
		a.print(arr);
	
	}

}
