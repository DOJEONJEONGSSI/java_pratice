package com.future.my.chat.vo;

public class ChatVO {
	
	private int chatNo;
    private String memId;
    private String memNm;
    private int roomNO;
    private String chatMsg;
    private String sendDate;
	
    public int getChatNo() {
		return chatNo;
	}
	public void setChatNo(int chatNo) {
		this.chatNo = chatNo;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemNm() {
		return memNm;
	}
	public void setMemNm(String memNm) {
		this.memNm = memNm;
	}
	public int getRoomNO() {
		return roomNO;
	}
	public void setRoomNO(int roomNO) {
		this.roomNO = roomNO;
	}
	public String getChatMsg() {
		return chatMsg;
	}
	public void setChatMsg(String chatMsg) {
		this.chatMsg = chatMsg;
	}
	public String getSendDate() {
		return sendDate;
	}
	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}
    
    

}
