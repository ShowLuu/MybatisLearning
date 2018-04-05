import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ss.mybatis.entity.Document;
import com.ss.mybatis.entity.User;

public class SkBookTest {
	
	public void test01(){
		String resource="mybatis-config.xml";
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
	
	public void test02(){
		String resource="mybatis-config.xml";
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
		List<Document> lists=session.selectList("findTwo2");
		for(Document list:lists){
			System.out.println(list);
		}
		session.close();
	}
	
	public static void main(String[] args) {
			new SkBookTest().test02();
	}

}
