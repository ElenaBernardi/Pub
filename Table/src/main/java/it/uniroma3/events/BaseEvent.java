package it.uniroma3.events;

public class BaseEvent<T> {
    //viene usato Java Generics in maniera che il campo id sia flessibile
    //ad ogni classe diversa che estende questa classe
    public final T id;

    public BaseEvent(T id){
        this.id = id;
    }
}
