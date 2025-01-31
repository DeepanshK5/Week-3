package stackandqueue.queue;

import java.util.Stack;

public class queue{
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    void enqueue(int x){
        st1.push(x);
    }

    void dequeue(){
        int num;
        if(st1.empty()){
            System.out.println("Stack is empty");
        }
        else{
            while(st1.size()>1){
                st2.push(st1.pop());
            }
            num = st1.pop();
            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }
    }

    int front(){
        int num=-1;
        if(st1.empty()){
            System.out.println("Stack is empty");
            return num;
        }
        else{
            while(st1.size()>1){
                st2.push(st1.pop());
            }
            num=st1.peek();
            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }
        return num;
    }

    boolean isEmpty(){
        return st1.isEmpty();
    }

    void displayQueue(){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        while(!st2.isEmpty()){
            System.out.print(st2.peek()+" ");
            st1.push(st2.pop());
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        queue q1 = new queue();

        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);

        q1.displayQueue();
        q1.dequeue();
        q1.displayQueue();
        q1.dequeue();
        q1.displayQueue();
        q1.dequeue();
        q1.displayQueue();

        System.out.println("Is queue empty "+q1.isEmpty());
    }
}