package MeasureDivide;

import java.util.*;

public class MeasureDivide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.print("");
		}
		else {
			for(int i = 2; i < num+1; i++) {
				if(num%i == 0) {
					System.out.println(i);
					
					num = num/i;
					i = 1;
					if(num == 1) {
						break;
					}
				}
			}
		}
		
	}
}