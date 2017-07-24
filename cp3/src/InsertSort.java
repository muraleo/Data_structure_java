import java.util.*;
import java.lang.Math.*;

public class InsertSort{
	public int[] unSorted = new int[10];

	public InsertSort(){
		//mathRandom();
		utilRandom();
	}

	public static void main(String[] args){
		InsertSort se = new InsertSort();
		se.go();
	}

	public void printArray(){
		for(int e: unSorted){
			System.out.print(" "+e);
		}
		System.out.println(""); //println()  must has a argument
	}

	public void go(){
		System.out.print("Original number list is:");
		printArray();
		unSorted = insertSortBody(unSorted);
		System.out.print("insert sort number list is:");
		printArray();
	}

	//insert sort algorithm
	public int[] insertSortBody(int[] raw){
		for(int i = 1; i < raw.length; i++){
			int temp = raw[i];
			int j = i;
			while(j>0 && temp<raw[j-1]){
				raw[j] = raw[j-1];
				j--;
			}
			raw[j] = temp;
		}
		return raw;
	}

	public void mathRandom(){
		for(int i=0; i<unSorted.length; i++){
			unSorted[i] = (int)(Math.random()*100);
		}
	}

	public void utilRandom(){
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		for(int i = 0; i<unSorted.length; i++){
			unSorted[i]=rand.nextInt(100);
		}
	}

}