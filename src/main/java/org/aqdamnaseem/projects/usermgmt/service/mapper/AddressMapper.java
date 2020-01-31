package org.aqdamnaseem.projects.usermgmt.service.mapper;

import org.aqdamnaseem.projects.usermgmt.domain.*;
import org.aqdamnaseem.projects.usermgmt.service.dto.AddressDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Address} and its DTO {@link AddressDTO}.
 */
@Mapper(componentModel = "spring", uses = { CityMapper.class, StateMapper.class, CountryMapper.class })
public interface AddressMapper extends EntityMapper<AddressDTO, Address> {

	@Mapping(source = "city.id", target = "cityId")
	@Mapping(source = "state.id", target = "stateId")
	@Mapping(source = "country.id", target = "countryId")
	AddressDTO toDto(Address address);

	@Mapping(source = "cityId", target = "city")
	@Mapping(source = "stateId", target = "state")
	@Mapping(source = "countryId", target = "country")
	Address toEntity(AddressDTO addressDTO);

	default Address fromId(Long id) {
		if (id == null) {
			return null;
		}
		Address address = new Address();
		address.setId(id);
		return address;
	}
}
