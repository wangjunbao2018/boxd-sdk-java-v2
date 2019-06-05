package one.contentbox.boxd.protocol.exceptions;

/**
 * Boxd Exception class
 */
public class BoxdException extends Exception{

    private int code;

    public BoxdException(int code, String message){
        super(message);
        this.code = code;
    }
}
