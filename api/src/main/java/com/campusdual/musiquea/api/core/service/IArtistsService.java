package com.campusdual.musiquea.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IArtistsService {

	public EntityResult artistsQuery(Map<String, Object> keyMap, List<String> attrlist) throws OntimizeJEERuntimeException;
	public EntityResult artistsInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;
	public EntityResult artistsUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
	public EntityResult artistsDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

	public EntityResult artistsGenresQuery(Map<String, Object> keyMap, List<String> attrlist) throws OntimizeJEERuntimeException;
	public EntityResult artistsGenresInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;
	public EntityResult artistsGenresUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
	public EntityResult artistsGenresDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

	public EntityResult genresQuery(Map<String, Object> keyMap, List<String> attrlist) throws OntimizeJEERuntimeException;
	public EntityResult genresInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;
	public EntityResult genresUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
	public EntityResult genresDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
	
}
