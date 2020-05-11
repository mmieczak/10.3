package data;

public class DuplicateException extends RuntimeException {
    public DuplicateException(String such_name_already_exist) {
        super(such_name_already_exist);
    }
}
