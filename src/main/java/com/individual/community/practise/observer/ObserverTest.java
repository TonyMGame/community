package com.individual.community.practise.observer;

public class ObserverTest {


    public static void main(String[] args) {
        Reader jia=new Reader("小贾");
        Reader luo=new Reader("小罗");
        Reader xie=new Reader("小谢");
        Reader dong=new Reader("小董");
        Reader liu=new Reader("小刘");

        Writer author=new Writer();

        author.addObserver(jia);
        author.upDateNovel("这是最新内容");

    }
}
