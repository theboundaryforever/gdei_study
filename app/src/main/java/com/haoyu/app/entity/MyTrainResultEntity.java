package com.haoyu.app.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * 创建日期：2017/1/7 on 11:17
 * 描述: 培训成绩
 * courseStudyHours	课程学时	Int	Y
 * wstsStudyHours	工作坊学时	Int	Y
 * cmtsStudyHours	社区学时	Int	Y
 * registerCourseNum	课程数	Int	Y
 * passCourseNum	合格课程数	Int	Y
 * wstsPoint	工作坊积分	Int	Y
 * getWstsPoint	已获工作坊积分	Int	Y
 * wstsState	工作坊评价	String	Y	excellent:优秀
 * qualified:合格
 * fail:未达标
 * null:未评价
 * cmtsPoint	社区积分	Int	Y
 * getCmtsPoint	已获社区积分	Int	Y
 * <p>
 * trainType	培训考核类型	String	Y	例子：
 * 返回：course,workshop,community
 * 表示考核内容有课程，工作坊，社区
 * 返回：course
 * 只有课程需要考核
 * studyHoursType	学时类型	String	Y	no_limit：不限学时
 * 其他值均为限制学时
 * trainCourseConfig	培训课程配置	String	  Y	noTopic：无主题
 * hasTopic:有主题
 * trainWorkshopConfig   String   train:参与工作坊考核  create:创建工作坊考核
 * chooseCourseType	培训选课方式	String	N	self:自主选课
 * system:系统配课
 * <p>
 * 作者:马飞奔 Administrator
 */
public class MyTrainResultEntity implements Serializable {

    @Expose
    @SerializedName("courseStudyHours")
    private int courseStudyHours;
    @Expose
    @SerializedName("wstsStudyHours")
    private int wstsStudyHours;
    @Expose
    @SerializedName("cmtsStudyHours")
    private int cmtsStudyHours;
    @Expose
    @SerializedName("registerCourseNum")
    private int registerCourseNum;
    @Expose
    @SerializedName("passCourseNum")
    private int passCourseNum;
    @Expose
    @SerializedName("wstsPoint")
    private int wstsPoint;
    @Expose
    @SerializedName("getWstsPoint")
    private int getWstsPoint;
    @Expose
    @SerializedName("wstsState")
    private String wstsState;
    @Expose
    @SerializedName("cmtsPoint")
    private int cmtsPoint;
    @Expose
    @SerializedName("getCmtsPoint")
    private int getCmtsPoint;
    @Expose
    @SerializedName("trainType")
    private String trainType;
    @Expose
    @SerializedName("studyHoursType")
    private String studyHoursType;
    @Expose
    @SerializedName("trainCourseConfig")
    private String trainCourseConfig;
    @Expose
    @SerializedName("trainWorkshopConfig")
    private String trainWorkshopConfig;
    @Expose
    @SerializedName("chooseCourseType")
    private String chooseCourseType;

    public int getCourseStudyHours() {
        return courseStudyHours;
    }

    public void setCourseStudyHours(int courseStudyHours) {
        this.courseStudyHours = courseStudyHours;
    }

    public int getWstsStudyHours() {
        return wstsStudyHours;
    }

    public void setWstsStudyHours(int wstsStudyHours) {
        this.wstsStudyHours = wstsStudyHours;
    }

    public int getCmtsStudyHours() {
        return cmtsStudyHours;
    }

    public void setCmtsStudyHours(int cmtsStudyHours) {
        this.cmtsStudyHours = cmtsStudyHours;
    }

    public int getRegisterCourseNum() {
        return registerCourseNum;
    }

    public void setRegisterCourseNum(int registerCourseNum) {
        this.registerCourseNum = registerCourseNum;
    }

    public int getPassCourseNum() {
        return passCourseNum;
    }

    public void setPassCourseNum(int passCourseNum) {
        this.passCourseNum = passCourseNum;
    }

    public int getWstsPoint() {
        return wstsPoint;
    }

    public void setWstsPoint(int wstsPoint) {
        this.wstsPoint = wstsPoint;
    }

    public int getGetWstsPoint() {
        return getWstsPoint;
    }

    public void setGetWstsPoint(int getWstsPoint) {
        this.getWstsPoint = getWstsPoint;
    }

    public String getWstsState() {
        return wstsState;
    }

    public void setWstsState(String wstsState) {
        this.wstsState = wstsState;
    }

    public int getCmtsPoint() {
        return cmtsPoint;
    }

    public void setCmtsPoint(int cmtsPoint) {
        this.cmtsPoint = cmtsPoint;
    }

    public int getGetCmtsPoint() {
        return getCmtsPoint;
    }

    public void setGetCmtsPoint(int getCmtsPoint) {
        this.getCmtsPoint = getCmtsPoint;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public String getStudyHoursType() {
        return studyHoursType;
    }

    public void setStudyHoursType(String studyHoursType) {
        this.studyHoursType = studyHoursType;
    }

    public String getTrainCourseConfig() {
        return trainCourseConfig;
    }

    public void setTrainCourseConfig(String trainCourseConfig) {
        this.trainCourseConfig = trainCourseConfig;
    }

    public String getChooseCourseType() {
        return chooseCourseType;
    }

    public void setChooseCourseType(String chooseCourseType) {
        this.chooseCourseType = chooseCourseType;
    }

    public String getTrainWorkshopConfig() {
        return trainWorkshopConfig;
    }

    public void setTrainWorkshopConfig(String trainWorkshopConfig) {
        this.trainWorkshopConfig = trainWorkshopConfig;
    }

}
