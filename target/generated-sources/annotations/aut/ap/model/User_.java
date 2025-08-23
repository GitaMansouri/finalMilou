package aut.ap.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(User.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class User_ extends aut.ap.framework.IdEntity_ {

	public static final String PASSWORD = "password";
	public static final String NAME = "name";
	public static final String EMAIL = "email";

	
	/**
	 * @see aut.ap.model.User#password
	 **/
	public static volatile SingularAttribute<User, String> password;
	
	/**
	 * @see aut.ap.model.User#name
	 **/
	public static volatile SingularAttribute<User, String> name;
	
	/**
	 * @see aut.ap.model.User
	 **/
	public static volatile EntityType<User> class_;
	
	/**
	 * @see aut.ap.model.User#email
	 **/
	public static volatile SingularAttribute<User, String> email;

}

