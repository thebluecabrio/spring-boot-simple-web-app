package com.thebluecabrio;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by stevenrowney on 21/03/2017.
 */
@Entity
public class Team {

    @Id
    @GeneratedValue
    private long id;

    private String location;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Player> players;

    public Team() {
        // default constructor
    }

    public Team(String location, String name, Set<Player> players) {
        this.location = location;
        this.name = name;
        this.players = players;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
