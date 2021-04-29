package com.code.a09;

/**
 * 链表
 * @author HCY
 * @since 2021/4/29 2:17 下午
*/
public class LinkedList {
    /**
     * 头元素
     */
    private Node head;

    /**
     * 尾元素
     */
    private Node tail;

    /**
     * 节点数
     */
    private int size;

    /**
     * 无参 初始化
     * @author HCY
     * @since 2021/4/29 4:07 下午
     * @return null
    */
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * 项链表头添加数据
     * @author HCY
     * @since 2021/4/29 6:38 下午
     * @param value: 数值
     * @return void
    */
    public void addHead(Object value){
        Node node = new Node(value);
        if (this.size == 0){
            this.head = node;
            this.tail = node;
        }else {
            this.head.setPrevious(node);
            this.tail.setNext(this.tail);
        }
        this.size++;
    }

    /**
     * 删除标签头
     * @author HCY
     * @since 2021/4/29 6:46 下午
     * @return void
    */
    public void delHead(){
        if (this.size != 0){
            this.head.setPrevious(null);
            this.head = this.head.getNext();
            size--;
        }
    }

    /**
     * 添加尾部
     * @author HCY
     * @since 2021/4/29 6:56 下午
     * @param value: 节点值
     * @return void
    */
    public void addTail(Object value){
        Node node = new Node(value);
        if (this.size == 0){
            this.head = node;
            this.tail = node;
        }else {
            node.setPrevious(this.tail);
            node.setNext(node);
        }
        this.size++;
    }

    /**
     * 删除尾部
     * @author HCY
     * @since 2021/4/29 6:56 下午
     * @return void
    */
    public void delTail(){
        if (this.size != 0){
            this.tail.setNext(null);
            this.tail = this.tail.getPrevious();
            this.size--;
        }
    }

    /**
     * 现实链表
     * @author HCY
     * @since 2021/4/29 7:00 下午
     * @return void
    */
    public void display(){
        Node node = this.head;
        while (size > 0){
            System.out.print("["+node.getData()+"->");
            node = node.getNext();
            size--;
        }
    }

}
