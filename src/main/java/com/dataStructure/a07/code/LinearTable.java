package com.dataStructure.a07.code;


/**
 * 线性表
 * @author HCY
 * @since 2021/5/4 2:56 下午
*/
public class LinearTable<T> {
    /**
     * 线性表的长度
     */
    private int length;
    /**
     * 线性表的内容
     */
    private T[] data;

    /**
     * 设置默认值
     */
    private final static int DEFAULT_LENGTH = 10;
    private final static int ELEMENT_NOT_FOUND = -1;

    /**
     * [空参](初始化)
     * @author HCY
     * @since 2021/5/4 3:16 下午
     * @return null
    */
    public LinearTable() {
        this(DEFAULT_LENGTH);
    }

    /**
     * [有参](初始化)
     * @author HCY
     * @since 2021/5/4 3:16 下午
     * @param capacity: 线性表的容量
     * @return null
    */
    public LinearTable(int capacity) {
        this.data = (T[]) new Object[Math.max(capacity, DEFAULT_LENGTH)];
    }

    /**
     * [判断线性表是否为空](若为空则返回true；反之则返回false)
     * @author HCY
     * @since 2021/5/4 3:25 下午
     * @return java.lang.Boolean
    */
    public Boolean empty(){
        return this.length == 0;
    }

    /**
     * 清空线性表
     * @author HCY
     * @since 2021/5/4 3:30 下午
     * @return void
    */
    public void clear(){
        for (int i = 0; i < this.length; i++) {
            this.data[i] = null;
        }
        this.length = 0;
    }

    /**
     * 获取线性表中第i的位置元素值
     * @author HCY
     * @since 2021/5/5 9:55 上午
     * @param index: 位置
     * @return T
    */
    public T getElement(int index){
        index = index - 1;
        //判断位置是否超过
        if (outRange(index)) {
            return this.data[index];
        }else {
            throw new IndexOutOfBoundsException("There are no elements in this location");
        }
    }

    /**
     * [判断元素是否在线性表中](如果存在则返回线性表的位置，反之则返回-1)
     * @author HCY
     * @since 2021/5/5 10:16 上午
     * @param elem: 元素
     * @return int
    */
    public int locateElem(T elem){
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i].equals(elem)){
                return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    /**
     * 默认插入元素
     * @author HCY
     * @since 2021/5/5 1:46 下午
     * @param elem: 需要新增的元素
     * @return void
    */
    public void defaultInsert(T elem){
        //判断是否需要扩容
        if (this.data.length == this.length) {
            increaseCapacity();
        }
        this.data[this.length] = elem;
        this.length++;
    }

    /**
     * 在指定的位置插入元素
     * @author HCY
     * @since 2021/5/5 10:30 上午
     * @param index: [位置](index - 1)
     * @param elem: 需要插入的元素
     * @return void
    */
    public void selectInsert(int index,T elem){
        index = index - 1;
        if (this.data.length == this.length){
            increaseCapacity();
        }
        //往后
        for (int i = this.data.length - 1; i > index; i--) {
            this.data[i] = this.data[i - 1];
        }
        this.data[index] = elem;
        this.length++;
    }

    /**
     * 在指定的位置替换元素
     * @author HCY
     * @since 2021/5/5 3:17 下午
     * @param index: [替换的位置](index - 1)
     * @param elem: 需要插入的元素
     * @return void
    */
    public void replaceInsert(int index, T elem){
        index = index - 1;
        if (outRange(index)) {
            this.data[index] = elem;
        }else {
            throw new IndexOutOfBoundsException("Cannot replace");
        }
    }

    /**
     * 删除该位置上的元素
     * @author HCY
     * @since 2021/5/5 3:31 下午
     * @param index: 需要删除元素的位置(index - 1)
     * @return void
    */
    public void remove(int index){
        index = index - 1;
        for (int i = index; i < this.length; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.length--;
    }

    /**
     * [扩容操作](线性表的长度 + 1)
     * @author HCY
     * @since 2021/5/5 11:08 上午
     * @return void
    */
    private void increaseCapacity() {
        T[] arr = (T[]) new Object[this.data.length + 1];
        for (int i = 0; i < this.data.length; i++) {
            arr[i] = this.data[i];
        }
        this.data = arr;
    }

    /**
     * [判断线性表中该位置是否存在元素](true为参数正确，false为无参数)
     * @author HCY
     * @since 2021/5/5 10:01 上午
     * @param index: 位置
     * @return java.lang.Boolean
    */
    private Boolean outRange(int index) {
        return index >= 0 && index <= this.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("The length of the linear table is ").append(this.length).append("\n");
        if (this.length != 0){
            result.append("data [ ");
            for (int i = 0; i < this.length; i++) {
                result.append(this.data[i]);
                if (i == this.length - 1){
                    result.append(" ]");
                }else {
                    result.append(",");
                }
            }
        }else {
            result.append("The data is empty");
        }

        return result.toString();
    }
}
