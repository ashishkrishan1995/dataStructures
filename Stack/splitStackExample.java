/* GOAL: Splits a stack of integers into the negative and non-negative integers. Uses stack and queue manipulation. */
// Example: input [2, -10, 15, 0, -4, 100] --> output [-4, -10, 2, 100, 0, 15]

public class splitStackExample {

	public void splitStack(Stack<Integer> s) {
	    Queue<Integer> q = new LinkedList<Integer>();

	    int negCount = 0;

	    while(!s.isEmpty()) {
	        if (s.peek() < 0) {
	            negCount++;
	        }
	        q.add(s.pop());
	    }

	    while(negCount > 0) {
	        if (q.peek() < 0) {
	            s.push(q.remove());
	            negCount--;
	        } else {
	            q.add(q.remove());
	        }
	    }

	    while(!q.isEmpty()) {
	        s.push(q.remove());
	    }
	}

}
