package codes;

import java.util.Iterator;
import java.util.Stack;

public class stackExam {
    
    public static void example() {

        Stack<Integer> stack = new Stack<Integer>();
        
        // pushing or puting something on to stack.
        for (int i=0; i<10;i++) {
            stack.push(i);
        }

        // pop or taking something from the stack
        for(int i=0; i<5;i++) {
            int stackItem = stack.pop();
            System.out.println("Stack item (pop): "+stackItem);
        }

        // to see the last item on top of the stack
        int topItem = stack.peek();
        System.out.println("The top item on the stack is: " + topItem);

        // to see the first item of the stack
        int firstItem = stack.firstElement();
        System.out.println("The first item (last to be removed) on the stack is: " + firstItem);

        // find the index of certain element in stack
        int idx = stack.search(3);
        System.out.println("The index of item '3' in the stack is: " + idx);


        // iterating through a stack
        Iterator<Integer> its = stack.iterator();
        while(its.hasNext()){
            Integer stackIt = its.next();
            System.out.println("Iterator stack item: "+ stackIt);
        }




    }

}
