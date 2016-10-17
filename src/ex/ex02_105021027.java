package ex;
import java.util.*;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021027 陳宴湘
 */

public class ex02_105021027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);
    boolean run = true;
    char run2 = '0';
    while(run){
    	System.out.print("請輸入  N 和  M 的正整數");
    	 int n = scn.nextInt();
    	    int m = scn.nextInt();
    for(int i =1;i<=n;i++){
       for(int j =1;j<=m;j++){
    	   System.out.print("  "+i*j);
    	 
       }
       System.out.println();
       
    }
    System.out.print("是否繼續(Y/n)");
     run2=scn.next().charAt(0);
     if(run2=='n')
     run = false;
     else 
    	 continue;
     
    
	}
    System.out.println("Over");
}
}