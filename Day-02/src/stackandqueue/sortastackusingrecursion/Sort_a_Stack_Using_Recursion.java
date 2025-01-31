package stackandqueue.sortastackusingrecursion;


import java.util.ArrayList;
import java.util.Stack;

public class Sort_a_Stack_Using_Recursion {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(3);
        st.push(4);
        st.push(2);
        st.push(1);
        st.push(5);

        sortit(st);

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

    }

    static void sortit(Stack<Integer> st){
        if(st.empty())return ;
        int temp = st.pop();
        sortit(st);
        ArrayList<Integer> arr = new ArrayList<>();
        while(!st.isEmpty()&&st.peek()<temp){
            arr.add(st.pop());
        }
        st.push(temp);
        for(int i=arr.size()-1;i>=0;i--){
            st.push(arr.get(i));
        }
    }
}
