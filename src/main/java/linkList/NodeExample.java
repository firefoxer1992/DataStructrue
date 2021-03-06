package linkList;

/**
 * Created by lenovo on  十月
 * @author lin
 */
public class NodeExample {
    /**
     * 初始化一个链表，各节点存放元素为0到5
     * @return
     */
    public Node initial(){
        Node node5=new Node(5,null);
        Node node4=new Node(4,node5);
        Node node3=new Node(3,node4);
        Node node2=new Node(2,node3);
        Node node1=new Node(1,node2);
        Node node0=new Node(0,node1);

        return node0;
    }

    /**
     * 初始化只有一个节点的链表
     * @return
     */
    public Node initialOneNode(){
        Node node=new Node (0,null);
        return node;
    }
}
