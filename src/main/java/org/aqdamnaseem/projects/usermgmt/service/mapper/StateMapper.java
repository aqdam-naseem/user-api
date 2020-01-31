package org.aqdamnaseem.projects.usermgmt.service.mapper;

import org.aqdamnaseem.projects.usermgmt.domain.*;
import org.aqdamnaseem.projects.usermgmt.service.dto.StateDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link State} and its DTO {@link StateDTO}.
 */
@Mapper(componentModel = "spring", uses = {CountryMapper.class})
public interface StateMapper extends EntityMapper<StateDTO, State> {

    @Mapping(source = "country.id", target = "countryId")
    StateDTO toDto(State state);

    @Mapping(target = "cities", ignore = true)
    @Mapping(target = "removeCity", ignore = true)
    @Mapping(source = "countryId", target = "country")
    State toEntity(StateDTO stateDTO);

    default State fromId(Long id) {
        if (id == null) {
            return null;
        }
        State state = new State();
        state.setId(id);
        return state;
    }
}
