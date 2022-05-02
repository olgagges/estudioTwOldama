package com.uned.estudioTw.dao;

import java.util.List;

public interface BaseDAO<T, K> {
	void crear(T t);

	void borrar(T t);

	void actualizar(T t);

	List<T> listarTodos();

	T obtener(K id);

}
