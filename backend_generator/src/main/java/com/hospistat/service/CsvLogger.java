package com.hospi.backend;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CsvLogger {
    private static final String FILE_PATH = "frontend_dashboard/hospital_data.csv";

    public static void logData(String patientId, String heartRate, String temperature) {
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            String timestamp = LocalDateTime.now()
                                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            String line = String.join(",", patientId, heartRate, temperature, timestamp);
            writer.append(line).append("\n");
            writer.flush();
        } catch (IOException e) {
            System.err.println("Failed to write to CSV: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        logData("patient001", "72", "36.9");
    }
}
