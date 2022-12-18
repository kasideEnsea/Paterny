package singleton;


/*
Логгер-синглтон для работы с потоками
*/
public class Logger
{
    private static volatile Logger singleton;

    private Logger() {};

    public static void log(Object o, String message){
        if (singleton == null) {
            synchronized (Logger.class) {
                if (singleton == null) {
                    singleton = new Logger();
                }
            }
        }
        System.out.printf("loginfo: class %s - message %s%n", o.getClass().getName(), message);
    }
}
