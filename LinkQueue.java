class LinkQueue<T>{ //O(1)
   
    private Node<T> Head;   //O(1)
    private Node<T> Tail;   //O(1)
    public int size;        //O(1)
    
    public LinkQueue() {  //O(1)
    	Head=Tail=null;  //O(1)
    	size=0;          //O(1)
    }
    
    public void enqueue(T d) { //O(1)
    	Node<T> p = new Node<T>(d); //O(1)
        
    	if(Head==null) //O(1)
            Head=Tail=p; //O(1)
        
    	else{  //O(1)
            Tail.next=p;  //O(1)
            Tail=Tail.next; //O(1)
        }
        size++;  //O(1)
    }
    
    public int length() { //O(1)
    	 return size; //O(1) 
    }
    
    public T dequeue() {  //O(1)
        T x=Head.data;  //O(1)
        Head=Head.next; //O(1)
        
        if(Head==null)  //O(1)
     	   Tail=null;   //O(1)
        
        size--;    //O(1)
        return x;  //O(1)
    }
    
    

}
