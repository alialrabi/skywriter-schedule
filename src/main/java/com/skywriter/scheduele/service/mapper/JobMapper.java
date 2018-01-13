package com.skywriter.scheduele.service.mapper;

import com.skywriter.scheduele.domain.*;
import com.skywriter.scheduele.service.dto.JobDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Job and its DTO JobDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface JobMapper extends EntityMapper<JobDTO, Job> {

    

    

    default Job fromId(Long id) {
        if (id == null) {
            return null;
        }
        Job job = new Job();
        job.setId(id);
        return job;
    }
}
