public class SimpleStack <T>
{
    private Node tos = null;
    
    public void push(T data)
    {
        Node newNode = new Node(data,tos);
        tos = newNode;
    }
    
    public T pop()
    {
        T result;
        if(tos != null)
        {
            result = tos.data;
            tos = tos.next;
        }
        else
            result = null;
        return result;
    }
    
    public T top()
    {
        return tos.data;
    }        

    public boolean isEmpty()
    {
        return tos == null;  // top of stack
    }
    
    public void print()
    {
        for(Node current = tos; current != null; current = current.next)
            System.out.println(current.data);        
    }
    
    private class Node
    {
        private T data;
        private Node next;
        
        public Node(T data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }
}
