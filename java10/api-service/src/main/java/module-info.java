module app {
    requires java.sql;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.context;
    requires contract;

    opens com.api;
    exports com.api;
}
