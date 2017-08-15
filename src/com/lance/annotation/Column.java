/**
 * 
 */
package com.lance.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
/**
 * @author Administrator
 *
 */
@Documented
@Target(ElementType.FIELD)  //注解的目标
public @interface Column {

	public String field();// 字段名

	public boolean primaryKey() default false;// 是否为主键

	public String type() default "VARCHAR(80)";// 字段类型，记得用双引号，单引号只能用于单字节

	public boolean defaultNull() default true;// 默认null
	
	public boolean autoIncrement() default false;// 是否自增
}
