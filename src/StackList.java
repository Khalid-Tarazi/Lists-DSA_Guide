public class StackList {        //I will use it for lists

    private DLL myList = new DLL();     //I will use DLL for lists, it is not array.
    DLLNode top;        // top is the tail.  // DLLNode because it's pointer.

    public StackList() {        //constructor
        top = null;
    }

    public void push(int data) {

        myList.addToTail(data);
        top = myList.tail;          // updating to last tail.
    }

    public int pop() {           //In case I want to print, I can print every element I pop.

        if (top == null)
            return -1;
        else {
            int popVal = myList.deleteFromTail();
            top = myList.tail;
            return popVal;
        }
    }

    public int getTop() {        //optional

        if (top == null)
            return -1;

        else
            return top.value;
    }
}
