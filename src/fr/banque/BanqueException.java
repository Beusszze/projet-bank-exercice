package fr.banque;

public class BanqueException extends Exception {
	
	/**
	 * Exception class that I used to manage several exceptions that can occurs during the process
	 * 
	 */
	
	
	// Constructors inherates from mother Class "Exception"
	
	public BanqueException () {
		super ();
	}
	public BanqueException(Throwable cause) {
		super(cause);
	}
		
	public BanqueException(String message) {
		super(message);
		}

	
	public BanqueException(String message, Throwable cause) {
		super(message, cause);
	}

	
	

	

	
	// No method 

	

}
