package Exception_Handling;

public class RecordNotFoundException extends RuntimeException {
    public RecordNotFoundException(String msg) {
        super(msg);
    }
}
