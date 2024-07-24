package abstraction;

public interface MyBank {

//    DECLARES ONLY
    void read();
    void write();
}

class RBI implements MyBank{
    @Override
    public void read() {
        System.out.println("RBI can read");
    }
    @Override
    public void write() {
    }
}