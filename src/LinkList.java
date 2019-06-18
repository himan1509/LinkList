
public class LinkList<T> {
    Node head;
    public LinkList(){
        head = null;
    }
    public void addNode(Object value){
        Node newNode = new Node(value, null);
        if(head == null){
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void deleteNode(){
        head = head.next;
    }
    public void displayNode(){
        Node n = head;
        while (n!=null){
            System.out.println((T)n.value);
            n = n.next;
        }
    }
}
