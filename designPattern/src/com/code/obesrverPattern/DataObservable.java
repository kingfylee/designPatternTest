package com.code.obesrverPattern;

import java.util.Observable;

/**
 * 被观察的数据
 * Created by Administrator on 2016/8/25 0025.
 */

public class DataObservable extends Observable {

    private static volatile DataObservable instance;
    private DataObservable() {}

    public static DataObservable getInstance() {
        if (instance == null){
            synchronized (DataObservable.class) {
                if (instance == null){
                    instance = new DataObservable();
                }
            }
        }
        return instance;
    }

    public void notifyDataChanged(DataBean data) {
        setChanged();
        notifyObservers(data);
    }

}
