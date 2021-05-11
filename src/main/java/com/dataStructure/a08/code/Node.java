package com.dataStructure.a08.code;

/**
 * 单链表
 * @author HCY
 * @since 2021/5/9 7:11 下午
*/
public class Node<T> {
    /**
     * 数据
     */
    private T data;

    /**
     * 节点
     */
    private Node<T> node;

    /**
     * 空参
     * @author HCY
     * @since 2021/5/10 7:45 下午
     * @return null
    */
    public Node() { }

    /**
     * 有参
     * @author HCY
     * @since 2021/5/10 7:45 下午
     * @param data: 数据
    */
    public Node(T data) {
        this.data = data;
    }

    /**
     * 初始化操作
     * @author HCY
     * @since 2021/5/10 6:14 下午
     * @return void
    */
    public void initialization(){
        this.data = null;
        this.node = null;
    }

    /**
     * 获取下一个节点的操作
     * @author HCY
     * @since 2021/5/10 6:14 下午
     * @return com.dataStructure.a08.code.Node<T>
    */
    public Node<T> next(){
        return this.node;
    }

    /**
     * 获取单链表的长度
     * @author HCY
     * @since 2021/5/10 6:18 下午
     * @return int
    */
    public int getLength(){
        int size = 0;
        if (this.data != null){
            size++;
            Node<T> temp = this;
            while (temp.next() != null) {
                temp = temp.next();
                size++;
            }
        }
        return size;
    }

    /**
     * 判断单链表是否为空
     * @author HCY
     * @since 2021/5/10 6:21 下午
     * @return boolean
    */
    public boolean empty(){
        return this.getLength() == 0;
    }

    /**
     * 默认添加
     * @author HCY
     * @since 2021/5/10 6:27 下午
     * @param value: 需要填充的值
     * @return void
    */
    public void defaultInsert(T value){
        int length = this.getLength();
        if (length == 0){
            this.data = value;
        }else {
            this.getNode(length - 1).node = new Node<>(value);
        }
    }

    /**
     * 选择插入
     * @author HCY
     * @since 2021/5/11 9:07 上午
     * @param index: 位置
     * @param value: 值
     * @return void
    */
    public void selectInsert(int index , T value){
        this.getNode(index - 1).data = value;
    }

    /**
     * 获取在线性表中的这个位置
     * @author HCY
     * @since 2021/5/10 6:33 下午
     * @param index: 位置
     * @return T
    */
    public Node<T> getNode(int index){
        Node<T> nextValue = this;
        if (index >= this.getLength()){
            throw new IndexOutOfBoundsException("The single linked table data no longer exists");
        }
        for (int i = 0 ; i < index ; i++){
            nextValue = nextValue.next();
        }
        return nextValue;
    }

    /**
     * 需要删除的位置
     * @author HCY
     * @since 2021/5/10 8:09 下午
     * @param index: 位置
     * @return void
    */
    public void remove(int index){
        if (index >= this.getLength()){
            throw new IndexOutOfBoundsException("The linear table you want to delete does not exist");
        }
        this.getNode(index - 1).data = this.getNode(index).data;
        this.getNode(index - 1).node = this.getNode(index).node;
    }

    /**
     * 获取当前节点的数据
     * @author HCY
     * @since 2021/5/10 6:15 下午
     * @return T
    */
    public T getData() {
        return this.data;
    }

    /**
     * 输出
     * @author HCY
     * @since 2021/5/10 7:28 下午
     * @return java.lang.String
    */
    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", node=" + node +
                '}';
    }
}
