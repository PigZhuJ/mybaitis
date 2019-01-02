package mybatis;

import Interface.mybatisInterface;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

import java.io.IOException;
import java.io.InputStream;

public class selectName {
    public static void main(String[] args) throws IOException {
        String resource="config/mybatis-config.xml";
        InputStream is= Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        mybatisInterface mapper=sqlSession.getMapper(mybatisInterface.class);
        String s=mapper.getName("zhujian");
        System.out.println(s);

    }
}
