/**
 * FileName: SysUserDao
 * Author:   Danny
 * Date:     2021/8/18 10:35
 * Description: SysUserDao接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.jpa.dao;

import com.example.jpa.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 〈一句话功能简述〉<br> 
 * 〈SysUserDao接口〉
 * /**
 * 参数一 T :当前需要映射的实体
 * 参数二 ID :当前映射的实体中的OID的类型
 * @author Danny
 * @create 2021/8/18
 * @since 1.0.0
 */
public interface SysUserDao extends JpaRepository<SysUser,Long> {

}