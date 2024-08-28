package stack;

public class QueueOfStrings {
    private class Node {
        String data; // Renamed from 'item'
        Node nextNode; // Renamed from 'next'
    }

    private Node front; // Renamed from 'first'
    private Node rear;  // Renamed from 'last'

    public QueueOfStrings() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(String data) { // Renamed from 'item'
        Node previousRear = rear; // Renamed from 'oldlast'
        rear = new Node();
        rear.data = data;
        rear.nextNode = null;

        if (isEmpty()) {
            front = rear;
        } else {
            previousRear.nextNode = rear;
        }
    }

    public String dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue underflow");
        }
        String data = front.data;
        front = front.nextNode;

        if (isEmpty()) {
            rear = null;
        }
        return data;
    }

    public int size() {
        int nodeCount = 0; // Renamed from 'count'
        Node currentNode = front; // Renamed from 'current'
        while (currentNode != null) {
            nodeCount++;
            currentNode = currentNode.nextNode;
        }
        return nodeCount;
    }
}
