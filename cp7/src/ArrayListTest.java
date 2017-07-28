public class ArrayListTest{
	private ArrayList<Integer> al;

	public ArrayListTest(){
		al = new ArrayList<>();
	}

	public static void main(String[] args){
		new ArrayListTest().go();
	}

	public void go(){
		al.add(0,3);
		printArray();
		//al.add(0,4);
		//printArray();
		al.remove(1);
		printArray();
	}

	public void printArray(){
		for(int i = 0;i<al.size(); i++){
			System.out.print(" "+al.get(i));
		}
		System.out.println();
	}
}