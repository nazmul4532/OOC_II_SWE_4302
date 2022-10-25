import java.util.*;
public class MaxStack {
    Stack<Integer> stack = new Stack<Integer>();
    public int maxVal=0;

    public void push(int number)
    {
        if (stack.empty()) {
            maxVal = number;
            stack.push(number);
            return;
        }


        if (number > maxVal) {
            stack.push(2 * number - maxVal);
            maxVal = number;
        }

        else
            stack.push(number);
    }

    public int pop()
    {
        if (stack.empty()) {
            return -1;
        }

        int poppedValue = stack.peek();
        stack.pop();


        if (poppedValue > maxVal) {
            maxVal = 2 * maxVal - poppedValue;
            return (maxVal+poppedValue)/2;
        }

        else
            return poppedValue;

    }
    public int max(){
        if(stack.empty())
        {
            return -1;
        }
        else
            return maxVal;
    }
}
