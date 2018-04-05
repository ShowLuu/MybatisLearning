import com.ss.mybatis.dao.DocDao;
import com.ss.mybatis.dao.UserDao;
import com.ss.mybatis.util.SqlSessionFactoryUtil;

public class SkBookTest3 {
	
	private UserDao userDao;
	private DocDao docDao;
	
	public void find(){
		userDao=SqlSessionFactoryUtil.getMapper(UserDao.class);
		System.out.println(userDao.findById(1517568886095L));
	}
	
	public static void main(String[] args) {
		new SkBookTest3().find();
	}

}
