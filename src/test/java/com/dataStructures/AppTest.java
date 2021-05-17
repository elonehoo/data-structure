package com.dataStructures;

import com.dataStructure.a08.code.Node;
import com.dataStructure.a09.code.Stack;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        Stack<Integer> stack = new Stack<>();
        System.out.println("栈是否为空 ---> " + stack.stackEmpty());
        System.out.println("未初始化之前 ---> " + stack);
        stack.initStack(5);
        System.out.println( "初始化之后 ---> " + stack);
        stack.push(1);
        stack.push(2);
        System.out.println( "压栈之后 ---> " + stack);
        System.out.println("栈是否为空 ---> " + stack.stackEmpty());
        System.out.println( "查看栈的元素个数 ---> " + stack.stackLength());
        System.out.println( "查看栈顶 ---> " + stack.getTop());
        stack.pop();
        System.out.println( "出栈之后，查看栈顶 ---> " + stack.getTop());
        System.out.println( "查看栈 ---> " + stack);
        stack.stackClear();
        System.out.println("查看栈 ---> " + stack);
        stack.stackDestruction();
        System.out.println("查看栈 ---> " + stack);
    }
}
