package com.campusdual.musiquea.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("CollaboratorsConcertsDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/CollaboratorConcertsDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class CollaboratorsConcertsDao extends OntimizeJdbcDaoSupport {

	public static final String ATTR_COLLABORATOR_CONCERT_ID = "collaborator_concert_id";
	public static final String ATTR_CONCERT_ID = "concert_id";
	public static final String ATTR_COLLABORATOR_ID = "collaborator_id";

}