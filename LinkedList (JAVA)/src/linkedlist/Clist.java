package linkedlist;

class Clist {
  Node first;
  boolean isEmpty(){
      return (first==null);
  }
    void insertAfterFirst(Node input){
  		if (isEmpty()){	//Jika linked list masih kosong,
   			first = input;	//maka head dan tail sama dengan node input
   			input.next=first;
  		}
  		else {
   			input.next = first.next;	//Jika linked list sudah berisi,
   			first.next = input;	//maka input akan di depan dan menjadi head
  		}
 	}
    
	void insertAfter(int key,Node input){
  		Node temp = first;
  		do {
   			if (temp.data == key){	//Jika data sama dengan key, maka input
   				input.next = temp.next; //disambung diantara temp dan temp.next
   				temp.next = input;
   				System.out.println("Insert data is succeed.");
   				break;	//dari temp --> temp.next menjadi :
   			}			//temp --> input --> temp.next
   			temp = temp.next;
  		}
  		while (temp!=first);
 	}

 	void insertBefore(int key,Node input){
 		Node temp = first;
 		do{
 			if ((temp.data == key)&&(temp == first)){
 			    while(temp.next!=first) temp=temp.next;
                            input.next=first;temp.next=input;
                            System.out.println("Insert data is succeed.");
 			    break;
 			}
 			else if (temp.next.data == key){
 				input.next = temp.next;	//dari temp --> temp.next menjadi
 				temp.next = input;			//temp --> input --> temp.next
 				System.out.println("Insert data is succeed.");
 				break;
 			}
 			temp = temp.next;
 		}
        	while (temp.next != first);

 	}
 	void remove(int key){
 		Node temp = first;
 		if (!isEmpty()){
 			do {
 				if (temp.next.data == key){	//mengganti temp.next dengan
 					temp.next = temp.next.next; //temp.next.next
 					break;	//dari temp --> temp.next -->temp.next.next
 				}			//menjadi temp --> temp.next.next
 				else if ((temp.data == key)&&(temp == first)){
 			                while(temp.next!=first) temp=temp.next;
                                        temp.next=first.next;first=first.next;
                        		break;		//maka call method removeFirst
 				}
 				temp = temp.next;
 			}while (temp.next != first); 
 		} else System.out.println("Data is empty!");
 	}

 	void findReplace (int key,int nilai){
 		Node temp = first;
                if(temp.data==key) temp.data=nilai;else{
  		  while (temp.next != first){
   			if (temp.data == key){
    			    temp.data = nilai;
    			    break;
   			}
   			temp = temp.next;
  		   }
                }  
 	}

 	void printNode(){
  		Node temp;
  		temp = first;
  		while (temp.next != first){
   			System.out.print(temp.data+" ");
   			temp = temp.next;
  		}
                System.out.print(temp.data+" ");
   		System.out.println();
 	} 
}