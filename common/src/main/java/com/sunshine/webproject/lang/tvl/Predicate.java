package com.sunshine.webproject.lang.tvl;

import java.util.Objects;

@FunctionalInterface
public interface Predicate<T> {
    Constant test(T t);

    default Predicate<T> and(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t).and(other.test(t)) ;
    }


    default Predicate<T> negate() {
        return (t) -> test(t).negate();
    }


    default Predicate<T> or(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t).or(other.test(t));
    }

}
