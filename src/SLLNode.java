public class SLLNode {      //the starting point.
    int value;
    SLLNode next;           //node takes the same type as class //point to
    public SLLNode(int value) {          //this is constructor,  it's only job is: create node and add value to it.

        this.value = value;                //this: pointer point to itself.
        next = null;                    //null: keep it empty and wait until value connect to it.
    }
}
