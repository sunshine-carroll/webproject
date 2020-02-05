package com.sunshine.webproject.tuple;
/**
 * 用来表示三个集合的笛卡尔积 中的元组
 * @author sunshine
 * @date 2019-09-11
 * */
public class ThreeTuple<A,B,C> extends TwoTuple<A,B>{
    public final C c;
    public ThreeTuple(A a, B b,C c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = result+31*c.hashCode();//31是梅森素数，编译器可以将乘法运算优化为移位运算和减法 31 * i ==（i << 5） - i
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)//如果内存地址相同就返回true
            return true;
        if (!(obj instanceof ThreeTuple))
            return false;
        ThreeTuple that = (ThreeTuple)obj;
        return this.a.equals(that.a)&&this.b.equals(that.b)&&this.c.equals(that.c);
    }

    @Override
    public String toString() {
        return "["+a+", "+b+", "+c+"]";
    }
}
