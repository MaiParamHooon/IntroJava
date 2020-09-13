package collectionFramework.collectionInterface.list;



public class MakeS<E> {
	
		MakeLL <E> ll = new MakeLL<>();
		
		void push (E e) {
			
			ll.add(e);
		}
		
		E pop() throws Exception {
			if(ll.isEmpty()) {
				throw new Exception(" Popping from empty stack is not allowed");
				
			}
			
			return ll.removeLast();
		}
		
		E peek() throws Exception{
				if(ll.isEmpty()) {
					throw new Exception(" Peeking from empty stack is not allowed");
					
				}
				
				return ll.getLastElement();
			
		}
		
		
}
