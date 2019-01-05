package work;

import java.sql.Connection;
import java.sql.DriverManager;

public class Second2 {

			static Connection conn = null;
			public static Connection dbConnector(){
			try{
			conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sklad","root","1234");
			
					if(conn!=null)
					{
						System.out.println("Бд підключена");
						System.out.println(conn);
					}
		}catch(Exception e){
				System.out.println("Бд НЕпідключена");
			}
			return conn;
		}

	}

