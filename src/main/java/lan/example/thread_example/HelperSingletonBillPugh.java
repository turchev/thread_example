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
    
    private long curentThreadId = 0L;   // Поток, который должен выполнить вывод сообщения

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
