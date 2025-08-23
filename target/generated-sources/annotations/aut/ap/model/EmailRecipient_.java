package aut.ap.model;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(EmailRecipient.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class EmailRecipient_ {

	public static final String RECIPIENT = "recipient";
	public static final String IS_READ = "isRead";
	public static final String EMAIL = "email";

	
	/**
	 * @see aut.ap.model.EmailRecipient#recipient
	 **/
	public static volatile SingularAttribute<EmailRecipient, User> recipient;
	
	/**
	 * @see aut.ap.model.EmailRecipient#isRead
	 **/
	public static volatile SingularAttribute<EmailRecipient, Boolean> isRead;
	
	/**
	 * @see aut.ap.model.EmailRecipient
	 **/
	public static volatile EntityType<EmailRecipient> class_;
	
	/**
	 * @see aut.ap.model.EmailRecipient#email
	 **/
	public static volatile SingularAttribute<EmailRecipient, Email> email;

}

