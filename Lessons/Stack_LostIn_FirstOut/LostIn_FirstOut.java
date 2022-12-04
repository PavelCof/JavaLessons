package Lessons.Stack_LostIn_FirstOut;

import java.util.Stack;

public class LostIn_FirstOut {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(7);
        stack.push(1);

//        System.out.println(stack.pop());  // извлекает элемент
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        System.out.println(stack.peek()); //показывает элемент не извлекая

        while (!stack.empty()){  //пройдет по очереди пока она не опустеет
            System.out.println(stack.pop());
        }




    }
}
