import java.util.*;

public class SumOfNumber{
	private int[] sample = new int[10];

	public static void main(String[] args){
		new SumOfNumber().go();
	}

	public void go(){
		generateArray();
		int sum = listSum(sample, sample.length-1);
		System.out.println("sum is "+ sum);
	}

	public int listSum(int[] temp, int n){
		if(n>0){
			return listSum(temp, n-1)+temp[n];
		}else{
			return 0; //remember every condition has a return value
		}
	}

	public void generateArray(){
		for(int i = 0; i < sample.length; i++){
			sample[i] = i+1;
		}
	}
}