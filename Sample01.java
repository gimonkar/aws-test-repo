import java.util.Scanner;
class Sample01{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for(int i=0;i<arr.length;i++){
			System.out.println("enter the element "+ i );
			arr[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<arr.length;i++,j++){
			 j=i;
			if(arr[i]>arr[j]){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				System.out.println(j);
			}
		}

		for(int element:arr){
			System.out.print(element+" ");
		}



	}
}