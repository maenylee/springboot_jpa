/**
 * FileName: SysUser
 * Author:   Danny
 * Date:     2021/8/18 10:21
 * Description: 系统用户
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.jpa.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈系统用户〉
 *
 * @author Danny
 * @create 2021/8/18
 * @since 1.0.0
 */
@Entity
@Table(name = "sys_user")
@Data
public class SysUser {

  /**
   * @Id 标注该字段对应数据库主键
   * @GeneratedValue 主键生成策略
   * @Column 对应数据库字段名
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "user_name")
  private String userName;

  @Column(name = "password")
  private String password;

  @Column(name = "login_name")
  private String loginName;

  @Column(name = "address")
  private String address;
}