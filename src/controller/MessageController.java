package controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.SimpleFormatter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Message;
import com.service.MessageService;
@Controller
@RequestMapping("/")
public class MessageController {
@Autowired 
	private MessageService messageService;
@RequestMapping("show.do")
@Transactional(propagation = Propagation.NOT_SUPPORTED)
s
public String show(Model model) throws Exception{
    //����ҵ��	 

	  List<Message> list=messageService.getAllmessageList();
	
    //�������
	  model.addAttribute("list", list);
	  return "show.jsp";
}
@RequestMapping("delMessage.do") 

public String delMessage(HttpServletRequest request) throws Exception{
	String  tid=request.getParameter("tid");
	messageService.deleteByPrimaryKey(Integer.parseInt(tid));
	
	return "redirect:index.jsp";
}
@RequestMapping("addMessage.do")
public String addMessage(HttpServletRequest request,Message message) throws Exception{
	request.setCharacterEncoding("utf-8");
	Date date=new Date();
	String title=request.getParameter("title");
	String content=request.getParameter("content");
	String happly=request.getParameter("happly");
	System.out.println(title);
	System.out.println(content);
	Message m=new Message();
	m.setTime(date);
	m.setTitle(title);
	m.setContent(content);
	m.setHapply(Integer.parseInt(happly));
	int tem=messageService.insert(m);
	
	return "index.jsp";
	
}

	@RequestMapping("test.do")
	@ResponseBody
	public Map<String, Object> test(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "����");
		map.put("age", 14);
		return map;
	}

	
}
