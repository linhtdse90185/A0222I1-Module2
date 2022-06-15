package codegym.stackqueue;

public class MyQueue<E> {
    private Node front;
    private Node rear;

    public MyQueue() {
    }

    public void enqueue(E e) {
        Node n = new Node(e);
        if (this.front == null) {
            this.front = n;
        } else {
            this.rear.next = n;
        }
        this.rear = n;
        this.rear.next = this.front;
    }

    public E dequeue() {
        if (this.front == null) {
            return null;
        }
        E e = (E)this.front.data;
        this.front = this.front.next;
        this.rear.next = this.front;
        return e;
    }

    public void displayQueue() {
        if (this.front == null) {
            System.out.println("Queue is empty");
        }
        Node e = this.front;
        do {
            System.out.println(e.data);
            e = e.next;
        } while (e != this.front);
    }
}
