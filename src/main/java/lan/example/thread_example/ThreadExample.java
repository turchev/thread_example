package lan.example.thread_example;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class ThreadExample extends Thread {

    static HelperSingletonBillPugh INSTANCE_TEST_THREAD = HelperSingletonBillPugh.getInstance();

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadExample.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (INSTANCE_TEST_THREAD.getCurentThreadId() == this.getId()) {
                
                // Раскомментируй следующую строку
                //INSTANCE_TEST_THREAD.incremenCurentThreadId();

                System.out.println("Print " + this.getName()
                        + " ### ID:" + this.getId()
                        + " ### getCurentThreadId: " + INSTANCE_TEST_THREAD.getCurentThreadId());

                // Закоментируй следующую строку
                INSTANCE_TEST_THREAD.incremenCurentThreadId();          

                break;
            }
        }
    }

}
