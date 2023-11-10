package com.tinklebi.cms.ht.dao;

import com.ibatis.common.resources.Resources;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/10/23 22:50
 */
@SpringBootTest
public class SqlTest {
    @Test
    void test1() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        System.out.println("SessionFactory加载成功");
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            Connection connection = sqlSession.getConnection();
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //如果dataSource的type=“POOLED”，代表使用连接池，close是将连接回收到连接池中
        //如果type=“UNPOOLED”，代表直连，close则会调用Connection.close()方法关闭连接
    }
}
