public class StackArray {        //I will use it for arrays

    private int[] stack;    // no one allowed to contact with the array directly  // I need array, because I will use index
    private int capacity = 10;
    int top;

    public StackArray() {        //constructor

        stack = new int[capacity];
        top = -1;               // I need value for top, because it's empty.
    }

    public void push(int newVal) {      //add to stack

        if (top == capacity - 1) {       //if top as index = array size -1 (it means it's full)  //if array is full
            resize();                   // another method  I call to make the capacity bigger.
        }
        stack[++top] = newVal;      //This code works only when I enter first number, and when I want to add a number. Not when the array is full.
    }                               // ++top increase top then we add new value.

    public int pop() {      // delete last number

        if (top == -1) {
            System.out.println("stack is empty!");
            return -1;
        }
        int popElement = stack[top];        // the element I want to delete. (logically only)
        top--;
        return popElement;
    }

    public int getTop() {       // return the last number     // I can combine it with pop() // I will not delete, just view.

        if (top == -1) {
            return -1;
        }
        return stack[top];
    }

    private void resize() {      // What are the advantages and disadvantages? (BTEC)

        capacity = capacity * 2;
        int[] newArray = new int[capacity];         // I make new array, not the same array, and move everything to it.

        for (int i = 0; i < stack.length; i++) {
            newArray[i] = stack[i];
        }
        stack = newArray;           // I need to rename it, so I don't get confused everytime I use this method.
    }
}
