package io.github.dureke.marketplaceanalytics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class MarketplaceAnalyticsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketplaceAnalyticsApplication.class, args);
    }

    @Bean
    CommandLineRunner verifyDatabaseConnection(DataSource dataSource) {
        return args -> {
            try (Connection connection = dataSource.getConnection()) {
                System.out.println("Database connection verified: " + connection.getMetaData().getDatabaseProductName());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        };
    }
}