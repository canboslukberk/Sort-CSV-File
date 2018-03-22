import java.io.FileNotFoundException;

public class Compare {
	String[][] main;
	int size, column;
	ReadAllLines file = new ReadAllLines();
	SelectionSort select = new SelectionSort();
	MergeSort merge = new MergeSort();
	HeapSort heap = new HeapSort();
	WriteToFile write = new WriteToFile();

	public Compare(String[][] main, int size, int column, String statu, String dir){
		this.main = main;
		this.size = size;
		this.column = column;
		comparate(statu, dir);
		
	}
	
	public void comparate(String statu, String dir){
		long startTime, endTime;

		Double[] sclm = new Double[size];
		Double[] mclm = new Double[size];
		

		
		for(int i=0; i<size; i++){
			sclm[i] = Double.parseDouble(main[i+1][column]);
		}
		/*
		for(int i=0; i<size; i++){
			hclm[i] = Double.parseDouble(main[i+1][column]);
		}
		for(int i=0; i<size; i++){
			mclm[i] = Double.parseDouble(main[i+1][column]);
		}
		*/	

//Selection Sort Starts
		//startTime = System.nanoTime();
		//select.sort(sclm, main);
		//endTime = System.nanoTime();
/*		for(int i=0; i<size; i++){
			System.out.println(i+" "+sclm[i]);
		}
		*/
		//System.out.println("Selection"+"\n"+"+start:"+ startTime+"\n"+
		//		"end: "+endTime+"\n"+
		//		"total :"+ (endTime-startTime)
		//		);
//Selection Sort Ends
//Merge Sort Starts
		//startTime = System.nanoTime();
		//merge.sort(sclm, 0, sclm.length-1, main);
		//endTime = System.nanoTime();
/*		for(int i=0; i<size; i++){
			System.out.println(i+" "+mclm[i]);
		}
		*/
		
		//System.out.println("Selection"+"\n"+"start:"+ startTime+"\n"+
		//		"end: "+endTime+"\n"+
		//		"total :"+ (endTime-startTime)
		//		);
		
//Heap Sort Starts
		startTime = System.nanoTime();
		heap.sort(sclm, main);
		endTime = System.nanoTime();
		

	//	for(int i=0; i<size; i++){
	//		System.out.println(i+" "+sclm[i]);
	//	}
		
		
	//	System.out.println("Heap"+"\n"+"start:"+ startTime+"\n"+
	//			"end: "+endTime+"\n"+
	//			"total :"+ (endTime-startTime)
	//			);
		
//Heap Sort Ends
		if(statu.equals("T")){
			try {
				write.arrayToList(main, dir);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}else if(statu.equals("F")){
			
		}else
			System.out.println("Hatali bir arguman girdiniz");
	}
	
	
}
//farklý arraylerde mainleri tut sabit kalmasýn.


