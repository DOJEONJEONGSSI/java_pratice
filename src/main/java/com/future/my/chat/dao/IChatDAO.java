package com.future.my.chat.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.future.my.chat.vo.RoomVO;

@Mapper
public interface IChatDAO {
	
	public ArrayList<RoomVO> getRoomList();
	
	public int createRoom(RoomVO roomVO);

}
