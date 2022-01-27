import java.util.*;

public class h1 {

    public static void main(String[] args){

        Queue<SNode> maxHeap = new PriorityQueue<>();
        SNode node1 = new SNode(13);
        SNode node2 = new SNode(2);
        SNode node3 = new SNode(140);

        maxHeap.add(node1);
        maxHeap.add(node2);
        maxHeap.add(node3);

        System.out.println(maxHeap.stream().findFirst().get().value);


    }
}

class SNode implements Comparable<SNode>{

    int value;

    SNode(int value){
        this.value = value;
    }

    @Override
    public int compareTo(SNode node){
        if (this.value == node.value) {
            return 0;
        }
        return this.value < node.value? 1: -1;
    }
}