package com.ss.mybatis.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtil {
	
	private final static String config="mybatis-config.xml";
	private static SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession;
	private static ThreadLocal<SqlSession> local=new ThreadLocal<>();
	
	static{
		try {
			Reader reader=Resources.getResourceAsReader(config);
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
			sqlSessionFactory=sqlSessionFactoryBuilder.build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSession(){
		SqlSession sqlSession=local.get();
		if(sqlSession==null){
			sqlSession=sqlSessionFactory.openSession();
			local.set(sqlSession);
		}
		return sqlSession;
	}
	
	public static<T> T getMapper(Class<T> t){
		return getSession().getMapper(t);
	}
	

}
