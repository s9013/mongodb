import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

public class Demo {
	public static void main(String[] args) {
		try {
			Mongo mongo = new Mongo("localhost",27017);
			DB db = mongo.getDB("mydb");
//			Set<String> colls = db.getCollectionNames();
//			for (String s : colls) {  
//		          System.out.println(s);  
//		      }
			DBCollection coll = db.getCollection("user");
//			  BasicDBObject doc = new BasicDBObject();
//			   
//			   doc.put("name", "MongoDB");
//		       doc.put("type", "database");
//		       doc.put("count", 1);
//		      
//			   BasicDBObject info = new BasicDBObject();
//		       info.put("x", 203);
//		       info.put("y", 102);
//		       
//			   doc.put("info", info);
//		       coll.insert(doc); // 保存
			   
		       
		       DBObject myDoc = coll.findOne();
		       DBCursor cur = coll.find();  
		       while(cur.hasNext()) {  
		           System.out.println(cur.next());  
		       } 
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
