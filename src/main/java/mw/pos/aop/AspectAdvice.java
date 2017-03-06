package mw.pos.aop;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect : 标记为切面类
// @Pointcut : 指定匹配切点集合
// @Before : 指定前置通知，value中指定切入点匹配
// @AfterReturning ：后置通知，具有可以指定返回值
//@AfterThrowing ：异常通知
//注意：前置/后置/异常通知的函数都没有返回值，只有环绕通知有返回值
@Component // 首先初始化切面类
@Aspect // 声明为切面类，底层使用动态代理实现AOP
public class AspectAdvice {

	// 指定切入点匹配表达式，注意它是以方法的形式进行声明的。
	// 即切点集合是：aop.annotation包下所有类所有方法
	// 第一个* 代表返回值类型
	// 如果要设置多个切点可以使用 || 拼接
	@Pointcut("@annotation(mw.pos.aop.ISysLog)")
	public void controllerAspect() {
	}

	// 前置通知
	// 在切点方法集合执行前，执行前置通知
 
	@Before("controllerAspect()")
	public void doBefore(JoinPoint jp) {
		System.out.println("===========进入before advice============ \n");

		System.out.print("准备在" + jp.getTarget().getClass() + "对象上用");
		System.out.print(jp.getSignature().getName() + "方法进行对 '");
		System.out.print(jp.getArgs()[0] + "'进行删除！\n\n");

		System.out.println("要进入切入点方法了 \n");
	}

	// 后置通知
	@AfterReturning("controllerAspect()")
	public void doAfter(JoinPoint jp) {
		System.out.println("==========进入after advice=========== \n");
		System.out.println("切入点方法执行完了 \n");

		/*System.out.print(jp.getArgs() + "在");
		System.out.print(jp.getTarget().getClass() + "对象上被");
		System.out.print(jp.getSignature().getName() + "方法删除了");
		System.out.print("只留下：" + result + "\n\n");*/
	}

	// 环绕通知（##环绕通知的方法中一定要有ProceedingJoinPoint 参数,与
	// Filter中的 doFilter方法类似）

	@Around("controllerAspect()")
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("===========进入around环绕方法！=========== \n");
//		HttpSession session = ServletActionContext.getRequest().getSession();
		/*Emp login = (Emp) session.getAttribute("login");// ssh2整合后AOP也可以得到request、response、session等
*/		
		// 调用目标方法之前执行的动作
		System.out.println("调用方法之前: 执行！\n");

		// 调用方法的参数
		Object[] args = pjp.getArgs();
		// 调用的方法名
		String method = pjp.getSignature().getName();
		// 获取目标对象(形如：com.action.admin.LoginAction@1a2467a)
		Object target = pjp.getTarget();
		// 获取目标对象的类名(形如：com.action.admin.LoginAction)
		String targetName = pjp.getTarget().getClass().getName();
		// 执行完方法的返回值：调用proceed()方法，就会触发切入点方法执行
		Object result = pjp.proceed();// result的值就是被拦截方法的返回值

		System.out.println("输出：" + args[0] + ";" + method + ";" + target + ";" + result + "\n");
		System.out.println("调用方法结束：之后执行！\n");
		return result;
	}

	// 异常通知

	@AfterThrowing(pointcut = "controllerAspect()", throwing = "e")
	public void doThrow(JoinPoint jp, Throwable e) {
		System.out.println("删除出错啦");
	}

}