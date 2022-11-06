package Stack_queues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyStackTest {


    @Test
    public void given3NumberWhenLinkedShouldPassedLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode.getNext());
        mySecondNode.setNext(myThirdNode.getNext());
        boolean result = myFirstNode.getNext().equals(myFirstNode) &&
                mySecondNode.getNext().getNext().equals(myThirdNode);
        Assert.assertTrue(result);

    }

    @Test
    public void given3NumberWhenLinkedShouldPassedLinkedListTest() {
        MyStack<Integer>myStackTest = new MyStack<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode.getNext());
        mySecondNode.setNext(myThirdNode.getNext());
        boolean result = myFirstNode.getNext().equals(myFirstNode) &&
                mySecondNode.getNext().getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
