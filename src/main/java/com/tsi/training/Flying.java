package com.tsi.training;

public interface Flying {

    public default String takeOff(){
        return "Taking off!!";
    }

    public default String flying(){
        return "I'm flying!!";
    }

    public default String landing(){
        return "I am landing!!";
    }
}
