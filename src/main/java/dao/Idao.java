package dao;

import java.util.List;

public interface Idao<T> {
	public boolean create(T object);
	public List<T> read();
	public T findById(int id);
}
