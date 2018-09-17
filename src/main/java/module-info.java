open module systems.cauldron.service.springboot {
    exports systems.cauldron.service.springboot;
    requires java.sql;
    requires org.apache.logging.log4j;
    requires spring.context;
    requires spring.beans;
    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;
}