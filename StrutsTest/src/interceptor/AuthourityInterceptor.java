package interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthourityInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		// 获取session的属性
		ActionContext context = invocation.getInvocationContext();
		Map<?,?> sessionMap = context.getSession();
		
		// 判断用户名是否合法
		String user = (String)sessionMap.get("name");
		if(user!=null && user.equals("admin"))
		{
			System.out.println("Invocatin invoke return:" + invocation.invoke());
			return invocation.invoke(); // 跳转到success.jsp
		}else{
			context.put("tip", "您还未登录，请先登录");
			return "login";  // 返回"login"字符串
		}

	}

}