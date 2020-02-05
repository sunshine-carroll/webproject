package com.sunshine.webproject.tuple;

public class FourTuple<A,B,C,D> extends ThreeTuple<A,B,C>{
    public final D d;
    public FourTuple(A a, B b, C c,D d) {
        super(a, b, c);
        this.d = d;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)//如果内存地址相同就返回true
            return true;
        if (!(obj instanceof FourTuple))
            return false;
        FourTuple that = (FourTuple)obj;
        return this.a.equals(that.a)&&this.b.equals(that.b)&&this.c.equals(that.c)&&this.d.equals(that.d);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();//31是梅森素数，编译器可以将乘法运算优化为移位运算和减法 31 * i ==（i << 5） - i
        result = 31 * result+d.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "["+a+", "+b+", "+c+", "+ d +"]";
    }
}
