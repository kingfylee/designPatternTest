package com.code.obesrverPattern;

import sun.rmi.runtime.Log;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * Created by Administrator on 2016/8/25 0025.
 */
public class DataObserver implements Observer{

    private static final String TAG = "DataObserver";

    @Override
    public void update(Observable observable, Object data) {
        if (observable instanceof DataObservable){
            if (data instanceof DataBean){
                Log.getLog(TAG, ((DataBean)data).temperature+"",true);
            }
        }
    }

}
