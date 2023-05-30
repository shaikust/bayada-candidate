package com.tsg.bayada.joy.exception;

public class OrderNotFoundException extends RuntimeException  {
	  /**
	 *
	 */
	private static final long serialVersionUID = -7471102383551692901L;

  public OrderNotFoundException() {
  }

  public OrderNotFoundException(Long id) {
	        super("Order with id: "+ id+" not found");
	    }

}
