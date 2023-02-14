package com.pract.demo.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.List;

//@Data
//@Builder
@Document(collection = "JobPost")
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
    private String profile;
    private String desc;
    private String techs[];
    private Integer exp;

    public Person() {
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "profile='" + profile + '\'' +
                ", desc='" + desc + '\'' +
                ", techs=" + Arrays.toString(techs) +
                ", exp=" + exp +
                '}';
    }
}
