module impl {
    requires spring.context;
    requires spring.data.mongodb;
    requires mongo.java.driver;
    requires spring.data.commons;

    exports com.api.impl.service;
    exports com.api.impl.database;
    opens com.api.impl.service to spring.core, spring.beans, spring.context;
    opens com.api.impl.database to spring.core, spring.beans, spring.context;

}