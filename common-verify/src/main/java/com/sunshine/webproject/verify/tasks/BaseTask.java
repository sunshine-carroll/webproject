package com.sunshine.webproject.verify.tasks;

public interface  BaseTask extends Runnable {

//    @Override
//    default void run(){
//        doSuccess();
//        doFailure();
//    }
//    void doSuccess();

    void doFailure();
}
