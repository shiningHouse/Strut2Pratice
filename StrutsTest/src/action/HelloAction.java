package action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{
	
	@Override
	public String execute()
	{
		System.out.println("Join in HelloAction");
		return "success";
	}
}
