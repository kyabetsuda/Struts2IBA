package custom.action;

import custom.dao.*;

public class GetMaxNoAction {
	
	private int maxno;
	
	public String GetMaxNo() throws Exception{
		maxno=CustomDAO.getMaxNo();
		return "ok";
	}

	//Getter,Setter
	public int getMaxno() {
		return maxno;
	}

	public void setMaxno(int maxno) {
		this.maxno = maxno;
	}	
}
