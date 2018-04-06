package custom.action;

import java.util.ArrayList;

import custom.dao.CustomDAO;
import custom.dto.CustomDTO;
/*
 * 3. struts.xml�� <action>,<result>���뿡 ���� �Ǳ���� ������ Java���Ϸ� �̵�����.
 * 	  ���⼭�� erpex2�� ��ü������ �ҷ��ðǵ�
 * 	 ��ȣ,�̸�,�μ�..���� �����Ͱ� �������� �ֱ⶧���� ������ Ŭ���� ArrayList�� �� �������
 *   �����ϰ� �ȴ�.�ٵ� �ʱ⿡ ���⿡ ������ ���� �ƹ��͵� �����ϱ� DB���� �� ������ �ҷ��ͼ�
 *   ä����ߵȴ�. �׷��Ƿ� �ϴ� Ibatis���� ��� ����ƴ��� ���ߵ�
 *
 *   �ϴ� SqlMapConfig.xml�� �̵�!!!!!!
 *
 * 	(���� 3����� ��󰡰� ���߿� �ٽ� �������� ���ߵ�.. �ϴ� ������� ���� �˴ϴ�~)
 */
public class ListAction {

/*
 *  CustomDAO���� �ٽ� ���ƿԴµ� ���Ⱑ �� ���� �߿��� �κ���
 *
 *  private ArrayList<CustomDTO>..�� ������ private���� �����ϰ� �޸� �Ҵ��� ����µ�
 *  �ϴ� ������� ���� ��Ʈ���� 2������ ĸ��ȭ ����� ���� � ���� jsp���������� ���� ȣ������ �ʰ�
 *  Getter,Setter�޼ҵ���� ȣ���ϴ� ����� �����ߴ�.
 *
 *  public String SelectAllList(){} Ŭ������ ��Ʈ����2�� ���ϴ� Ŭ������ �ȴ�.
 *  struts.xml�� <action>�±׿��� method="selectAllData"�� ��������µ� ���⼭ ����
 *  �޼ҵ� �̸��� ��ҹ��� �����ؼ� �Ϻ��� ��ġ�ؾߵȴ�.(Ʋ���� 500����)
 *
 *  �Ʒ� ���� return "ok"���غκе� struts.xml�� <result>�±׿��� �������� �κ���
 *
 *  �׷� �ϴ� ����..
 *
 *  ���� ���ڸ� ���ڰ��� ���� DAOŬ�������� �Ѿ�� ���� �־���� �ȴ�. �������
 *
 *  ex)public ArrayList<CustomDTO> SelectAllList(CustomDTO dto){return list}
 *
 *  �ٵ� ��Ʈ����2������ DAO���� �Ѿ�� ������ FilterDispatcher(��Ʈ�ѷ�)���� ��� ó���ع�����
 *  ���ڰ� �ʿ��Եȴ�.������ ��� ���� '��Ʈ����2�� ���ϴ� Ŭ����'�� ���ڰ��� ��ٰ� �̻��ϰ� ���� �ʿ䰡 ����
 *  �׳� ��Ʈ���� 2�� ���ϴ� �ִϱ��� ���ϸ��..
 *
 *  �׷� ���� private���� ������ ArrayList�� DAOŬ�������� ������� selectAllData()�޼ҵ带 ȣ���ؼ�
 *  DB�� ������ ��� �������ְ� �ȴ�. ���� struts.xml���뿡 ���� JSP�������� ������(���� ������ �̵�) �ϰ� �ȴ�.
 *
 *  list.jsp�� �̵�!!
 */
	private ArrayList<CustomDTO> list=new ArrayList<CustomDTO>();

	public String SelectAllList() throws Exception{
		list=(ArrayList<CustomDTO>)CustomDAO.selectAllData();
		return "ok";
	}

	//Getter,Setter
	public ArrayList<CustomDTO> getList() {
		return list;
	}

	public void setList(ArrayList<CustomDTO> list) {
		this.list = list;
	}
}
