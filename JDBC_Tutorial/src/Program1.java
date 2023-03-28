import java.sql.*;


public class Program1 {
	
	public static void main(String[] args) {
		try {
			
			//Setp 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//setp 2
		    Connection conn = 	DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","<long>");
//			System.out.println("Connection Establish");
		    
		    //step 3
//		    PreparedStatement ps = conn.prepareStatement("insert into studentInfo values(?,?,?)");
//		    ps.setInt(1, 85);
//		    ps.setString(2, "Sunny Sutradhar");
//		    ps.setString(3, "Dhaka, Bangladeh");
		    
		    //updae
		    PreparedStatement ps = conn.prepareStatement("update studentInfo set name=? , address=? where id=?");
            ps.setString(1, "Riya");
 		    ps.setString(2, "Mohammod Pur, Bangladeh");
 		    ps.setInt(3, 85);
		    
		    //step 4
		    int i = 1;
		    ps.executeUpdate();
		    if(i==1) {
		    	System.out.println("Update Succefully");
		    }else {
		    	System.out.println("Not Inserted");
		    }
		    
		    
		    //step 5
		    conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
