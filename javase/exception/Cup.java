package javase.exception;

public class Cup {
    private int capacity;

    public void setCapacity(int capacity) throws CapcacityTooSmallException, CapacityTooBigException {
        if (capacity < 0) {
            CapcacityTooSmallException small = new CapcacityTooSmallException("Too Small " + capacity);
            throw small;
        }

        if (capacity > 10000) {
           CapacityTooBigException big = new CapacityTooBigException("Too Big " + capacity);
           throw big;
        }

        this.capacity = capacity;
    }
}
