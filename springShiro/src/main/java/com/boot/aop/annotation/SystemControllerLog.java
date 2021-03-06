package com.boot.aop.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**  
 *
 *项目名称：springShiro
 *
 *描述：controller日志注解
 *
 *创建人：Mr.chang
 *
 *创建时间：2016年12月5日 上午11:23:06 
 *   
 * Copyright @ 2016 by Mr.chang  
 *   
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})    
@Retention(RetentionPolicy.RUNTIME)    
@Documented  
public @interface SystemControllerLog {
	
	String description()  default ""; 
}
  