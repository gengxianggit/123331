package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelect {
	//1.����Ŀ����jar��
	public static void main(String[] args) {
	//2.���÷���������ݿ�����
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			//3.��������
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/company?characterEncoding=utf-8","root","123");
		//�� statement sql���ִ����
			Statement stat= conn.createStatement();
			//ִ��sql��䲢�õ����
			ResultSet rs=stat.executeQuery("select * from employee where name='С��'and sex='Ů'and age=18 ");
		//�Խ��������
			while(rs.next()) {
				System.out.print(rs.getInt("id")+" ");
			    System.out.print(rs.getString("name")+" ");
			    System.out.print(rs.getString("sex")+" ");
			     System.out.println(rs.getInt("age"));
			}
			//7.�ر�
			rs.close();
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
