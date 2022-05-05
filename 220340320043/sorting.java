import java.util.Scanner;
class sorting{

	void sort(int arr[]){
	int n=arr.length-1;
	int key=arr[n];

	for(int j=n-1;j>=0;j--){
		if(arr[j]>key){
		arr[j+1]=arr[j];
		display(arr,n);

		}
		else{
		arr[j+1]=key;
		display(arr,n);

		}

	}
	}
	void display(int arr[],int n){
	for(int j=0;j<=n;j++){
	System.out.println(arr[j]+" ");
	}
	
}



	public static void main(String... args){

	sorting s=new sorting();
	Scanner sc=new Scanner(System.in);
	System.out.println("Number Of element");
	int i=sc.nextInt();
	int arr[]=new int[i];
	for(int j=0;j<i;j++){
	arr[i]=sc.nextInt();
	}
	s.sort(arr);
	}
}