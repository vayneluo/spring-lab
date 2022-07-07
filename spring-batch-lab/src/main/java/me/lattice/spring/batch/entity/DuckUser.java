package me.lattice.spring.batch.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 平台用户表
 * </p>
 *
 * @author Lattice
 * @since 2022-03-09
 */
@TableName("db_duck_user")
public class DuckUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String openId;

    private String unionId;

    private Integer source;

    private Integer sourceDetail;

    private String nickname;

    private String realName;

    private String avatarUrl;

    private Integer gender;

    private String mobile;

    private String countryCode;

    private String country;

    private String province;

    private String city;

    private String language;

    private Integer basicAuth;

    private Integer phoneAuth;

    private Integer identity;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer isDel;

    private String traceId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }
    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }
    public Integer getSourceDetail() {
        return sourceDetail;
    }

    public void setSourceDetail(Integer sourceDetail) {
        this.sourceDetail = sourceDetail;
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public Integer getBasicAuth() {
        return basicAuth;
    }

    public void setBasicAuth(Integer basicAuth) {
        this.basicAuth = basicAuth;
    }
    public Integer getPhoneAuth() {
        return phoneAuth;
    }

    public void setPhoneAuth(Integer phoneAuth) {
        this.phoneAuth = phoneAuth;
    }
    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    @Override
    public String toString() {
        return "DuckUser{" +
            "id=" + id +
            ", openId=" + openId +
            ", unionId=" + unionId +
            ", source=" + source +
            ", sourceDetail=" + sourceDetail +
            ", nickname=" + nickname +
            ", realName=" + realName +
            ", avatarUrl=" + avatarUrl +
            ", gender=" + gender +
            ", mobile=" + mobile +
            ", countryCode=" + countryCode +
            ", country=" + country +
            ", province=" + province +
            ", city=" + city +
            ", language=" + language +
            ", basicAuth=" + basicAuth +
            ", phoneAuth=" + phoneAuth +
            ", identity=" + identity +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", isDel=" + isDel +
            ", traceId=" + traceId +
        "}";
    }
}