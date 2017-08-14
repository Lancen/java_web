package com.lance.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // 注解的目标是类
public @interface Table {
	public String tableName();
}
