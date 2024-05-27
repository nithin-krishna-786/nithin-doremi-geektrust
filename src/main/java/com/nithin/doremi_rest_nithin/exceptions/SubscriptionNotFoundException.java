package com.nithin.doremi_rest_nithin.exceptions;

public class SubscriptionNotFoundException extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5815151360221199610L;

	public  SubscriptionNotFoundException(String msg){
        super(msg);
    }
}
