/**
 * Created by Pranith on 1/21/17.
 */
import java.util.*;

public class Queue {


    Stack<Integer> value=new Stack<>();
    Stack<Integer> temp=new Stack<>();

    /** Initialize your data structure here. */
    public Queue() {


    }

    /** Push element x to the back of queue. */
    public void push(int x) {

        if(value.empty()){
            value.push(x);
        }
        else{
            while(!value.empty()){
                temp.push(value.pop());
            }
            value.push(x);

            while(!temp.empty()){
                value.push(temp.pop());
            }
        }


    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {

        return value.pop();

    }

    /** Get the front element. */
    public int peek() {
        return value.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return value.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */