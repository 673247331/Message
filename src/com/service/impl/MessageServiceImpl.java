package com.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dao.MessageMapper;
import com.entity.Message;
import com.service.MessageService;

@Service("messageService")
	public class MessageServiceImpl implements MessageService {

		 private MessageMapper messageMapper;
		 
		public MessageMapper getMessageMapper() {
			return messageMapper;
		}

		public void setMessageMapper(MessageMapper messageMapper) {
			this.messageMapper = messageMapper;
		}

		@Override
		public List<Message> getAllmessageList() {
			// TODO Auto-generated method stub
			return messageMapper.getAllmessageList();
		}

		@Override
		public int insert(Message record) {
			// TODO Auto-generated method stub
			return messageMapper.insert(record);
		}

		@Override
		public int deleteByPrimaryKey(Integer id) {
			// TODO Auto-generated method stub
			return messageMapper.deleteByPrimaryKey(id);
		}

		@Override
		public int insertSelective(Message record) {
			// TODO Auto-generated method stub
			return messageMapper.insertSelective(record);
		}

		@Override
		public Message selectByPrimaryKey(Integer id) {
			// TODO Auto-generated method stub
			return messageMapper.selectByPrimaryKey(id);
		}

		@Override
		public int updateByPrimaryKeySelective(Message record) {
			// TODO Auto-generated method stub
			return messageMapper.updateByPrimaryKeySelective(record);
		}

		@Override
		public int updateByPrimaryKey(Message record) {
			// TODO Auto-generated method stub
			return messageMapper.updateByPrimaryKey(record);
		}
}
