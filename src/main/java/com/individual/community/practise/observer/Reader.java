package com.individual.community.practise.observer;

import java.util.Observable;
import java.util.Observer;

//观察者
public class Reader implements Observer {


    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("尊敬的用户"+name+":"+arg);
    }


    @Override
    public String toString() {
        return "读者："+name;
    }
}


