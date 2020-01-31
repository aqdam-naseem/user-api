package org.aqdamnaseem.projects.usermgmt.service.dto;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link org.aqdamnaseem.projects.usermgmt.domain.Address}
 * entity.
 */
@ApiModel(description = "not an ignored comment")
public class AddressDTO implements Serializable {

	private Long id;

	@NotNull
	private String addressline1;

	private String addressline2;

	private String postalCode;

	private Long cityId;

	private Long stateId;

	private Long countryId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		AddressDTO addressDTO = (AddressDTO) o;
		if (addressDTO.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), addressDTO.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "AddressDTO{" + "id=" + getId() + ", addressline1='" + getAddressline1() + "'" + ", addressline2='"
				+ getAddressline2() + "'" + ", postalCode='" + getPostalCode() + "'" + ", cityId=" + getCityId()
				+ ", stateId=" + getStateId() + ", countryId=" + getCountryId() + "}";
	}
}
