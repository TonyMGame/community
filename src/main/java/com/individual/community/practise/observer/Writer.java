package com.individual.community.practise.observer;

import java.util.Observable;

//被观察者
public class Writer extends Observable {


    //内容改变，就发送通知给读者
    public void upDateNovel(String content){
        setChanged();
        notifyObservers(content);
    }

}
