import java.util.*;
public class Main {        //StackAl
static class stack{
    ArrayList<Integer>list=new ArrayList<>();

    public void push(int data){
        list.add(data);
    }
    public boolean isEmpty(){
        return list.size()==0;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=list.remove(list.size()-1);
        return top;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
}

public static void main(String[] args) {
    Stack stack=new Stack();
    stack.add(1);
    stack.add(2);
    stack.add(3);
    stack.add(4);

    while(!stack.isEmpty()) {
        System.out.println(stack.peek());
        stack.pop();
    }
    }
}