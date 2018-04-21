public class RunForYourLife implements Runnable {

    private Thread thread;
    private String threadName;
    private int delayTime;

    public RunForYourLife(int delay, String name){
        threadName=name;
        delayTime=delay;
        System.out.println(threadName+", ready.");
    }

    public void start(){
        System.out.println(threadName+", set..." );
        if (thread==null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }

    @Override
    public void run(){
        System.out.println(threadName+", go!");
        try{
            for (int checkpoint=0; checkpoint < 20; checkpoint++){
                System.out.println(threadName+" has passed checkpoint ("+(checkpoint+1)+")");
                Thread.sleep(delayTime);
            }
        }catch(InterruptedException ie){
            System.out.println(threadName+" was interrupted.");
        }
        System.out.println(threadName+" has finished!");
    }



}
