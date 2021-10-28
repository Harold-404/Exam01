package com.javasec.exam01.service;

import com.javasec.exam01.entity.User;

public interface StuQueryService {

     User selectUserByStatement(String id);

}