public class DLLNode {

    int value;
    DLLNode next;
    DLLNode prev;

    public DLLNode(int value) {   // constructor

        this.value = value;
        next = prev = null;
    }
}
