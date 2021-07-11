package model;

/**
 * Class that represents the Column.
 *
 * @author Natasha Busnardo
 */
public class Column {
	private String name;
	private String type;
	private boolean notNull;
	private boolean autoIncrement;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isNotNull() {
		return notNull;
	}

	public void setNotNull(boolean notNull) {
		this.notNull = notNull;
	}

	public boolean isAutoIncrement() {
		return autoIncrement;
	}

	public void setAutoIncrement(boolean autoIncrement) {
		this.autoIncrement = autoIncrement;
	}

	/**
	 * Returns a String object that has the construction of the column in SQL
	 * pattern.
	 * 
	 * @param name set the name of the column
	 * @param type set the data type of the column
	 * @param notNull set up if the data is a NotNull element
	 * @param autoIncrement set up if the data is an Auto Increment element
	 * @return the String object with the specified parameters.
	 */
	public String createColumn(String name, String type, boolean notNull, boolean autoIncrement) {
		StringBuilder builder = new StringBuilder();
		builder.append("’" + name + "’ ");
		builder.append(type);
		if (notNull)
			builder.append(" NOT NULL");
		if (autoIncrement)
			builder.append(" AUTO_INCREMENT");
		builder.append(",");

		String column = builder.toString();
		return column;

	}

}
