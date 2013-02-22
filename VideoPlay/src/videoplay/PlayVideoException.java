package videoplay;



public class PlayVideoException extends Exception{
    
    public PlayVideoException(){
        System.out.println("Cant render video stream..");
    }
    
    public PlayVideoException(String message) {
	super(message);
    }
 
    public PlayVideoException(Throwable cause) {
	super(cause);
    }
 
    public PlayVideoException(String message, Throwable cause) {
	super(message, cause);
    }
 
}
