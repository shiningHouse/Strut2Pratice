package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport
implements ServletRequestAware{
	
	private String username;
	private String password;
	private HttpServletRequest request;
	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	
	public String execute()
	{
		ActionContext ac = ActionContext.getContext();
		if(username.equals("admin") && password.equals("123")){
			ac.put("success", "登录成功");
			ac.put("name", "admin");
			return SUCCESS;
		}else{
			ac.put("error", "用户名或密码错误");
			return ERROR;
		}
			
	}
	
	public String register()
	{
		ActionContext ac = ActionContext.getContext();
		// 判断注册的用户名是否重复, 密码不为空
		if( !username.equals("admin") && !password.equals("")){
			ac.put("success", "注册成功");
			ac.put("name", "admin");
			return SUCCESS;
		}else{
			ac.put("error", "注册失败");
			return ERROR;
		}
		
	}
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public LoginAction() {
	}
}
