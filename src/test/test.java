package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MessageMapper;
import com.service.MessageService;
import com.service.impl.MessageServiceImpl;

public class test {

		@Transactional(propagation = Propagation.NOT_SUPPORTED)
	  public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	      //测试dao层
		MessageServiceImpl Service=(MessageServiceImpl)ctx.getBean("MessageServiceImpl");
			System.out.println("总行数是:"+Service.getAllmessageList());//Service.getAllmessageList().size()
	
}
}
