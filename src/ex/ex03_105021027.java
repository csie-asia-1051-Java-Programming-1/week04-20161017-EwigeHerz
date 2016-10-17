package ex;
import java.util.*;
/*
 * Topic: 讓使用者輸入 一個正整數 n 然後顯示出下列圖形 (例 n = 4)
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 105021027 陳宴湘
 */

public class ex03_105021027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		for(int i =1;i<=x;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
		
			}
			System.out.println();
		}
           
	}

}
