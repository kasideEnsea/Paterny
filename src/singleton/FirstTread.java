package singleton;

/*
Первый поток с задержкой 0.5с
После sleep вызывает logger
*/
public class FirstTread extends Thread {

    public FirstTread(){
        super();
    }

    public void run(){
        try{
            Thread.sleep(500);
            Logger.log(this, "выполнен");
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }

    }
}
