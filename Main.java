import java.util.Scanner;

public class Main {     
	public static void main(String[] args) {   //O(A+B+n)
	    Scanner in=new Scanner(System.in); //O(1)
	        
	    //Ladders
	    System.out.println("Enter number ladders:");   //O(1)
	    int AL=in.nextInt();    //O(1)
	    int A[][]=new int[AL][2];  //O(1)
	    
	    
	    for(int i=0;i<AL;i++) {  //O(A)
	    	System.out.println("Enter the beginning and end of ladder"+"("+(i+1)+")"); //O(A)
	    	int a1=in.nextInt(); //O(A)
	    	int a2=in.nextInt(); //O(A)
	    	A[i][0]=a1; //O(A)
	    	A[i][1]=a2; //O(A)
	    }
	    
	    System.out.println("-----------------------"); //O(1)
	    
	    //Snakes
	    System.out.println("Enter number snakes:"); //O(1)
	    int BS=in.nextInt();    //O(1)
	    int B[][]=new int[BS][2]; //O(1)
	    
	    for(int i=0;i<BS;i++) { //O(B)
	    	System.out.println("Enter the beginning and end of snake"+"("+(i+1)+")"); //O(B)
	    	int b1=in.nextInt(); //O(B)
	    	int b2=in.nextInt(); //O(B)
	    	B[i][0]=b1;    //O(B)
	    	B[i][1]=b2;    //O(B)
	    }
	    
	    System.out.println("-----------------------"+"\n");  //O(1)
	    
	    SankeLadder.test(A,B);	//O(A+B+n)
	    
	    
	    
	    
	}

}
