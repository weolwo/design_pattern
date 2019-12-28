package com.poplar.observer.lambda;

/**
 * Created BY poplar ON 2019/12/28
 */
public interface Subject {

   void register(Observer observer);

   void notifyEachObserver(String t);

}
