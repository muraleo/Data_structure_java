import java.util.*; //for rand random method
import java.lang.Math.*;

public class Binary_search{
	public int[] sample = new int[10];

	public static void main(String[] args){
		new Binary_search().go();
	}

	public void go(){
		utilRandom();
		System.out.print("Original list is:");
		sample=insertSortBody(sample);
		printArray();
		int target = singleRandom(sample.length);
		System.out.println("Target is "+target);
		boolean result = binarySearch(sample, target, 0, sample.length-1);
		if(result){
			System.out.println("Find target");
		}else{
			System.out.println("Not find target");
		}
	}

	//Binary search body
	public boolean binarySearch(int[] list, int target, int low, int high){
		int mid = (low+high)/2;
		//check target, low, high
		System.out.println("target: "+target+" low: "+low+" high: "+high);
		if(low<high){ //end condition
			if(list[mid] == target){
				return true;
			}else if(target<list[mid]){
				return binarySearch(list, target, low, mid); //just use mid
			}else{
				return binarySearch(list, target, mid, high);
			}
		}else{
			return false;
		}
	}

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

	public void printArray(){
		for(int e:sample){
			System.out.print(" "+e);
		}
		System.out.println();
	}

	//return a single random number between 0 to seed
	public int singleRandom(int seed){
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		return sample[rand.nextInt(seed)];
	}

	public void utilRandom(){
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		for(int i = 0; i<sample.length; i++){
			sample[i]=rand.nextInt(100);
		}
	}
}