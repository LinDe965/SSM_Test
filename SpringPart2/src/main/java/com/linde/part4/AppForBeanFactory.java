package com.linde.part4;

import com.linde.part4.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppForBeanFactory {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContextPart4.xml");
        BeanFactory beanFactory=new XmlBeanFactory(resource);
        BookDao bean = beanFactory.getBean(BookDao.class);
        bean.save();
    }
}
