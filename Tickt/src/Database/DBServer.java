/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import User.EventManager;
import User.Goer;
import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

/**
 *
 * @author holo7
 */
public class DBServer implements DB {

    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    private Gson gson = new Gson();

    public DBServer() {
        // Disables Mongo Logs
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        client = new MongoClient();
        database = client.getDatabase("Tickt"); // Database name
        collection = database.getCollection("events");
    }

    @Override
    public String retrieveEventTitle(int eID) {
        Document doc = collection.find(Filters.eq("eventID", eID)).first();
        String name = doc.getString("eventTitle");
        System.out.println(name);
        return name;
    }

    @Override
    public String retrieveEventLocation(int eID) {
        Document doc = collection.find(Filters.eq("eventID", eID)).first();
        String name = doc.getString("eventLocation");
        System.out.println(name);
        return name;
    }

    @Override
    public String retrieveEventDescription(int eID) {
        Document doc = collection.find(Filters.eq("eventID", eID)).first();
        String name = doc.getString("eventDescription");
        System.out.println(name);
        return name;
    }

    @Override
    public void addNewGoer(Goer goer) {

    }

    @Override
    public void addNewEventManager(EventManager eventManager) {

    }

    public void close() {
        client.close();
    }

}
