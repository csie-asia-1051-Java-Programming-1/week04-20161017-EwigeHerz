package ex;
import java.util.*;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 105021027 陳宴湘
 */

public class ex04_105021027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入值:");
		int x = scn.nextInt();
		System.out.print("請輸入你要的字元符號:");
		char y = scn.next().charAt(0);
		for(int i =x;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(y);
		
			}
			System.out.println();
		}
         
		
		
	}

}


