package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.NewLecExam;
import spring.di.NewLecDiConfig;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				// new AnnotationConfigApplicationContext(NewLecDiConfig.class);
				new ClassPathXmlApplicationContext("spring/aop/setting.xml");

		Exam exam = (Exam) context.getBean("exam");
		
		System.out.printf("total is %d\n",exam.total());
		System.out.printf("avg is %f\n",exam.avg());
		/*
		 * Exam exam = new NewLecExam(1,1,1,1);
		 * 
		 * 
		 * Exam proxy = (Exam) Proxy.newProxyInstance(NewLecExam.class.getClassLoader(),
		 * new Class[] {Exam.class}, new InvocationHandler() {
		 * 
		 * @Override public Object invoke(Object proxy, Method method, Object[] args)
		 * throws Throwable {
		 * 
		 * long start = System.currentTimeMillis();
		 * 
		 * Object result = method.invoke(exam, args);
		 * 
		 * long end = System.currentTimeMillis(); String message = (end - start) +
		 * "ms ½Ã°£ ¼Ò¿äµÊ";
		 * 
		 * System.out.println(message);
		 * 
		 * return result ; } } );
		 */
		

		
	}

}
