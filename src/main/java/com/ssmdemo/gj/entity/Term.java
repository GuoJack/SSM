package com.ssmdemo.gj.entity;
/**
 * 卫星影像数据基类
 * @author Administrator
 *
 */

import java.util.Date;

public class Term {
	private int dataId;//卫星数据ID
	private String satelliteId;//卫星影像类型
	private String sensorId;//卫星影像传感器
	private Date sceneDate;//卫星影像采集时间
	private String productLevel;//卫星产品等级
	private String recstationId;//接收站;
	private int overallquality;//数据质量
	private int scenePath;//侧摆
	private int sceneRow;//景
	private String productName;//卫星影像全名
	private int state;//--状态 0--在线  1--自动删除 2--近线 3--离线到磁带   4--人工删除 5--离线到磁盘
	private String productPath;//卫星影像储存路径
	private String fileSize;//卫星影像大小
	private String pictureFormat;//卫星影像格式
	private Double topLeftLatitude;//上左纬度
	private Double topLeftLongitude;//上左经度
	private Double topRightLatitude;//上右纬度
	private Double topRightLongitude;//上右经度
	private Double bottomLeftLatitude;//下左纬度;
	private Double bottomLeftLongitude;//下左经度;
	private Double bottomRightLatitude;//下右纬度;
	private Double bottomRightLongitude;//下右经度;
	private Date instorageDate;//卫星影像归档时间
	private String testss;//无意义字段
	private int myObjState;
	private int imgOperateState;//卫星影像镶嵌状态:0--未镶嵌 1--已镶嵌
	private int sceneId;//卫星影像景号
	private String catalogId;//无意义字段
	private Date pushDate;//推送完成时间---无意义字段
	private int productId;//卫星影像产品Id
	private String mosaicPath;//卫星影像的镶嵌数据集路径
	private String productCategory;//无意义字段
	public int getDataId() {
		return dataId;
	}
	public void setDataId(int dataId) {
		this.dataId = dataId;
	}
	public String getSatelliteId() {
		return satelliteId;
	}
	public void setSatelliteId(String satelliteId) {
		this.satelliteId = satelliteId;
	}
	public String getSensorId() {
		return sensorId;
	}
	public void setSensorId(String sensorId) {
		this.sensorId = sensorId;
	}
	public Date getSceneDate() {
		return sceneDate;
	}
	public void setSceneDate(Date sceneDate) {
		this.sceneDate = sceneDate;
	}
	public String getProductLevel() {
		return productLevel;
	}
	public void setProductLevel(String productLevel) {
		this.productLevel = productLevel;
	}
	public String getRecstationId() {
		return recstationId;
	}
	public void setRecstationId(String recstationId) {
		this.recstationId = recstationId;
	}
	public int getOverallquality() {
		return overallquality;
	}
	public void setOverallquality(int overallquality) {
		this.overallquality = overallquality;
	}
	public int getScenePath() {
		return scenePath;
	}
	public void setScenePath(int scenePath) {
		this.scenePath = scenePath;
	}
	public int getSceneRow() {
		return sceneRow;
	}
	public void setSceneRow(int sceneRow) {
		this.sceneRow = sceneRow;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getProductPath() {
		return productPath;
	}
	public void setProductPath(String productPath) {
		this.productPath = productPath;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public String getPictureFormat() {
		return pictureFormat;
	}
	public void setPictureFormat(String pictureFormat) {
		this.pictureFormat = pictureFormat;
	}
	public Double getTopLeftLatitude() {
		return topLeftLatitude;
	}
	public void setTopLeftLatitude(Double topLeftLatitude) {
		this.topLeftLatitude = topLeftLatitude;
	}
	public Double getTopLeftLongitude() {
		return topLeftLongitude;
	}
	public void setTopLeftLongitude(Double topLeftLongitude) {
		this.topLeftLongitude = topLeftLongitude;
	}
	public Double getTopRightLatitude() {
		return topRightLatitude;
	}
	public void setTopRightLatitude(Double topRightLatitude) {
		this.topRightLatitude = topRightLatitude;
	}
	public Double getTopRightLongitude() {
		return topRightLongitude;
	}
	public void setTopRightLongitude(Double topRightLongitude) {
		this.topRightLongitude = topRightLongitude;
	}
	public Double getBottomLeftLatitude() {
		return bottomLeftLatitude;
	}
	public void setBottomLeftLatitude(Double bottomLeftLatitude) {
		this.bottomLeftLatitude = bottomLeftLatitude;
	}
	public Double getBottomLeftLongitude() {
		return bottomLeftLongitude;
	}
	public void setBottomLeftLongitude(Double bottomLeftLongitude) {
		this.bottomLeftLongitude = bottomLeftLongitude;
	}
	public Double getBottomRightLatitude() {
		return bottomRightLatitude;
	}
	public void setBottomRightLatitude(Double bottomRightLatitude) {
		this.bottomRightLatitude = bottomRightLatitude;
	}
	public Double getBottomRightLongitude() {
		return bottomRightLongitude;
	}
	public void setBottomRightLongitude(Double bottomRightLongitude) {
		this.bottomRightLongitude = bottomRightLongitude;
	}
	public Date getInstorageDate() {
		return instorageDate;
	}
	public void setInstorageDate(Date instorageDate) {
		this.instorageDate = instorageDate;
	}
	public String getTestss() {
		return testss;
	}
	public void setTestss(String testss) {
		this.testss = testss;
	}
	public int getMyObjState() {
		return myObjState;
	}
	public void setMyObjState(int myObjState) {
		this.myObjState = myObjState;
	}
	public int getImgOperateState() {
		return imgOperateState;
	}
	public void setImgOperateState(int imgOperateState) {
		this.imgOperateState = imgOperateState;
	}
	public int getSceneId() {
		return sceneId;
	}
	public void setSceneId(int sceneId) {
		this.sceneId = sceneId;
	}
	public String getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}
	public Date getPushDate() {
		return pushDate;
	}
	public void setPushDate(Date pushDate) {
		this.pushDate = pushDate;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getMosaicPath() {
		return mosaicPath;
	}
	public void setMosaicPath(String mosaicPath) {
		this.mosaicPath = mosaicPath;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	@Override
	public String toString() {
		return "term [dataId=" + dataId + ", satelliteId=" + satelliteId + ", sensorId=" + sensorId + ", sceneDate="
				+ sceneDate + ", productLevel=" + productLevel + ", recstationId=" + recstationId + ", overallquality="
				+ overallquality + ", scenePath=" + scenePath + ", sceneRow=" + sceneRow + ", productName="
				+ productName + ", state=" + state + ", productPath=" + productPath + ", fileSize=" + fileSize
				+ ", pictureFormat=" + pictureFormat + ", topLeftLatitude=" + topLeftLatitude + ", topLeftLongitude="
				+ topLeftLongitude + ", topRightLatitude=" + topRightLatitude + ", topRightLongitude="
				+ topRightLongitude + ", bottomLeftLatitude=" + bottomLeftLatitude + ", bottomLeftLongitude="
				+ bottomLeftLongitude + ", bottomRightLatitude=" + bottomRightLatitude + ", bottomRightLongitude="
				+ bottomRightLongitude + ", instorageDate=" + instorageDate + ", testss=" + testss + ", myObjState="
				+ myObjState + ", imgOperateState=" + imgOperateState + ", sceneId=" + sceneId + ", catalogId="
				+ catalogId + ", pushDate=" + pushDate + ", productId=" + productId + ", mosaicPath=" + mosaicPath
				+ ", productCategory=" + productCategory + "]";
	}
	
	
}
