package cn.edu.teachersystem.util;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;



public class DataBasedAccess {



	    //1433��TCP�˿�
	    //databaseName�����ݿ�����
	    //user��sql����Ա�ĵ�½����Ĭ�ϵ�sa��
	    
	    static String connectionUrl = "jdbc:sqlserver://localhost:1433;" 
	               +"databaseName=TIMS;"
	               + "user=root;"
	               + "password=123321;";
	  //ע�����������������
	    private static Connection conn=null;
	    public static Connection getConnection(){
			
			
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//ע����������
				conn=DriverManager.getConnection//��ȡ���ݿ�����
						(connectionUrl);
				
				
			} catch (ClassNotFoundException e) {
			    System.out.println("mysql���������Ҳ����������Ӧ��jar����û�м���");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("��ȡ���ݿ�����ʱ����SQL������");
				e.printStackTrace();
			} 
			
	         return conn;

		}
	            
	    //������
	    public static void main(String[] args) throws Exception{
	        // TODO �Զ����ɵķ������

			
			
	    }

	}


