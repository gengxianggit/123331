package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
	
		//2.���÷���������ݿ�����
			try {
				Class.forName("com.mysql.jdbc.Driver");
				//3.��������
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/company?characterEncoding=utf-8","root","123");
			//�� statement sql���ִ����
				Statement stat= conn.createStatement();
				//ִ��sql��䲢�õ����
	 int rs=stat.executeUpdate("delete from employee where id=1");
			//�Խ��������
				if(rs>0) {
					System.out.println("save");
				}
				else
				System.out.println("gg");
				//7.�ر�
				
				stat.close();
				conn.close();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	


}
