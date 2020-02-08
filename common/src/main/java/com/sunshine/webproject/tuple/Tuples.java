package com.sunshine.webproject.tuple;
/**
 * <p>
 *          所有的 tuple 都是不可变对象，其线程安全性委托给tuple的状态(或者说成员变量)
 *      设E是tuple的属性集,e是E属性，P(x) 是命题函数：x是线程安全的
 *      [∀e∈E,P(e)]→P(tuple)
 * </p>
 * <p>  tuple实现了equals()，和hashCode()方法，能够在java的容器类库中表现出正确的行为</p>
 * <p>  tuple也实现了toString() 方法简单的列出元组中各个对象的toString()</p>
 * <p>  equals()的判断采用tuple中的所有成员变量，也就是说tuple的超码，候选码，主码都是tuple的属性集</p>
 * @author hongliutao
 * @date 2019-09-11
 * */
public final class Tuples {
    /**
     * @param a a
     * @param b b
     * @return  a,b 的元组
     * */
    public static <A,B>  TwoTuple<A,B> getTuple(A a,B b){
        return new TwoTuple(a,b);
    }

    public static <A,B,C> ThreeTuple<A,B,C> getTuple(A a,B b,C c){
        return new ThreeTuple(a,b,c);
    }

    public static <A,B,C,D> FourTuple<A,B,C,D> getTuple(A a,B b,C c,D d){
        return new FourTuple<>(a,b,c,d);
    }
}
