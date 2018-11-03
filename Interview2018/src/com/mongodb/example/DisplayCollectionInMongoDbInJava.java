package com.mongodb.example;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

public class DisplayCollectionInMongoDbInJava {}
   /* public static void main(String[] args) {*/
 
          /*  Step-1 > Connect to MongoDB 
           System.out.println("Step-1 > Connect to MongoDB");
           MongoClient mongoClient =new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
           
            Step-2 > Connect to DATABASE 
           //If in case database doesn't exists, it will be created at runtime
           System.out.println("Step-2 > Connect to DATABASE");
           DB db = mongoClient.getDB("mydb");
                        
            Step-3 > Get the COLLECTION (TABLE) 
           //If in case collection (Table) doesn't exists, it will be created at runtime
           System.out.println("Step-3 > Get the COLLECTION (TABLE)");
           DBCollection dbCollection = db.getCollection("employee");
 
            Step-4 > Not Mandatory
            If collection already exists, you may remove everything
            from collection for perfect OUTPUT of program
           System.out.println("Step-4 > Not Mandatory");
           dbCollection.remove(new BasicDBObject());
                        
           
           BasicDBObject basicDBObject1 = new BasicDBObject();
           basicDBObject1.put("id", 1);  //Id is the column name,  1 is the value of column
           basicDBObject1.put("name", "Ankit");
           
            Step5 > INSERT document1/record1 in COLLECTION in MongoDB 
           System.out.println("Step-5 > INSERT document1/record1 in COLLECTION in MongoDB");
           dbCollection.insert(basicDBObject1);
 
           BasicDBObject basicDBObject2 = new BasicDBObject();
           basicDBObject2.put("id", 2);  //Id is the column name,  2 is the value of column
           basicDBObject2.put("name", "Sam");
           
            Step-6 > INSERT document2/record2 in COLLECTION in MongoDB 
           System.out.println("Step-6 > INSERT document1/record1 in COLLECTION in MongoDB");
           dbCollection.insert(basicDBObject2);
 
           *//** Step-7 > Display documents of COLLECTION in MongoDB *//*
           System.out.println("Step-7 > Display documents of COLLECTION in MongoDB");
           DBCursor dbCursor = dbCollection.find();
           while (dbCursor.hasNext()) {
                  System.out.println(dbCursor.next());
           }
           
           
    }
 
}*/