package com.songsy.springcloud.plus.entity.base;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author songsy
 * @date 2019/8/14 18:51
 */
public class BaseDO implements Serializable {

    protected String id;

    protected Boolean enable = Boolean.TRUE;

    private String createdBy;
    private Long createdTime;
    private String updatedBy;
    private Long updatedTime;
    private String deletedBy;
    private Long deletedTime;

    private Integer version;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? UUID.randomUUID().hashCode() : id.hashCode());
        result += enable == null ? UUID.randomUUID().hashCode() : enable.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (id == null) {
            return false;
        }

        if (!id.equals(((BaseDO) obj).id)) {
            return false;
        }
        if (enable == null) {
            return false;
        }
        if (enable.equals (((BaseDO) obj).enable)) {
            return false;
        }
        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Long getDeletedTime() {
        return deletedTime;
    }

    public void setDeletedTime(Long deletedTime) {
        this.deletedTime = deletedTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "BaseDO{" +
                "id='" + id + '\'' +
                ", enable=" + enable +
                ", createdBy='" + createdBy + '\'' +
                ", createdTime=" + createdTime +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedTime=" + updatedTime +
                ", deletedBy='" + deletedBy + '\'' +
                ", deletedTime=" + deletedTime +
                ", version=" + version +
                '}';
    }
}
