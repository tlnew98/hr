package cn.java.jdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnextion {
	public static final String DBDRIVER="oracle.jdbc.driver.OracleDriver";
	public static final String DBURL="jdbc:oracle:thin:@loaclhost:1521:tanlin";
	public static final String USER="c##scott";
	public static final String POSSWODE="tiger";

	Connection conn=null;

	public DataBaseConnextion(){
		try{
			Class.forName(DBDRIVER);
			conn=DriverManager.getConnection(DBURL,USER,POSSWODE);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public Connection getConnection(){
		return this.conn;
	}
	public void close(){
		try {
			this.conn.close();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
