//package com.company.companyWise.expedia;
//
//import java.util.Stack;
//
//class MaxStack {
//
//    Stack<Integer> stack=new Stack<>();
//    Stack<Integer> maxStack=new Stack<>();
//
//    public MaxStack() {
//
//    }
//
//    public void push(int x) {
//
//        stack.push(x);
//        if(maxStack.isEmpty()|| maxStack.peek()<=x)
//        {
//            maxStack.push(x);
//        }
//
//    }
//
//    public int pop() {
//        if(!maxStack.isEmpty() && maxStack.peek().equals(stack.peek()))
//        {
//            maxStack.pop();
//        }
//       return stack.pop();
//
//    }
//
//    public int top() {
//        return stack.peek();
//
//    }
//
//    public int peekMax() {
//        return maxStack.peek();
//
//    }
//
//    public int popMax() {
//
//
//    }
//}
//
///**
// * Your MaxStack object will be instantiated and called as such:
// * MaxStack obj = new MaxStack();
// * obj.push(x);
// * int param_2 = obj.pop();
// * int param_3 = obj.top();
// * int param_4 = obj.peekMax();
// * int param_5 = obj.popMax();
// */
