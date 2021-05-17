package com.dataStructure.a09.code;

import java.util.Arrays;

/**
 * 模拟栈
 * @author HCY
 * @since 2021/5/13 3:09 下午
*/
public class Stack<T> {

    /**
     * 数据
     */
    private T[] data;

    /**
     * 栈的长度
     */
    private int maxSize;

    /**
     * 栈顶元素
     */
    private int top;

    /**
     * 默认操作
     * @author HCY
     * @since 2021/5/17 7:36 下午
     * @return null
    */
    public Stack() {
    }

    /**
     * 初始化
     * @author HCY
     * @since 2021/5/17 7:48 下午
     * @param size: 位置大小
     * @return void
    */
    public void initStack(int size) {
        this.data = (T[]) new Object[size];
        this.maxSize = size;
        this.top = -1;
    }

    /**
     * 入栈
     * @author HCY
     * @since 2021/5/13 8:21 下午
     * @param value: 入栈的元素
     * @return void
    */
    public void push(T value){
        if ( this.top < this.maxSize - 1 ){
            this.data[++this.top] = value;
        }
    }

    /**
     * 出栈
     * @author HCY
     * @since 2021/5/17 5:51 下午
     * @return void
    */
    public void pop(){
        this.data[this.top] = null;
        this.top--;
    }

    /**
     * 查看栈顶元素
     * @author HCY
     * @since 2021/5/17 7:54 下午
     * @return T
    */
    public T getTop(){
        return this.data[this.top];
    }

    /**
     * 查看栈的元素
     * @author HCY
     * @since 2021/5/17 7:55 下午
     * @return int
    */
    public int stackLength(){
        int sum = 0;
        try {
            for (T datum : this.data) {
                if (datum != null) {
                    sum++;
                }
            }
            return sum;
        }catch (Exception e){
            return sum;
        }
    }

    /**
     * 判断栈是否为空
     * @author HCY
     * @since 2021/5/17 8:08 下午
     * @return boolean
    */
    public boolean stackEmpty(){
        if (stackLength() == 0) {
            return true;
        }
        return false;
    }

    /**
     * 清空栈
     * @author HCY
     * @since 2021/5/17 8:19 下午
     * @return void
    */
    public void stackClear(){
        this.data = (T[]) new Object[this.maxSize];
        this.top = -1;
    }

    /**
     * 销毁栈
     * @author HCY
     * @since 2021/5/17 8:23 下午
     * @return void
    */
    public void stackDestruction(){
        this.maxSize = 0;
        this.top = -1;
        this.data = null;
    }

    /**
     * 输出模式
     * @author HCY
     * @since 2021/5/17 7:16 下午
     * @return java.lang.String
    */
    @Override
    public String toString() {
        try {
            return Arrays.toString(this.data);
        }catch (Exception e){
            return "";
        }
    }
}
