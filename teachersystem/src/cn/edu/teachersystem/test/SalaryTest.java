package cn.edu.teachersystem.test;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.sql.ResultSet;

import cn.edu.teachersystem.dao.SalaryDAO;
import cn.edu.teachersystem.dto.SalaryDTO;
public class SalaryTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//    	Vector<SalaryDTO> v=new Vector<SalaryDTO>();
//    	SalaryDAO salary=new SalaryDAO();
//    	v=salary.findAllSalaryInfo();   //��ѯ���У�����Ա��
    	
//    	v=salary.findSalaryByTid("t01"); // ����ʦ��Ų��ң�����Ա��ѯ����ʦֻ�ܿ��Լ���
    	
//    	v=salary.findSalaryBySid("s01"); //��н�ʱ�Ų���н����Ϣ
    	
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  // ���������ڲ��� 
    	java.util.Date date = sdf.parse("1996-07-31");              // �������͵�ת����String>java.util.Date>java.sql.Date
    	java.sql.Date  sqlDate  =  new java.sql.Date(date.getTime()); 
//    	v=salary.findSalaryByDate(sqlDate);  //�����������Ҷ�Ӧ�Ĺ��ʼ�¼
    	
    	
    	
//    	for(SalaryDTO s:v){
//		    System.out.println(s.getSalary_id());
//			System.out.println(s.getTeacher_id());
//		    System.out.println(s.getSalary_basic());	  
//		    System.out.println(s.getWalfare());
//		    System.out.println(s.getRewardAndPunish_count());
//		    System.out.println(s.getSalary_real());
//		    System.out.println(s.getIssueDate());
//		    System.out.println();
//		}
    	
    	SalaryDAO s=new SalaryDAO();                 
    	SalaryDTO salary=new SalaryDTO();
		boolean flag=false;
		salary.setSalary_id("s06");
		salary.setTeacher_id("t01");
		salary.setSalary_basic(1500.00);
		salary.setWalfare(0.00);
		salary.setIssueDate(sqlDate);
		flag=s.addNewSalaryInfo(salary);     //�����¼�¼��ͬʱͳ�ƽ����ܼƺͼ���ʵ������
		if(flag)
			System.out.println("���������ݳɹ���");
		else
			System.out.println("����������ʧ����");
    	
    	
//    	flag=s.deleteSalaryBySid("s06");                 // ��ɾ��һ��н�ʼ�¼
//		if(flag)
//		   System.out.println("ɾ�����ݳɹ���");
//	    else
//		   System.out.println("ɾ������ʧ����");
        

//    	flag=s.UpdateWalfareBySid("s06",100.00);   //����н����Ϣ�ĸ�����
//		flag=s.UpdateS_basicBySid("s06", 2000.03); //����н����Ϣ�Ļ���������
//		if(flag)
//		   System.out.println("�������ݳɹ���");
//	    else
//		   System.out.println("��������ʧ����");
	}

}
