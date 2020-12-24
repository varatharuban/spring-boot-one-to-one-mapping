package com.rubanelearning.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	private static final long serialVersionUID = -7482375225107139573L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATE_TIMESTAMP")
	private Date createTimestamp;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

	@Column(name = "UPDATE_TIMESTAMP")
	private Date updateTimestamp;

	@Column(name = "MODIFY_REMARKS")
	private String modifyRemarks;

	@PrePersist
	@PreUpdate
	public void updateAuditFields() {
		Calendar calendar = Calendar.getInstance();
		if (getCreateTimestamp() == null) {
			setCreateTimestamp(calendar.getTime());
		}

		setUpdateTimestamp(calendar.getTime());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Date createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(Date updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public String getModifyRemarks() {
		return modifyRemarks;
	}

	public void setModifyRemarks(String modifyRemarks) {
		this.modifyRemarks = modifyRemarks;
	}

}