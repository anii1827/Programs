package programs;

import java.util.Arrays;

public class reverase_array {
	public static void main (String [] args) {
		String str1 = "heap";
		String str2 = "pea";
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		char [] arr1 = str1.toCharArray();
		char []	arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		for(int x=0;x<arr1.length;x++) {
			System.out.print((int)arr1[x]+" ");
		}
		System.out.println();
		for(int x=0;x<arr2.length;x++) {
			System.out.print((int)arr2[x]+" ");
		}
		int counter = 0;
		int pointer1 =0, pointer2=0;
		while(pointer1<arr1.length){
			if(pointer2>=arr2.length) {
				pointer1++;
				counter++;
			}
			else {
			if((int)arr1[pointer1]<(int)arr2[pointer2]) {
				pointer1++;
				counter++;
			}
			else if((int)arr1[pointer1]>(int)arr2[pointer2]) {
				pointer2++;
				counter++;
			}
			else {
				pointer1++;
				pointer2++;
			}	
		}
		}
		System.out.println();
		System.out.println(counter);
 	}

}
