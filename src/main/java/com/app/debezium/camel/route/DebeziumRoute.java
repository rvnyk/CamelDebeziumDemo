package com.app.debezium.camel.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class DebeziumRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("debezium-mongodb:eventlistener?"
                +"offsetStorageFileName=D:\\DebeziumDemo\\offset-file-1.dat"
                + "&mongodbUser={{database.user}}"
                + "&mongodbPassword={{database.password}}"
                + "&mongodbName={{database.dbname}}"
                + "&mongodbHosts={{database.hostname}}"
                //+ "&databaseWhitelist={{database.dbname}}"
                +"&collectionWhitelist={{database.collection}}")
                .log(LoggingLevel.INFO, "Incoming message ${body} with headers ${headers}");
    }
}
