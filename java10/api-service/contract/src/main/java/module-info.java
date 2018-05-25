module contract {
    exports com.api.contract;
    requires spring.context;
    requires spring.web;
    requires spring.beans;
    requires impl;
    opens com.api.contract to spring.core;

}