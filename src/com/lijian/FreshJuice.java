package com.lijian;

enum FreshJuiceSize {SMALL, MIDDLE, LARGE}

public class FreshJuice {

    private FreshJuiceSize size;

    FreshJuice(){
        size = FreshJuiceSize.LARGE;
    }

    public boolean isType(FreshJuiceSize  type){
        return this.size == type;
    }
}
