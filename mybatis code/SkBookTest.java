import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ss.mybatis.dao.UserMapper;
import com.ss.mybatis.entity.User;

public class SkBookTest {
	
	public void find(){
		String resource="com/ss/mybatis/dao/mybatis-config.xml";
		Reader reader=null;
		SqlSession session;
		try {
			reader=Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
		session=sqlMapper.openSession();
		User user=session.selectOne("findById",1517568886095L);
		System.out.println(user);
		session.close();
	}
	
	public void findList(){
		String resource="com/ss/mybatis/dao/mybatis-config.xml";
		Reader reader=null;
		SqlSession session;
		try {
			reader=Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
		session=sqlMapper.openSession();
		List<User> lists=session.selectList("findList");
		for(User list:lists){
			System.out.println(list);
		}
		session.close();
	}
	
	public void insert(){
		String resource="com/ss/mybatis/dao/mybatis-config.xml";
		Reader reader=null;
		SqlSession session;
		try {
			reader=Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
		session=sqlMapper.openSession();
		User user=new User();
		user.setId(121224L);
		user.setUsername("111");
		user.setPassword("111");
		session.insert("insert",user);
		session.commit();
	}
	
	public void update(){
		String resource="com/ss/mybatis/dao/mybatis-config.xml";
		Reader reader=null;
		SqlSession session;
		try {
			reader=Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
		session=sqlMapper.openSession();
		User user=new User();
		user.setId(121224L);
		user.setUsername("2");
		user.setPassword("111");
		session.update("update", user);
		session.commit();
	}
	
	public void delete(){
		String resource="com/ss/mybatis/dao/mybatis-config.xml";
		Reader reader=null;
		SqlSession session;
		try {
			reader=Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
		session=sqlMapper.openSession();
		User user=new User();
		user.setId(121224L);
		session.delete("delete",user);
		session.commit();
	}
	
	public void deletes(Long id){
		String resource="com/ss/mybatis/dao/mybatis-config.xml";
		Reader reader=null;
		SqlSession session;
		try {
			reader=Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
		session=sqlMapper.openSession();
		UserMapper user=session.getMapper(UserMapper.class);
		user.delete(id);
		session.commit();
	}
	
	public void findAll(){
		String resource="com/ss/mybatis/dao/mybatis-config.xml";
		Reader reader=null;
		SqlSession session;
		try {
			reader=Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
		session=sqlMapper.openSession();
		UserMapper user=session.getMapper(UserMapper.class);
		user.findAll();
		session.commit();
	}
	
	public static void main(String[] args) {
		new SkBookTest().findList();
	}
	
}
