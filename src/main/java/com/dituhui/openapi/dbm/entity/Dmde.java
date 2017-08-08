package com.dituhui.openapi.dbm.entity;

import java.util.Date;

/**
 * 
 * @Description：<p>地名地址库</p>
 * @author: qi zhang
 * @date： 日期：2017年8月7日 时间：下午5:28:35
 * @version 1.0
 */
public class Dmde {
	private String id;// UUID
	private String poiId;//
	private String name;// //具体名称（..酒吧，酒店，医院）
	private String address; // 地址
	private String location; // 地址，经纬度
	private String province; // 省
	private String city; // 市
	private String county; // 区/县
	private String town; // 镇
	private String adminCode; // 行政区代码（6位，省市区各两位）
	private String adminCodeMZ;// 乡镇区代码（行政区代码(6位)+6位）
	private int operate; // 操作，add 1，update 2，delete 3
	private int syncStatus; // 同步状态
	private Date syncTime; // 同步时间
	private String comeFrom; // 来源
	private String createTime;// 创建时间
	private String updateTime;// 修改时间

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPoiId() {
		return poiId;
	}

	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getAdminCode() {
		return adminCode;
	}

	public void setAdminCode(String adminCode) {
		this.adminCode = adminCode;
	}

	public String getAdminCodeMZ() {
		return adminCodeMZ;
	}

	public void setAdminCodeMZ(String adminCodeMZ) {
		this.adminCodeMZ = adminCodeMZ;
	}

	public int getOperate() {
		return operate;
	}

	public void setOperate(int operate) {
		this.operate = operate;
	}

	public int getSyncStatus() {
		return syncStatus;
	}

	public void setSyncStatus(int syncStatus) {
		this.syncStatus = syncStatus;
	}

	public Date getSyncTime() {
		return syncTime;
	}

	public void setSyncTime(Date syncTime) {
		this.syncTime = syncTime;
	}

	public String getComeFrom() {
		return comeFrom;
	}

	public void setComeFrom(String comeFrom) {
		this.comeFrom = comeFrom;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
