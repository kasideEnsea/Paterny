import adapter.*;
import factory.CoffeeMachine;
import factory.CoffeeType;
import proxy.DBConnectorImpl;
import proxy.DBConnectorProxy;
import proxy.IDBConnector;
import singleton.FirstTread;
import singleton.SecondTread;

public class Main {

    public static void main(String[] args) {


        /*
        Паттерн фабрика
        */
        System.out.println("Паттерн фабрика");
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.makeCoffee(CoffeeType.LATTE, 0.5);
        coffeeMachine.makeCoffee(CoffeeType.AMERICANO, 0.0);
        System.out.println();

        /*
        Паттерн адаптер
        */
        System.out.println("Паттерн адаптер");
        ICard card = new SDCard();
        IUSB adapter = new USBAdapter(card);
        System.out.println(Computer.getData(adapter));
        System.out.println();

        /*
        Паттерн прокси: DBConnectionImpl генерирует полную строку URL с рандомным значением порта.
        Если имя базы уже было сгенерировано, оно берется из кэша
        */
        System.out.println("Паттерн прокси");
        IDBConnector connector = new DBConnectorProxy(new DBConnectorImpl());
        System.out.println(connector.connect("myBase"));
        System.out.println(connector.connect("myBase"));
        System.out.println();

        /*
        Логгер-синглтон: создаются два треда, SecondTread выполняется быстрее и логгируется первым
        */
        System.out.print("Паттерн синглтон");
        FirstTread ft = new FirstTread();
        SecondTread st = new SecondTread();
        ft.start();
        st.start();
        System.out.println();

    }
    
}
