package interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthourityInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		// ��ȡsession������
		ActionContext context = invocation.getInvocationContext();
		Map<?,?> sessionMap = context.getSession();
		
		// �ж��û����Ƿ�Ϸ�
		String user = (String)sessionMap.get("name");
		if(user!=null && user.equals("admin"))
		{
			System.out.println("Invocatin invoke return:" + invocation.invoke());
			return invocation.invoke(); // ��ת��success.jsp
		}else{
			context.put("tip", "����δ��¼�����ȵ�¼");
			return "login";  // ����"login"�ַ���
		}

	}

}