package view;

import model.Column;
public class main {
	
	public static void main(String[] args) {
		Column c = new Column();
		
		c.setName("codigo");
		c.setType("varchar(45)");
		c.setNotNull(true);
		
		System.out.println(c.createColumn(c.getName(), c.getType(), c.isNotNull(), c.isAutoIncrement()));

	}
}
