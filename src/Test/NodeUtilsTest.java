package Test;

import NodeUtils.Node;
import org.junit.Test;

import static NodeUtils.NodeUtls.reverse;

/**
 * Created by andre on 17/01/2017.
 */
public class NodeUtilsTest {




    @Test
    public void reverseTest() {

        Node<Integer> x=new Node<>(1,
                new Node<>(2,
                        new Node<>(3,
                                new Node<>(4,
                                        new Node<>(5,
                                                new Node<>(6,
                                                        new Node<>(7,
                                                                new Node<>(8,null))))))));


        int k=3;

        Node aux=reverse(x,k);
        while(aux!=null){
            System.out.println(aux.value);
            aux=aux.next;
        }


    }

}
