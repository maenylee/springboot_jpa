package com.example.jpa.service;

import com.example.jpa.entity.SysUser;

import java.util.List;

public interface ISysUserService {
  List<SysUser> findAll();
}
