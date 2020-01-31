package org.aqdamnaseem.projects.usermgmt.service.dto;

import java.time.LocalDate;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link org.aqdamnaseem.projects.usermgmt.domain.City} entity.
 */
public class CityDTO implements Serializable {

	private Long id;

	@NotNull
	private String code;

	@NotNull
	private String name;

	@NotNull
	private String createdBy;

	@NotNull
	private LocalDate createdAt;

	private String modifiedBy;

	private LocalDate modifiedAt;

	private Long stateId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public LocalDate getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(LocalDate modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		CityDTO cityDTO = (CityDTO) o;
		if (cityDTO.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), cityDTO.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "CityDTO{" + "id=" + getId() + ", code='" + getCode() + "'" + ", name='" + getName() + "'"
				+ ", createdBy='" + getCreatedBy() + "'" + ", createdAt='" + getCreatedAt() + "'" + ", modifiedBy='"
				+ getModifiedBy() + "'" + ", modifiedAt='" + getModifiedAt() + "'" + ", stateId=" + getStateId() + "}";
	}
}
