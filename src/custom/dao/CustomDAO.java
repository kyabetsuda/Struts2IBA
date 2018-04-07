package custom.dao;

import java.io.Reader;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import custom.dto.CustomDTO;

public class CustomDAO {

	private static SqlMapClient sqlmap;

	static{
		try{
			String xmlPath="/custom/dao/SqlMapConfig.xml";
			Reader reader=Resources.getResourceAsReader(xmlPath);
			sqlmap=SqlMapClientBuilder.buildSqlMapClient(reader);
		}catch(Exception ex){
			System.out.println("SqlMapConfig Parsing Error()"+ex.getMessage());
		}
	}
	@SuppressWarnings("unchecked")
	public static ArrayList<CustomDTO> selectAllData() throws SQLException{
		return (ArrayList<CustomDTO>)sqlmap.queryForList("selectAllData");
	}
	
	@SuppressWarnings("unchecked")
	public static ArrayList<CustomDTO> selectAllErpex1() throws SQLException{
		return (ArrayList<CustomDTO>)sqlmap.queryForList("selectAllErpex1");
	}
	
	@SuppressWarnings("unchecked")
	public static ArrayList<CustomDTO> selectAllErpex2() throws SQLException{
		return (ArrayList<CustomDTO>)sqlmap.queryForList("selectAllErpex2");
	}
	
	@SuppressWarnings("unchecked")
	public static ArrayList<CustomDTO> selectAllErpex3() throws SQLException{
		return (ArrayList<CustomDTO>)sqlmap.queryForList("selectAllErpex3");
	}
	
	@SuppressWarnings("unchecked")
	public static ArrayList<CustomDTO> selectAllErpex4() throws SQLException{
		return (ArrayList<CustomDTO>)sqlmap.queryForList("selectAllErpex4");
	}
	
	@SuppressWarnings("unchecked")
	public static ArrayList<CustomDTO> selectAllErpex5() throws SQLException{
		return (ArrayList<CustomDTO>)sqlmap.queryForList("selectAllErpex5");
	}
	
	@SuppressWarnings("unchecked")
	public static ArrayList<CustomDTO> selectAllErpex6() throws SQLException{
		return (ArrayList<CustomDTO>)sqlmap.queryForList("selectAllErpex6");
	}
	
	@SuppressWarnings("unchecked")
	public static ArrayList<CustomDTO> selectAllErpex7() throws SQLException{
		return (ArrayList<CustomDTO>)sqlmap.queryForList("selectAllErpex7");
	}
	
	@SuppressWarnings("unchecked")
	public static ArrayList<CustomDTO> selectAllErpex8() throws SQLException{
		return (ArrayList<CustomDTO>)sqlmap.queryForList("selectAllErpex8");
	}
	
	
	
//	@SuppressWarnings("unchecked")
//	public static ArrayList<CustomDTO> search(String name) throws SQLException{
//		return (ArrayList<CustomDTO>)sqlmap.queryForList("search", name);
//	}
//
	
	//erpex2���̺� ��ü�Խù� ��ȣ +1
	public static Integer getMaxNo()throws SQLException{
		return (Integer)sqlmap.queryForObject("getmaxno");
	}
//
//	//erpex2���̺? ���
//	public static void Insert(CustomDTO dto) throws SQLException{
//		sqlmap.insert("insert",dto);
//	}
//
//	//erpex2���̺��� �Խù� ��ȣ�� �� �Խù� ��� �ҷ�����
//	public static CustomDTO updateList(int no) throws SQLException{
//		return (CustomDTO)sqlmap.queryForObject("updatelist",no);
//	}
//
//	//erpex2���̺��� �Խù� ��ȣ�� �� �Խù� ���� ����
//	public static void Update(CustomDTO dto) throws SQLException{
//		sqlmap.update("update",dto);
//	}
//
//	public static void Delete(int no) throws SQLException{
//		sqlmap.delete("delete",no);
//	}
}
