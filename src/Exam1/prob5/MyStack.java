package Exam1.prob5;

public class MyStack implements Stack {
    private int top = -1;
    private int capacity;
    String myStack[];

    MyStack(int size) {
        this.capacity = size;

        if (size < 1) {
            System.out.println("init stack capacity > 0");
        }
        else {
            myStack = new String[size];
        }
    }

    @Override
    public void push(String str) throws RuntimeException {
        if (str == null) {
            return;
        }
        else if (top + 1 == capacity) {
            System.out.println("스택이 다 차서 용량을 기존의 2배로 늘릴거임");
            System.out.println("현재 스택 용량: " + capacity);

            capacity *= 2;
            String tempStack[] = new String[capacity];
            System.arraycopy(myStack, 0, tempStack, 0, this.size());
            myStack = tempStack;
        }
        top++;
        myStack[top] = str;
    }

    @Override
    public String pop() {
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
