/*

 * Copyright (2021, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.kubesys.datafrk.druid;

import io.github.kubesys.datafrk.core.operators.DropTable;

/**
 * @author wuheng@iscas.ac.cn
 * @since 2.0.0
 *
 */
public class DruidDropTable extends DropTable {

	public DruidDropTable(String name) {
		super(name);
	}

	@Override
	public String toSQL() {
		return "DROP table " + this.name;
	}
	
}
