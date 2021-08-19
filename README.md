## SpringBoot JPA提供的核心接口
1. Repository接口
2. CrudRepository接口
3. PagingAndSortingRepository接口
4. JpaRepository接口
5. JPASpecificationExecutor接口
### Repository接口的使用
 
 提供了方法名称命名查询方式
 提供了基于@Query注解查询与更新
 
  ```
  import com.bjsxt.pojo.Users;
  import org.springframework.data.repository.Repository;
  
  import java.util.List;
  
  /**
   * Repository接口方法名称命名查询
   *
   */
  public interface UsersRepositoryByName extends Repository<Users,Integer> {
      //方法名称必须要遵循驼峰式命名规则，findBy（关键字）+属性名称（首字母大写）+查询条件（首字母大写）
      List<Users> findByName(String name);
  
      List<Users> findByNameAndAge(String name,Integer age);
  
      List<Users> findByNameLike(String name);
      
      @Query(value = "select * from t_user where name=?",nativeQuery = true)
      List<Users> queryByNameUseSQL(String name);
  
  }
  ```
 ### CrudRepository接口的使用
 CrudRepository接口,主要是完成一些增删改查的操作。注意：CrudRepository接口继承了Repository接口
 
 ### PagingAndSortingRepository接口的使用
 该接口提供了分页与排序的操作，注意：该接口继承了CrudRepository接口
 
 ### JpaRepository接口
 该接口继承了PagingAndSortingRepository。对继承的父接口中方法的返回值进行适配