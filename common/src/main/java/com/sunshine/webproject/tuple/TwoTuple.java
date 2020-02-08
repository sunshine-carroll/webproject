package com.sunshine.webproject.tuple;
/**
 * 用来表示两个集合的笛卡尔积 中的元组
 * immutable Object
 * @author hongliutao
 * @date 2019-09-01 15:33:00
 * */
public class TwoTuple<A,B> {
    public final A a;
    public final B b;
    public TwoTuple(A a,B b){
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TwoTuple))
            return false;
        TwoTuple target = (TwoTuple)obj;
        return a.equals(target.a)&&b.equals(target.b);
    }

    @Override
    public int hashCode() {
        int result = a.hashCode();
        result = 31*result+b.hashCode();//31是梅森素数，编译器可以将乘法运算优化为移位运算和减法 31 * i ==（i << 5） - i
        return result;
    }

    @Override
    public String toString() {
        return "["+a+", "+b+"]";
    }
}
