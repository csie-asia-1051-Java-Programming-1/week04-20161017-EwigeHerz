package ex;
import java.util.*;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021027 陳宴湘
 * sum = 總和
 * count = 平均
 * count--; 去掉上一個數
 */

public class ex01_105021027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scn = new Scanner(System.in);
      int x = 0;
      int sum=0;
      int count = 0;
      while(x!=-1){
    	  count++;
    	  sum+=x;
    	  System.out.print("輸入一個值:");
    	  x=scn.nextInt();
      }
      count--;
      System.out.println("總和:"+sum);
      System.out.print("平均:"+(float)sum/count);
      
	}

}
