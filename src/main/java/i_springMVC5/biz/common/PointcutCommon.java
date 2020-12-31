package i_springMVC5.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutCommon {
	@Pointcut("execution(* i_springMVC5.biz..*Impl.*(..))")
	public void allPointcut() {
	}

	@Pointcut("execution(* i_springMVC5.biz..*Impl.get*(..))")
	public void getPointcut() {
	}
}