package com.lance.test;

import com.lance.annotation.Table;
import com.lance.bean.Member;
import com.lance.util.TableUtils;

public class CreateSql {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String sql = TableUtils.getCreateTableSql(Member.class);
//		Table table = Member.class.getAnnotation(Table.class);
//		String tableName = table.tableName();
		System.out.println(sql);
	}

}
