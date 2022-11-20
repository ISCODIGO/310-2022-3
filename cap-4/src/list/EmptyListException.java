package list;

public class EmptyListException extends RuntimeException {
    public EmptyListException() {
        super("Empty List");
    }
}
