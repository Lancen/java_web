package com.lance.util;

import java.lang.reflect.Field;

import com.lance.annotation.Column;
import com.lance.annotation.Table;

public class TableUtils {

	public static String CreateTableSql(Class<?> clazz) {
		StringBuilder sql = new StringBuilder();
		sql.append("CREATE TABLE ");

		// 获取表名，通过传参的类，获取类的注解的值
		Table table = (Table) clazz.getAnnotation(Table.class);
		String tableName = table.tableName();
		sql.append(tableName).append("(\n");

		Field[] fields = clazz.getDeclaredFields();// getFields只能获取public的属性，getDeclaredFields可以获取所有的
		String primaryKey = "";
		for (int i = 0; i < fields.length; i++) {
			Column column = (Column) fields[i].getAnnotation(Column.class);// getAnnotation指定类型的注解，如果没有则为null,(Column)
																		   // fields[i].getAnnotations()[0];获取对象的所有注解
			String field = column.field();
			String type = column.type();
			boolean defaultNull = column.defaultNull();
			
			
			sql.append(field).append(" ").append(type);
			if (defaultNull) {
				if (type.toUpperCase().equals("TIMESTAMP")) {
					sql.append(",\n");
				} else {
					sql.append(" DEFAULT NULL,\n");
				}
			} else {
				
				if (column.primaryKey()) {
					primaryKey = "PRIMARY KEY (" + field + ")";
				}
				if(column.autoIncrement()){
					sql.append("AUTO_INCREMENT");
				}
				sql.append(" NOT NULL,\n");
			}
		}
		if (!StringUtils.isEmpty(primaryKey)) {
			sql.append("\t").append(primaryKey);
		}
		sql.append("\n) ENGINE=InnoDB DEFAULT CHARSET=utf8");
		return sql.toString();
	}
}
