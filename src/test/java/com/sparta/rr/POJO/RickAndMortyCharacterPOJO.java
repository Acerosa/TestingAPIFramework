
package com.sparta.rr.POJO;

import com.sparta.rr.Location;
import com.sparta.rr.Origin;
import com.sparta.rr.RickAndMortyInterface;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class RickAndMortyCharacterPOJO implements RickAndMortyInterface {
    private String Created;

    private List<String> Episode;

    private String Gender;

    private Long Id;

    private String Image;

    private com.sparta.rr.Location Location;

    private String Name;

    private com.sparta.rr.Origin Origin;

    private String Species;

    private String Status;

    private String Type;

    private String Url;

    public String getCreated() {
        return Created;
    }

    public void setCreated(String created) {
        Created = created;
    }

    public List<String> getEpisode() {
        return Episode;
    }

    public void setEpisode(List<String> episode) {
        Episode = episode;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public Location getLocation() {
        return Location;
    }

    public void setLocation(Location location) {
        Location = location;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Origin getOrigin() {
        return Origin;
    }

    public void setOrigin(Origin origin) {
        Origin = origin;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }


}
