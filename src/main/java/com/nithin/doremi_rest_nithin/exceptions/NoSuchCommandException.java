package com.nithin.doremi_rest_nithin.exceptions;

public class NoSuchCommandException extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6041088676930830997L;

	public NoSuchCommandException(String msg){
        super(msg);
    }
}
