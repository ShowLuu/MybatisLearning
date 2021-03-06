import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ss.mybatis.entity.Document;
import com.ss.mybatis.entity.User;

public class SkBookTest2 {
	
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
		long time1=System.currentTimeMillis();
		List<Document> lists=session.selectList("findTwo2");
		for(Document list:lists){
			System.out.println(list.toString());
		}
	}
	
	public void find2(){
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
		long time1=System.currentTimeMillis();
		List<Document> lists=session.selectList("findTwo3");
		for(Document list:lists){
			System.out.println(list.toString());
			System.out.println("==============");
			for(User user:list.getUserList()){
				System.out.println(user.toString());
			}
		}
	}
		
	public static void main(String[] args) {
		new SkBookTest2().find2();
	}
	
}
