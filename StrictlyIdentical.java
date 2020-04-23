import java.util.Scanner; 										//imports Scanner
public class StrictlyIdentical {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in); 					//instantiates Scanner
		System.out.println("Enter List 1: "); 					//prompts user
		int size = sc1.nextInt(); 								//reads 1st number establishes as size value
		int[] list1 = new int[size]; 							//creates list1 array
		for(int i = 0; i < size; i++) { 						//for loop repeats as many times as size value
			list1[i] = sc1.nextInt(); 							//each input value is set to next point on the array 0 - size
		}
		System.out.println("Enter List 2: "); 					//prompts user
		size = sc1.nextInt(); 									//reads 1st number establishes as size value
		sc1.close(); 											//closes Scanner
		int[] list2 = new int[size]; 							//creates list2 array
		for(int i = 0; i < size; i++) { 						//for loop repeats as many times as size value
			list2[i] = sc1.nextInt(); 							//each input value is set to next point on the array 0 - size
		}
		if (equals(list1, list2)) { 							//uses equal method
			System.out.println("Lists are identical"); 			//returns result if equals is true
		} else {
			System.out.println("Lists are NOT identical"); 		//returns result if equals is false
		}
	}
	public static boolean equals(int[] list1, int[] list2) { 	//equal method determines if list1 and list2 are the same
		if (list1.length != list2.length) return false;			//tests length
		for (int i = 0; i < list1.length; i++) { 				//for loop that tests all values on the array 0 - list1 length
			if (list1[i] != list2[i]) return false; 			//tests each value comparing list1 and list2
		}
		return true;
	}
	
		/* Practice Run: list1 = 1 2 3 4 5 list2 = 1 2 3 4 5
		 * Result: Lists are identical 
		 */
}
