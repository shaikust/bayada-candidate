package com.tsg.bayada.joy.exception;

public class KitchenStationNotFoundException extends RuntimeException  {
    /**
     *
     */
    private static final long serialVersionUID = -7471102383551692901L;

    public KitchenStationNotFoundException(String message) {
        super("kitchenstation not available");
    }

}
