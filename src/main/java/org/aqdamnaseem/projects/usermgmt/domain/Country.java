package org.aqdamnaseem.projects.usermgmt.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * A Country.
 */
@Entity
@Table(name = "country")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Country implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Column(name = "code", nullable = false)
	private String code;

	@NotNull
	@Column(name = "name", nullable = false)
	private String name;

	@NotNull
	@Column(name = "created_by", nullable = false)
	private String createdBy;

	@NotNull
	@Column(name = "created_at", nullable = false)
	private LocalDate createdAt;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "modified_at")
	private LocalDate modifiedAt;

	@OneToMany(mappedBy = "country")
	@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
	private Set<State> states = new HashSet<>();

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public Country code(String code) {
		this.code = code;
		return this;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public Country name(String name) {
		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public Country createdBy(String createdBy) {
		this.createdBy = createdBy;
		return this;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public Country createdAt(LocalDate createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public Country modifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
		return this;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public LocalDate getModifiedAt() {
		return modifiedAt;
	}

	public Country modifiedAt(LocalDate modifiedAt) {
		this.modifiedAt = modifiedAt;
		return this;
	}

	public void setModifiedAt(LocalDate modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public Set<State> getStates() {
		return states;
	}

	public Country states(Set<State> states) {
		this.states = states;
		return this;
	}

	public Country addState(State state) {
		this.states.add(state);
		state.setCountry(this);
		return this;
	}

	public Country removeState(State state) {
		this.states.remove(state);
		state.setCountry(null);
		return this;
	}

	public void setStates(Set<State> states) {
		this.states = states;
	}
	// jhipster-needle-entity-add-getters-setters - JHipster will add getters and
	// setters here, do not remove

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Country)) {
			return false;
		}
		return id != null && id.equals(((Country) o).id);
	}

	@Override
	public int hashCode() {
		return 31;
	}

	@Override
	public String toString() {
		return "Country{" + "id=" + getId() + ", code='" + getCode() + "'" + ", name='" + getName() + "'"
				+ ", createdBy='" + getCreatedBy() + "'" + ", createdAt='" + getCreatedAt() + "'" + ", modifiedBy='"
				+ getModifiedBy() + "'" + ", modifiedAt='" + getModifiedAt() + "'" + "}";
	}
}
