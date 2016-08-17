package lan.example.thread_example;

public class Main {

    
    static HelperSingletonBillPugh INSTANCE_TEST_THREAD = HelperSingletonBillPugh.getInstance();    
    static ThreadExample[] myThreads = new ThreadExample[10];
    static final int COUNT = 10;

    public static void main(String[] args) { 

        for (int i = 0; i < COUNT; i++) {
            myThreads[i] = new ThreadExample();
            if (i == 0) {              
                INSTANCE_TEST_THREAD.setCurentThreadId(myThreads[i].getId());
            }
            myThreads[i].start();
        }
    }
}
