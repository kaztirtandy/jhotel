import java.util.Random;

public class LetsGo {

    private static int lionelDelay;
    private static int andresDelay;
    private static int messiDelay;

    public static void main (String args[]) throws InterruptedException{

        messiDelay = random(500,100);
        System.out.println(lionelDelay+" "+andresDelay+" "+messiDelay);
        do {
            andresDelay = random(500,100);
            System.out.println(lionelDelay+" "+andresDelay+" "+messiDelay);
        }
        while (messiDelay > andresDelay);
        do {
            lionelDelay = random(500,100);
            System.out.println(lionelDelay+" "+andresDelay+" "+messiDelay);
        } while (andresDelay > lionelDelay);

        System.out.println("final: "+lionelDelay+" "+andresDelay+" "+messiDelay);

        RunForYourLife lionel = new RunForYourLife(lionelDelay,"Lionel");
        RunForYourLife andres = new RunForYourLife(andresDelay,"Andres");
        RunForYourLife messi = new RunForYourLife(messiDelay,"Messi");
        lionel.start();
        andres.start();
        messi.start();
        throw new InterruptedException("error");
    }

    public static int random(int max, int min) {
        Random rand = new Random();
        return rand.nextInt((max-min) + 1) + min;
    }

}
