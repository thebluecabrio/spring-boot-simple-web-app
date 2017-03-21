package com.thebluecabrio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by stevenrowney on 21/03/2017.
 */
//@RestController - replaced by spring-data-rest
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @RequestMapping("/teams")
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }

    @RequestMapping("/teams/{teamId}")
    public Team getTeam(@PathVariable Long teamId) {
        return teamRepository.findOne(teamId);
    }
}
