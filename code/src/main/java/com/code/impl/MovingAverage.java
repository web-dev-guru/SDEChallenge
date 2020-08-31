package com.code.impl;

import com.code.IMovingAverage;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 *
 *  Providing moving average of the last N elements added
 *
 * @author wesley wei
 *
 * @version 1.0
 */
public class MovingAverage implements IMovingAverage<Double> {
    /**
     * store the input element
     * **/
    private Queue<Double> movingQueue;
    /**
     * initial window with N
     * **/
    private Integer window;
    /**
     * sum value for the last N element
     * **/
    private Double sum;

    /**
     *
     *
     * **/
    public Double getAverage(Double element){
        sum+=element;
        movingQueue.offer(element);
        if(movingQueue.size()>this.window){
            sum-=movingQueue.poll();
            return sum/window;
        }else{
            return sum/movingQueue.size();
        }
    }
    public MovingAverage(Integer n){
        this.window=n;
        this.sum=0.0;
        this.movingQueue = new LinkedList<Double>();
    }

}