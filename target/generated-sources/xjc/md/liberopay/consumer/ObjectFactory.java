//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.06 at 01:02:55 PM EEST 
//


package md.liberopay.consumer;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the md.liberopay.consumer package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: md.liberopay.consumer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserDetailsRequest }
     * 
     */
    public UserDetailsRequest createUserDetailsRequest() {
        return new UserDetailsRequest();
    }

    /**
     * Create an instance of {@link UserDetailsResponse }
     * 
     */
    public UserDetailsResponse createUserDetailsResponse() {
        return new UserDetailsResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

}
