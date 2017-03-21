package com.thebluecabrio;

import javax.persistence.*;
import java.util.List;

/**
 * Created by stevenrowney on 21/03/2017.
 */
@Entity
public class Player {

    @Id
    @GeneratedValue
    private long id;

    private String name, position;

    public Player() {
        // default constructor
    }

    public Player(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
