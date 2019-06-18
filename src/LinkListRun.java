public class LinkListRun {
    public static void main(String[] args) {
        LinkList<String> ll = new LinkList<String>();
        ll.addNode("Himanshu");
        ll.addNode("Himan");
        ll.addNode("Hershit");
        ll.addNode("Hersh");
        ll.displayNode();
        ll.deleteNode();
        ll.displayNode();
    }
}
