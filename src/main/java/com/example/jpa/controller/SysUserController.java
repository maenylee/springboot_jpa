/**
 * FileName: SysUserController
 * Author:   Danny
 * Date:     2021/8/18 10:42
 * Description: 控制类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.jpa.controller;

import com.example.jpa.entity.SysUser;
import com.example.jpa.service.ISysUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈控制类〉
 *
 * @author Danny
 * @create 2021/8/18
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/api")
@ApiOperation("系统用户")
public class SysUserController {

  @Autowired
  private ISysUserService sysUserService;

  @GetMapping(value = "/list")
  @ApiOperation("查看所有用户")
  public List<SysUser> list(){
    return sysUserService.findAll();
  }

}