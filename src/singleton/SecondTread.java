package singleton;

/*
Второй поток с задержкой 0.2с
После sleep вызывает logger
*/
public class SecondTread extends Thread {

    public SecondTread(){
        super();
    }

    public void run(){
        try{
            Thread.sleep(200);
            Logger.log(this, "выполнен");
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
    }
}
