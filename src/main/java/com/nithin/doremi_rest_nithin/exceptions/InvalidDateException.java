package com.nithin.doremi_rest_nithin.exceptions;

public class InvalidDateException extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1881060172663907428L;

	public InvalidDateException(String msg){
        super(msg);
    }
}
