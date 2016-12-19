import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int[] arr = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements [8]:");
		
		for(int i=0;i<arr.length;i++){
			arr[i]= sc.nextInt();
		}

		System.out.println("Before Sorting:");
		for (int i : arr) {
			System.out.print(" "+i);
		}

		//Sorting logic
		int temp = 0, j= -1 ,k = -1;
		for(int i=0;i<arr.length-1;i++){

			//swap if arr[i] is +ve int or 0 and arr[i+1] is -ve int
			if((arr[i]>= 0 && arr[i+1]< 0)){
				temp= arr[i+1];
				arr[i+1]= arr[i];
				arr[i]= temp;
			}else if(arr[i]>=0 && arr[i+1]>=0){

				//find the next -ve int in the array
				
				if(j ==-1){
					j=i;					
				}			

				while(i<arr.length){
					if(arr[i]<0){
						break;
					}
					i++;
				}


				if(i == arr.length){
					break;
				}

				k=i;
				temp=arr[k];
				while(arr[k-1]>=0){
					arr[k]=arr[k-1];
					k--;
				}

				if(j !=-1 ){
					arr[j]=temp;
					j = -1;
				}

			}

		}

		System.out.println();
		System.out.println("After Sorting:");
		for (int i : arr) {
			System.out.print(" "+i);
		}

	}

}
