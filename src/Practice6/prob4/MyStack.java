package practice6.prob4;

public class MyStack implements Stack {
    private int top = -1;
    private int capacity;
    String myStack[];

    MyStack(int size) throws MyStackException {
        this.capacity = size;
        if (size < 1) {
            throw new MyStackException("init stack capacity > 0");
        }
        myStack = new String[size];
    }

    @Override
    public void push(String str) throws RuntimeException {
        if (str == null) {
            return;
        }
        else if (top + 1 == capacity) {
            capacity *= 2;
            String tempStack[] = new String[capacity];
            System.arraycopy(myStack, 0, tempStack, 0, this.size());
            myStack = tempStack;
        }
        top++;
        myStack[top] = str;
    }

    @Override
    public String pop() throws RuntimeException {
        if (isEmpty() == false) {
            String ret = myStack[top];
            top--;
            return ret;
        }
        String ret = "스택이 비었다";
        return ret;
    }

    @Override
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return top + 1;
    }
}
