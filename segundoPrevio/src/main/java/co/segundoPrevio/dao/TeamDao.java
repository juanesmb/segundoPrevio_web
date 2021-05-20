package co.segundoPrevio.dao;

import java.sql.SQLException;
import java.util.List;

public interface TeamDao {
	public void insert(Object o) throws SQLException;

	public Object select(int id);

	public List<Object> selectAll();

	public void delete(int id) throws SQLException;

	public void update(Object o) throws SQLException;
}
