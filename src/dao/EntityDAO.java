package dao;

import java.util.List;
import entity.Entity;

public interface EntityDAO<T extends Entity> {
	
	public String getSelectQuery();
	
	public String getCreateQuery();
	
	public String getUpdateQuery();
	
	public String getDeleteQuery();
	
	public List<T> getAll();
	
	public T getById(Long id);
	
	public void add(T entity);
	
	public void update(T entity);
	
	public void delete(T entity);
	
}
