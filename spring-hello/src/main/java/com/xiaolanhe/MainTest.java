package com.xiaolanhe;/**
 * @Package com.xiaolanhe
 * @author xiaolanhe
 * @date 2024/6/8 17:17
 * @version V1.0
 */

import com.xiaolanhe.Bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *@author: xiaolanhe
 *@createDate: 2024/6/8 17:17
 */
public class MainTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Person person = (Person) context.getBean("person");
		person.setName("hello spring");
		System.out.println(person.getName());
	}
}
