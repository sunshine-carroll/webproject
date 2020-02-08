package com.sunshine.webproject.modeling_computation.interfaces;

public interface State<I> {
    State<I> transfer(I input);
}
