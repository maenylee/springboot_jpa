/**
 * FileName: SysUserServiceImpl
 * Author:   Danny
 * Date:     2021/8/18 10:40
 * Description: 查看用户服务
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.jpa.service.impl;

import com.example.jpa.dao.SysUserDao;
import com.example.jpa.entity.SysUser;
import com.example.jpa.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈查看用户服务〉
 *
 * @author Danny
 * @create 2021/8/18
 * @since 1.0.0
 */
@Service
public class SysUserServiceImpl implements ISysUserService {

  @Autowired
  private SysUserDao sysUserDao;

  @Override
  public List<SysUser> findAll() {
    return sysUserDao.findAll();
  }
}