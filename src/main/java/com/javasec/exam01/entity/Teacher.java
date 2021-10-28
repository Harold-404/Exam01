package com.javasec.exam01.entity;

import java.io.Serializable;

/**
 * (Teacher)实体类
 *
 * @author JavaExam
 * @since 2021-10-31 06:57:10
 */
public class Teacher implements Serializable {
    private static final long serialVersionUID = -99578072490130085L;
    
    private Integer id;
    
    private String subname;
    
    private String teaname;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public String getTeaname() {
        return teaname;
    }

    public void setTeaname(String teaname) {
        this.teaname = teaname;
    }

}

