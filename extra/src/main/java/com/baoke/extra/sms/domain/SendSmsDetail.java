package com.baoke.extra.sms.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 短信明细实体类
 * 
 * @author: wyj
 * @date: 2018年6月15日 上午9:55:17
 */
public class SendSmsDetail implements Serializable {

	private static final long serialVersionUID = -5622153966356793163L;

	// id
	private int id;

	// 手机号码
	private String phone;

	// 内容
	private String message;

	// 发送时间
	private Date sendTime;

	// 实际发送时间
	private Date validSendTime;

	// 发送请求状态
	private int sendStatus;

	// 有效期限
	private int validMillisecond;

	// 发送结果
	private String sendDesc;

	// 渠道
	private String channel;

	// 短信标识id
	private String smsUnionId;

	// 短信接收时间
	private Date receiveTime;

	// 接收状态
	private int receiveStatus;

	// 接收结果
	private String receiveDesc;

	// 创建时间
	private Date createTime;

	// 修改时间
	private Date updateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public Date getValidSendTime() {
		return validSendTime;
	}

	public void setValidSendTime(Date validSendTime) {
		this.validSendTime = validSendTime;
	}

	public int getSendStatus() {
		return sendStatus;
	}

	public void setSendStatus(int sendStatus) {
		this.sendStatus = sendStatus;
	}

	public int getValidMillisecond() {
		return validMillisecond;
	}

	public void setValidMillisecond(int validMillisecond) {
		this.validMillisecond = validMillisecond;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSendDesc() {
		return sendDesc;
	}

	public void setSendDesc(String sendDesc) {
		this.sendDesc = sendDesc;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getSmsUnionId() {
		return smsUnionId;
	}

	public void setSmsUnionId(String smsUnionId) {
		this.smsUnionId = smsUnionId;
	}

	public Date getReceiveTime() {
		return receiveTime;
	}

	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}

	public int getReceiveStatus() {
		return receiveStatus;
	}

	public void setReceiveStatus(int receiveStatus) {
		this.receiveStatus = receiveStatus;
	}

	public String getReceiveDesc() {
		return receiveDesc;
	}

	public void setReceiveDesc(String receiveDesc) {
		this.receiveDesc = receiveDesc;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
