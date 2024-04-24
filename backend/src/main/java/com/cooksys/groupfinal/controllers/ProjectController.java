package com.cooksys.groupfinal.controllers;

import com.cooksys.groupfinal.dtos.ProjectDto;
import com.cooksys.groupfinal.dtos.ProjectRequestDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.groupfinal.services.ProjectService;

import lombok.RequiredArgsConstructor;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/projects")
@RequiredArgsConstructor
public class ProjectController {
	
	private final ProjectService projectService;

	@GetMapping("/team/{teamId}")
	public List<ProjectDto> getProjectsByTeamId(
			@PathVariable Long teamId) {
		return projectService.getProjectsByTeamId(teamId);
	}

	@PostMapping("/team/{teamId}")
	public ProjectDto createProject(@PathVariable Long teamId, @RequestBody ProjectRequestDto projectRequestDto) {
		return projectService.createProject(teamId, projectRequestDto);
	}
}
