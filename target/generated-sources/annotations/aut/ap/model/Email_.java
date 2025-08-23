package aut.ap.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

@StaticMetamodel(Email.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Email_ extends aut.ap.framework.IdEntity_ {

	public static final String DATE = "date";
	public static final String CODE = "code";
	public static final String PARENT_EMAIL = "parentEmail";
	public static final String SENDER = "sender";
	public static final String SUBJECT = "subject";
	public static final String BODY = "body";
	public static final String IS_REPLY = "isReply";
	public static final String IS_FORWARD = "isForward";

	
	/**
	 * @see aut.ap.model.Email#date
	 **/
	public static volatile SingularAttribute<Email, LocalDate> date;
	
	/**
	 * @see aut.ap.model.Email#code
	 **/
	public static volatile SingularAttribute<Email, String> code;
	
	/**
	 * @see aut.ap.model.Email#parentEmail
	 **/
	public static volatile SingularAttribute<Email, Email> parentEmail;
	
	/**
	 * @see aut.ap.model.Email#sender
	 **/
	public static volatile SingularAttribute<Email, User> sender;
	
	/**
	 * @see aut.ap.model.Email#subject
	 **/
	public static volatile SingularAttribute<Email, String> subject;
	
	/**
	 * @see aut.ap.model.Email#body
	 **/
	public static volatile SingularAttribute<Email, String> body;
	
	/**
	 * @see aut.ap.model.Email
	 **/
	public static volatile EntityType<Email> class_;
	
	/**
	 * @see aut.ap.model.Email#isReply
	 **/
	public static volatile SingularAttribute<Email, Boolean> isReply;
	
	/**
	 * @see aut.ap.model.Email#isForward
	 **/
	public static volatile SingularAttribute<Email, Boolean> isForward;

}

