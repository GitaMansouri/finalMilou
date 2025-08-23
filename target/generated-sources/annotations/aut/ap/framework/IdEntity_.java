package aut.ap.framework;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.MappedSuperclassType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(IdEntity.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class IdEntity_ {

	public static final String ID = "id";

	
	/**
	 * @see aut.ap.framework.IdEntity#id
	 **/
	public static volatile SingularAttribute<IdEntity, Integer> id;
	
	/**
	 * @see aut.ap.framework.IdEntity
	 **/
	public static volatile MappedSuperclassType<IdEntity> class_;

}

