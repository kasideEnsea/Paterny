package proxy;

import java.util.HashMap;

public class DBConnectorProxy implements IDBConnector{
    private DBConnectorImpl dbConnector;
    private HashMap<String, String> cashe;

    public DBConnectorProxy(DBConnectorImpl dbConnector) {
        this.dbConnector = dbConnector;
        this.cashe = new HashMap<>();
    }

    @Override
    public String connect(String dbName) {
        if (!cashe.containsKey(dbName)){
            cashe.put(dbName, dbConnector.connect(dbName));
        }
        return cashe.get(dbName);
    }
}
