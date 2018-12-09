/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import Booking.Event;

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
    //    public void insertStudent(Student s) {
    //        collection.insertOne(Document.parse(gson.toJson(s)));
    //        System.out.println("Student inserted.");
    //    }
    //
    //    public void deleteStudent(String email) {
    //        boolean result = collection.deleteOne(Filters.eq("email", email)).wasAcknowledged();
    //        if (result) {
    //            System.out.println("Student Deleted.");
    //        } else {
    //            System.out.println("Student wasn't found.");
    //        }
    //    }



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
//    public ArrayList<Student> getStudentsByYear(int year) {
//        ArrayList<Student> result = new ArrayList();
//        ArrayList<Document> docs = collection.find(Filters.eq("year", year)).into(new ArrayList<Document>());
//        for (int i = 0; i < docs.size(); i++) {
//            result.add(gson.fromJson(docs.get(i).toJson(), Student.class));
//        }
//        return result;
//    }
//
//    public ArrayList<Student> getStudentsByYearLT(int year) {
//        ArrayList<Student> result = new ArrayList();
//        ArrayList<Document> docs = collection.find(Filters.lt("year", year)).into(new ArrayList<Document>());
//        for (int i = 0; i < docs.size(); i++) {
//            result.add(gson.fromJson(docs.get(i).toJson(), Student.class));
//        }
//        return result;
//    }
//
//    public ArrayList<Student> getStudentsByCourse(String courseID) {
//        ArrayList<Student> result = new ArrayList();
//        ArrayList<Document> docs = collection.find(Filters.eq("courses.courseID", courseID)).into(new ArrayList<Document>());
//        for (int i = 0; i < docs.size(); i++) {
//            result.add(gson.fromJson(docs.get(i).toJson(), Student.class));
//        }
//        return result;
//    }
//
//    public ArrayList<Student> getAllStudents() {
//        ArrayList<Student> result = new ArrayList();
//        ArrayList<Document> docs = collection.find().into(new ArrayList<Document>());
//        for (int i = 0; i < docs.size(); i++) {
//            result.add(gson.fromJson(docs.get(i).toJson(), Student.class));
//        }
//        return result;
//    }
//
//    public void updateStudent(Student s) {
//        Document doc = Document.parse(gson.toJson(s));
//        boolean result = collection.replaceOne(Filters.eq("email", s.getEmail()), doc).wasAcknowledged();
//        if (result) {
//            System.out.println("Student Updated.");
//        } else {
//            System.out.println("Student wasn't found.");
//        }
//    }

    public void close() {
        client.close();
    }

}
