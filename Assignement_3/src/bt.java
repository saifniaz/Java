/* 
 * Name: MD. Saif Niaz
 * ID# 100555440
 * Assignment-3
 */
public class bt {
  public static void main(String[] args) {

    int integerRange = Integer.parseInt(args[1]);
    int streamLength = Integer.parseInt(args[2]);
    int seed = Integer.parseInt(args[0]);
    int[] search = {Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5])};
    int[] at = {Integer.parseInt(args[6]), Integer.parseInt(args[7]), Integer.parseInt(args[8])};

    Stream stream = new Stream(integerRange, seed);  // 100 is the range of integers
    StreamProcessor processor = new StreamProcessor();

    long timeStart = System.currentTimeMillis();
    for (int i=0; i<streamLength; ++i) {
    	System.out.println(stream.getNext());
      //processor.consume(stream.getNext());
    }
    long timeEnd = System.currentTimeMillis();

    // HERE YOU WILL PERFORM SEARCHES AND COLLECT TIMES
    // AND PREPARE THE OUTPUT
    if(streamLength < 50000){
    	processor.show();
    }
    System.out.println("To set up tree: " +(timeEnd - timeStart) + " ms");
    
    long timeStart1 = System.currentTimeMillis();
    int[] temp = processor.search(search[0]);
    int[] temp1 = processor.search(search[1]);
    int[] temp2 = processor.search(search[2]);
    long timeEnd1 = System.currentTimeMillis();
    
    System.out.print("search(" + search[0] + ") = ");
    if(temp.length > 1){
	    for(int x = 0; x < temp.length; x++){
	    	System.out.print( temp[x] + " ");
	   }
    }else{
    	System.out.print(temp[0] + " ");
    }
    System.out.println(" ");
    System.out.print("search(" + search[1] + ") = ");
    if(temp1.length > 1){
	    for(int x = 0; x < temp1.length; x++){
	    	System.out.print( temp1[x] + " ");
	   }
    }else{
    	System.out.print(temp1[0] + " ");
    }
    System.out.println(" ");
    System.out.print("search(" + search[2] + ") = ");
    if(temp2.length > 1){
	    for(int x = 0; x < temp2.length; x++){
	    	System.out.print( temp2[x] + " ");
	   }
    }else{
    	System.out.print(temp2[0] + " ");
    }
    System.out.println(" ");
    System.out.println("To search values: " +((timeEnd1 - timeStart1)/3.0) + " ms");
    long timeStart2 = System.currentTimeMillis();
    for(int c = 0; c < at.length; c ++){
    	System.out.println("at(" + at[c]+") = " + processor.at(at[c]));
    }
    long timeEnd2 = System.currentTimeMillis();
    System.out.println("To search index: " +((timeEnd2 - timeStart2)/3.0) + " ms");
  }
}