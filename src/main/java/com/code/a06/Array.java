package com.code.a06;

/**
 * 模拟数组
 * @author HCY
 * @since 2021/4/26 7:38 下午
*/
public class Array {

    /**
     * 数据
     */
    private int[] arrays;

    /**
     * 数组内元素的长度
     */
    private int elems;

    /**
     * 长度
     */
    private int length;

    /**
     * 初始化数组
     * @author HCY
     * @since 2021/4/26 7:47 下午
     * @param max: 最大值
     * @return null
    */
    public Array(int max) {
        this.length = max;
        this.arrays = new int[length];
        this.elems = 0;
    }

    /**
     * 添加元素
     * @author HCY
     * @since 2021/4/26 7:47 下午
     * @param value: 插入的数据
     * @return void
    */
    public void add(int value){
        if (elems == length){
            System.out.println("error");
            return;
        }
        this.arrays[this.elems] = value;
        this.elems ++;
    }

    /**
     * 查找该元素在数组中的位置
     * @author HCY
     * @since 2021/4/26 7:52 下午
     * @param value: 需要查找的元素
     * @return int
    */
    public int find(int value){
        int i = 0;
        for (; i < this.elems ; i++){
            if (this.arrays[i] == value){ break; }
        }
        if (i == elems){
            return -1;
        }
        return i;
    }

    /**
     *
     * @author HCY
     * @since 2021/4/26 8:14 下午
     * @param value: 需要删除的元素
     * @return boolean
    */
    public boolean delete(int value){
        //通过查找的方法获取到该元素的位数
        int i = find(value);
        //如果是-1则删除失败
        if (i == -1){
            return false;
        }
        //进行前移
        for (int j = i ; j < elems - 1 ; j ++){
            this.arrays[j] = arrays[j + 1];
        }
        elems --;
        return true;
    }

    /**
     * 更新数组
     * @author HCY
     * @since 2021/4/26 8:27 下午
     * @param oldValue: 需要更新的元素
     * @param newValue: 更新的元素
     * @return boolean
    */
    public boolean update(int oldValue,int newValue){
        //获取需要更新的元素的位置
        int i = find(oldValue);
        //判断元素是否存在
        if(i == -1){
            return false;
        }
        this.arrays[i] = newValue;
        return true;
    }

    /**
     * 显示所有
     * @author HCY
     * @since 2021/4/26 8:37 下午
     * @return void
    */
    public void display(){
        for(int i = 0 ; i < this.elems ; i++){
            System.out.print(this.arrays[i]+" ");
        }
        System.out.print("\n");
    }

    /**
     * 冒泡排序
     * 每趟冒出一个最大数/最小数
     * 每次运行数量：总数量-运行的趟数(已冒出)
     * @author HCY
     * @since 2021/4/26 8:43 下午
     * @return void
    */
    public void bubbleSort(){
        for (int i = 0 ; i < this.elems - 1 ; i++ ){
            System.out.println("第" + (i + 1) + "趟：");
            for (int j = 0; j < this.elems - i - 1; j++){
                if (this.arrays[j] > this.arrays[j + 1]){
                    int temp = this.arrays[j];
                    this.arrays[j] =  this.arrays[j + 1];
                    this.arrays[j + 1] = temp;
                }
                display();
            }
        }
    }

    /**
     * 选择排序
     * 每趟选择一个最大数/最小数
     * 每次运行数量：总数量-运行的趟数(已选出)
     * @author HCY
     * @since 2021/4/26 9:14 下午
     * @return void
    */
    public void selectSort(){
        //排序趟数  n-1次就行了
        for(int i = 0; i < this.elems-1; i++) {
            int min = i;
            //排序次数 每趟选择一个数出来，-1次
            for(int j = i+1; j < this.elems; j++){
                if(this.arrays[j] < this.arrays[min]){
                    min = j;
                }
            }
            if(i != min ){
                int temp = this.arrays[i];
                this.arrays[i] = this.arrays[min];
                this.arrays[min] = temp;
            }
            display();
        }
    }

    /**
     * 插入排序
     * 每趟选择一个待插入的数
     * 每次运行把待插入的数放在比它大/小后面
     * @author HCY
     * @since 2021/4/26 9:19 下午
     * @return void
    */
    public void insertSort(){
        int j;
        for(int i = 1; i < this.elems; i++){
            int temp = this.arrays[i];
            j = i;
            while (j > 0 && temp < this.arrays[j-1]){
                this.arrays[j] = this.arrays[j-1];
                j--;
            }
            this.arrays[j] = temp;
        }
        display();
    }

}
