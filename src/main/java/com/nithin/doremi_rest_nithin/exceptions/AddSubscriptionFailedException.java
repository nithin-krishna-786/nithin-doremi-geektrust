package com.nithin.doremi_rest_nithin.exceptions;

public class AddSubscriptionFailedException extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7880222094082204056L;

	public AddSubscriptionFailedException(String msg){
        super(msg);
    }
}
