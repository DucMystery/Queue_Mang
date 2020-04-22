public class TestClient {

    public static void main(String[] args) {

        MyQueue queue = new MyQueue(5);
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
