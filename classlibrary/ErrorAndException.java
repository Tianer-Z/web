package classlibrary;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ErrorAndException {
    private void throwError() {
        throw new StackOverflowError();
//        throw new NoClassDefFoundError();
//        throw new OutOfMemoryError();
    }
    private void throwRuntimeException() {
        throw new IndexOutOfBoundsException();
//        throw new ClassCastException();
//        throw new IllegalArgumentException();
//        throw new NullPointerException();
//        throw new NumberFormatException();

    }
    private void throwCheckedException() throws ClassNotFoundException {
        throw new ClassNotFoundException();
//        throw new IOException();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        ErrorAndException eae = new ErrorAndException();
        eae.throwError();
        eae.throwRuntimeException();
        eae.throwCheckedException();
    }
}
