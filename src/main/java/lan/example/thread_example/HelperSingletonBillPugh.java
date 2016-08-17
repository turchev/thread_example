package lan.example.thread_example;

public class HelperSingletonBillPugh {

    private HelperSingletonBillPugh() {
    }

    private static class SingletonHandler {
        private static final HelperSingletonBillPugh INSTANCE = new HelperSingletonBillPugh();
    }

    public static HelperSingletonBillPugh getInstance() {
        return SingletonHandler.INSTANCE;
    }

    private long counter = 0L;
    private long curentThreadId = 0L;
    private long minThreadId = 0L;

    public long getMinThreadId() {
        return this.minThreadId;
    }

    public void setMinThreadId(long minThreadId) {
        this.minThreadId = minThreadId;
    }

    public long getCounter() {
        return this.counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }

    public long getCurentThreadId() {
        return this.curentThreadId;
    }

    public void setCurentThreadId(long threadId) {
        this.curentThreadId = threadId;
    }

    public void incremenCurentThreadId() {
        this.curentThreadId++;
    }
}
