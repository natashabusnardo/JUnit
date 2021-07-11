package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import model.Column;

public class ColumnTest {
	Column c = Mockito.spy(Column.class);

	@Test
	public void validateCreateColumnNotNullFalseAutoIncrementFalse() {
		String expected = "’codigo’ INT,";
		String result = c.createColumn("codigo", "INT", false, false);
		Assert.assertEquals(expected, result);
		Mockito.verify(c, Mockito.never()).isNotNull();
		Mockito.verify(c, Mockito.never()).isAutoIncrement();
	}
	
	@Test
	public void validateCreateColumnNotNullTrueAutoIncrementTrue() {
		String expected = "’codigo’ INT NOT NULL AUTO_INCREMENT,";
		String result = c.createColumn("codigo", "INT", true, true);
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void validateCreateColumnNotNullTrueAutoIncrementFalse() {
		String expected = "’codigo’ INT NOT NULL,";
		String result = c.createColumn("codigo", "INT", true, false);
		Assert.assertEquals(expected, result);
		Mockito.verify(c, Mockito.never()).isAutoIncrement();
	}
	
	@Test
	public void validateCreateColumnNotNullFalseAutoIncrementTrue() {
		String expected = "’codigo’ INT AUTO_INCREMENT,";
		String result = c.createColumn("codigo", "INT", false, true);
		Assert.assertEquals(expected, result);
		Mockito.verify(c, Mockito.never()).isNotNull();
	}

}
