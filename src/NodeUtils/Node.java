package NodeUtils;

/**
 * Created by andre on 17/01/2017.
 */
public class Node<E> {

    public E value;
    public Node next;

    public Node(E value, Node next){
        this.value=value;
        this.next=next;
    }

    Node(){
        value=null;
        next=null;

    }
    Node(E value){
        this.value=value;
    }

}
