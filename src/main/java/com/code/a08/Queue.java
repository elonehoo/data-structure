package com.code.a08;

/**
 * 模拟队列
 * 单向循环队列
 * @author HCY
 * @since 2021/4/28 9:41 上午
*/
public class Queue {
    /**
     * 顺序结构实现效果
     */
    private Object[] queue;

    /**
     * 队列大小
     */
    private int max;

    /**
     * 顶部
     */
    private int top;

    /**
     * 底部
     */
    private int bottom;

    /**
     * 实际元素个数
     */
    private int item;

    /**
     * 初始化
     * @author HCY
     * @since 2021/4/28 9:52 上午
     * @param size: 队列的大小
     * @return null
    */
    public Queue(int size) {
        this.max = size;
        this.queue = new Object[size];
        this.top = 0;
        this.bottom = -1;
        this.item = 0;
    }

    /**
     * 入队
     * @author HCY
     * @since 2021/4/28 9:57 上午
     * @param value: 入队元素
     * @return void
    */
    public void add(Object value){
        //判断队列是否是满的
        if (this.item == this.max){
            throw new RuntimeException(
                    value + " made a mistake when he joined the team. The team is full");
        }
        //循环队列，首尾结合，下标控制队首和队尾位置
        if (this.bottom == this.max - 1){
            this.bottom = -1;
        }
        //入队添加
        this.queue[++this.bottom] = value;
        //增加实际元素个数
        this.item++;
    }

    /**
     * 出队
     * @author HCY
     * @since 2021/4/28 10:06 上午
     * @return void
    */
    public Object out(){
        //判断队列是否为空
        if (item == 0){
            throw new RuntimeException("Is the queue empty");
        }
        //取出顶部元素
        Object value = this.queue[this.top];
        //声明原顶栈可以回收空间(GC)
        this.queue[this.top] = null;
        top++;
        //重置下标
        if (this.max == this.top){
            this.top = 0;
        }
        this.item--;
        return value;
    }
}
