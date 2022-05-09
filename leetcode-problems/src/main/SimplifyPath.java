package main;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimplifyPath {
    public static String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        Deque<String> stack = new ArrayDeque<>();

        for (String str: path.split("/")) {

            if(str.equals("") || str.equals("."))
                continue;
            if(str.equals("..")) {
                if(!stack.isEmpty())
                    stack.pop();
            }
            else
                stack.push(str);
        }

        while (!stack.isEmpty()) {
            sb.append("/");
            sb.append(stack.pollLast());
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }

    public static void main(String[] args) {

        System.out.println("Simple Path: " + simplifyPath("/home/ihj/../myp/../jhg../"));
    }
}
