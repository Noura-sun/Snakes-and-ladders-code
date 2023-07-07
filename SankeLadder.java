class SankeLadder {
	static Vertex square[]; //O(1)
	
	public static int shortestPath(Vertex square[]) {  //O(n)
		LinkQueue<Vertex> q=new LinkQueue<Vertex>();  //O(1)
		square[0].visited=1;      //O(1)
		square[0].num=0;          //O(1)
		square[0].distance=0;     //O(1)
		Vertex front=square[0];   //O(1)
		q.enqueue(front);              //O(1)
		
		while(q.length()>0) {//O(n)
			front=q.dequeue();    //O(n)
			
			if(front.num==99)     //O(n)
				return front.distance; //O(n)
			
			for(int j=front.num+1; j<=(front.num+6)&&j<100; ++j) { //O(n)
				
				if(square[j].visited==0) { //O(n)
					
					square[j].distance=(front.distance+1); //O(n)
					square[j].visited=1; //O(n)
					
					if(square[j].moves !=-1) //O(n)
						square[j].num=square[j].moves; //O(n)
					else  //O(n)
						square[j].num=j;  //O(n)
					
					q.enqueue(square[j]);  //O(n)
				}		
			}
		}
		return -1;  //O(n)
	}
	
	
	public static void test(int A[][],int B[][]) {   //O(A+B+n)~O(n)
		square = new Vertex[100];  //O(1)
		for(int i =0;i<100;i++)   //O(100) constant O(1)
			square[i]=	new Vertex(); //O(1)
		
		//Ladders
		for(int i=0; i<A.length;i++) {  //O(A)
			A[i][0]--; //O(A)
			A[i][1]--; //O(A)  
			square[A[i][0]].moves=A[i][1]; //O(A)
		}
		
		//Snakes
		for(int i=0;i<B.length;i++) {  //O(B)
			B[i][0]--;   //O(B)
			B[i][1]--;   //O(B)
			square[B[i][0]].moves=B[i][1];  //O(B)
		}
		 System.out.println("Distance of shortest path="+ shortestPath(square)); //O(n)
		 System.out.println("\n-----------------------"+"\n"); //O(1)
	
	}
	
	
	
}

	








	
	
	


