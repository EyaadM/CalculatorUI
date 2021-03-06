package view;
import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



public class ComboPermutationChecker {


    public static void main(String[] args) {
        int x, y, z, a, b, c;

        Scanner uinput = new Scanner(System.in);
        System.out.println("List the first number:");
        x = uinput.nextInt();
        System.out.println("List the second number:");
        y = uinput.nextInt();
        System.out.println("List the third number:");
        z = uinput.nextInt();
        int input[] = {x, y, z};

        System.out.println("Your numbers are: " + Arrays.toString(input));

        System.out.println("List the first number:");
        a = uinput.nextInt();
        System.out.println("List the second number:");
        b = uinput.nextInt();
        System.out.println("List the third number:");
        c = uinput.nextInt();
        int output[] = {a, b, c};

        System.out.println("Your numbers are: " + Arrays.toString(output));


        int n = 3;
        if (checkStackCombination(input, output, n)) {
            System.out.println("Yes, the lists are permutations of each other");
        }
        else {
            System.out.println("No, the lists are not permutations of each other");
        }
//        if (((a/b/c)+a) == ((x/y/z)+x)) {
//            System.out.println("Yes, they are Permutations of one another");
//        }
//        else {
//            System.out.println("No, they are not Permutations of one another");
//        }




}


    static boolean checkStackCombination(int ip[], int op[], int n)
    {
        Queue<Integer> input = new LinkedList<>();

        // Input queue
        for (int i = 0; i < n; i++)
        {
            input.add(ip[i]);
        }

        // Output queue
        Queue<Integer> output = new LinkedList<>();
        for (int i = 0; i < n; i++)
        {
            output.add(op[i]);
        }

        // stack to be used for Combination
        Stack<Integer> tempStack = new Stack<>();
        while (!input.isEmpty())
        {
            int ele = input.poll();

            if (ele == output.peek())
            {
                output.poll();
                while (!tempStack.isEmpty())
                {
                    if (tempStack.peek() == output.peek())
                    {
                        tempStack.pop();
                        output.poll();
                    }
                    else
                        break;
                }
            }
            else
            {
                tempStack.push(ele);
            }
        }

        // If after processing, both input queue and
        // stack are empty then the input queue is
        // permutable otherwise not.
        return (input.isEmpty() && tempStack.isEmpty());
    }

}
