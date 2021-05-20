package co.segundoPrevio.dao;

import java.sql.SQLException;
import java.util.List;

import co.segundoPrevio.model.Team;

public interface TeamDao {
	public void insert(Team o) throws SQLException;

	public Team select(int id);

	public List<Team> selectAll();

	public void delete(int id) throws SQLException;

	public void update(Team o) throws SQLException;
}
