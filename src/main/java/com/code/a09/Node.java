package com.code.a09;

/**
 * 节点
 * @author HCY
 * @since 2021/4/29 2:20 下午
*/
public class Node {
    /**
     * 数据
     */
    private Object data;

    /**
     * 上一个
     */
    private Node previous;

    /**
     * 下一个
     */
    private Node next;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
