package com.cooksys.groupfinal.services;

import com.cooksys.groupfinal.dtos.ProjectDto;

import java.util.List;

public interface ProjectService {

    List<ProjectDto> getProjectsByTeamId(Long teamId);
}
