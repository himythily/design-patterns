package com.mythily.projects.designpatterns.singleton;

import java.util.HashMap;

public class ConnectionPoolImpl implements ConnectionPool {
    private static ConnectionPoolImpl instance;
    private static int maxNoOfConnections;
    private int currentNoOfConnections;
    private HashMap<DatabaseConnection, Boolean> connectionsAvailabilityMap;

    private ConnectionPoolImpl(int maxNoOfConnections) {
        this.maxNoOfConnections = maxNoOfConnections;
        initializePool();
    }

    public static ConnectionPoolImpl getInstance(int size){
         if(instance == null){
             synchronized (ConnectionPoolImpl.class){
                 if(instance == null){
                     instance = new ConnectionPoolImpl(size);
                 }
             }
         }
         return instance;
    }

    @Override
    public void initializePool() {
        if(connectionsAvailabilityMap == null){
            connectionsAvailabilityMap = new HashMap<>();
            for(int i = 0; i < maxNoOfConnections; i++){
                connectionsAvailabilityMap.put(new DatabaseConnection(), true);
            }
            currentNoOfConnections = maxNoOfConnections;
        }
    }

    @Override
    public DatabaseConnection getConnection() {
        DatabaseConnection databaseConnection = null;
        for(DatabaseConnection connectionKey : connectionsAvailabilityMap.keySet()){
            if(connectionsAvailabilityMap.get(connectionKey) == true){
                databaseConnection = connectionKey;
                connectionsAvailabilityMap.put(connectionKey, false);
                currentNoOfConnections--;
                break;
            }
        }
        return databaseConnection;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        if(connectionsAvailabilityMap.containsKey(connection)){
            connectionsAvailabilityMap.put(connection, true);
            currentNoOfConnections++;
        }
    }

    @Override
    public int getAvailableConnectionsCount() {
        return currentNoOfConnections;
    }

    @Override
    public int getTotalConnectionsCount() {
        return maxNoOfConnections;
    }
}