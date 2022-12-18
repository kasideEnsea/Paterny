package proxy;

import java.util.Random;

public class DBConnectorImpl implements IDBConnector {
    public String connect(String dbName){
        StringBuilder connectedDB = new StringBuilder("localhost:");
        Random random = new Random();
        int min = 1024;
        int max = 65536;
        connectedDB.append(random.nextInt((max - min) + 1) + min);
        connectedDB.append("/"+dbName);
        return connectedDB.toString();
    }
}
