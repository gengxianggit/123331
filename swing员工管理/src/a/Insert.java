package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert{
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
				int rs=stat.executeUpdate("insert into employee (name,sex ,age,e_id) values ('��ɲ���','��',221,5) ");
			//�Խ��������
				if(rs>0) {
					System.out.println("����ɹ�");
				}				else
					System.out.println("����ʧ��");
					
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
