package com.code.a07;

import java.util.Arrays;

/**
 * 模拟栈
 * 小贴士：通常可以利用栈实现字符串逆序，还可以利用栈判断分隔符是否匹配，如<a[b{c}]>，可以正进反出，栈为空则成功。
 * @author HCY
 * @since 2021/4/27 7:54 上午
*/
public class Stack {

    private Object[] arrays;

    private int max;

    private int top;


    public Stack() { }

    /**
     * 初始化栈
     * @author HCY
     * @since 2021/4/27 8:12 上午
     * @param max: 栈的长度
     * @return null
    */
    public Stack(int max) {
        if (max > 0){
            this.arrays = new Object[max];
            this.max = max;
            this.top = -1;
        }else {
            throw new RuntimeException("初始化大小：" + max);
        }
    }

    /**
     * 动态扩容
     * @author HCY
     * @since 2021/4/27 8:20 上午
     * @return void
    */
    public void expansion(){
        // << 左移运算符，1表示乘以2的1次方
        if(top == this.max - 1){
            this.max = this.max << 1;
            this.arrays = Arrays.copyOf(this.arrays, this.max);
        }
    }

    /**
     * 查看栈顶元素
     * @author HCY
     * @since 2021/4/27 8:30 上午
     * @return void
    */
    public Object seeTop(){
        if (this.top != -1){
            return this.arrays[top];
        }else {
            throw new RuntimeException("stack is null");
        }
    }

    /**
     * 入栈
     * @author HCY
     * @since 2021/4/27 8:23 上午
     * @param value: 元素
     * @return void
    */
    public void enter(Object value){
        //动态扩容
        this.expansion();
        //增加元素
        this.arrays[++this.top] = value;
    }

    /**
     * 出栈
     * @author HCY
     * @since 2021/4/27 8:27 上午
     * @return void
    */
    public Object out(){
        Object seeTop = this.seeTop();
        this.arrays[this.top--] = null;
        return seeTop;
    }
}
