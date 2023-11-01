public class MyThread implements Runnable {
    MyThread(){
        new Thread(this).start();
    }
    public void run() {

        for (int i = 1; i <=5 ; i++) {
            System.out.println(i);

        }
//        Thread th = Thread.currentThread();
//        String name = th.getName();
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i + name);
//            try {
//                Thread.sleep(250);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }


        }
    }

