package com.rays.project4.Exception;

/**
 * DatabaseException is propogated by DAO classes when an unhandled Database
 * exception occurred.
 * 
 * @author vishu
 *
 */
public class DatabaseException extends Exception{
	public DatabaseException(String msg){
		super(msg);
	}

}
