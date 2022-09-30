package io.opentelemetry.examples.mammal;

import io.opentelemetry.examples.mammal.MammalApplication;
import io.opentelemetry.examples.utils.OpenTelemetryConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

    @SpringBootApplication
    public class MammalApplication {

        public static void main(String[] args) {
            // Configure OpenTelemetry as early as possible
            OpenTelemetryConfig.configureGlobal("mammal-app");
            SpringApplication.run(io.opentelemetry.examples.mammal.MammalApplication.class, args);
        }
    }

