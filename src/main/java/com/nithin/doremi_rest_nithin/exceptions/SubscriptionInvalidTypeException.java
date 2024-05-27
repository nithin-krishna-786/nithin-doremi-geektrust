package com.nithin.doremi_rest_nithin.exceptions;

public class SubscriptionInvalidTypeException extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = 2441888617130489314L;

	public SubscriptionInvalidTypeException(String msgStr){
        super(msgStr);
    }
}
