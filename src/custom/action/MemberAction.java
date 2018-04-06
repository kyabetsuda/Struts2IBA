package custom.action;

import java.util.ArrayList;

import custom.dto.CustomDTO;

public class MemberAction {

	private ArrayList<CustomDTO> list=new ArrayList<CustomDTO>();

	public String MemberInsert() throws Exception{
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
