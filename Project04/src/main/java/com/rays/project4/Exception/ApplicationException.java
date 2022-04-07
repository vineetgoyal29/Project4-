package com.rays.project4.Exception;

/**
 * ApplicationException is propogated from Service classes when an business
 * logic exception occurered.
 * 
 * @author vishu
 *
 */
public class ApplicationException extends Exception{
	public ApplicationException(String msg){
		super(msg);
	}

}
