/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Booking.Booking;
import Event.Event;
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
    private MongoCollection<Document> collectionEvents;
    private MongoCollection<Document> collectionAccounts;
    private MongoCollection<Document> collectionBookings;
    private Gson gson = new Gson();

    public DBServer() {
        // Disables Mongo Logs
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        client = new MongoClient();
        database = client.getDatabase("Tickt"); // Database name
        collectionEvents = database.getCollection("events");
        collectionAccounts = database.getCollection("accounts");
        collectionBookings = database.getCollection("bookings");
    }

    @Override
    public String retrieveEventTitle(int eID) {
        Document doc = collectionEvents.find(Filters.eq("eventID", eID)).first();
        String name = doc.getString("eventTitle");
        System.out.println(name);
        return name;
    }

    @Override
    public String retrieveEventLocation(int eID) {
        Document doc = collectionEvents.find(Filters.eq("eventID", eID)).first();
        String name = doc.getString("eventLocation");
        System.out.println(name);
        return name;
    }

    @Override
    public String retrieveEventDescription(int eID) {
        Document doc = collectionEvents.find(Filters.eq("eventID", eID)).first();
        String name = doc.getString("eventDescription");
        System.out.println(name);
        return name;
    }

    @Override
    public void addNewGoer(Goer goer) {
        collectionAccounts.insertOne(Document.parse(gson.toJson(goer)));
        System.out.println("Goer inserted.");
    }

    @Override
    public void addNewEventManager(EventManager eventManager) {
        collectionAccounts.insertOne(Document.parse(gson.toJson(eventManager)));
        System.out.println("Event manager inserted.");
    }
    
    @Override
    public void addNewBooking(Booking booking)
    {
        //This results in a StackOverFlowError.
        collectionBookings.insertOne(Document.parse(gson.toJson(booking)));
        System.out.println("Booking inserted.");
    }
    
    @Override
    public void addNewEvent(Event event)
    {
        //This results in a StackOverFlowError.
        collectionEvents.insertOne(Document.parse(gson.toJson(event)));
        System.out.println("Event inserted.");
    }

    public void close() {
        client.close();
    }

}
