package org.example;

import java.util.Map;
import java.util.NoSuchElementException;
//1. Насколько сложно добавить поддержку нового типа отчета?
// - Придется каждый раз создавать новый тип данных, но лучше всего заранее спланировать в каком ввиде надо эскпортировать данные.
//

//   * 2. Как будет выглядеть проект, если в нем будет 1000+ типов отчетов?
//Большим и поэтому If или Switch не подойдет и нужно что-то более совершенное вроде Map.
public class Homework {
    public static void main(String[] args) {
        ReportService reportService = new ReportService(Map.of("pdf", new PdfReport()));
        Document document = new Document();
        byte[] reportData = reportService.createReport(document, "pdf");

    }

    static class ReportService {

        private final Map<String, Report> reports;

        public ReportService(Map<String, Report> reports) {
            this.reports = reports;
        }

        public byte[] createReport(Document document, String reportType) {
            if (document == null) {
                throw new IllegalArgumentException("Документ не может быть null");
            }
            Report report = reports.get(reportType);
            if (report == null) {
                throw new NoSuchElementException("Не зарегистрирован отчет с типом \"" + reportType + "\"");
            }
            return report.createReport(document);
        }

    }

    interface Report {
        byte[] createReport(Document document);
    }

    static class PdfReport implements Report {
        @Override
        public byte[] createReport(Document document) {
            byte[] data = null;
            // ... код, который формирует PDF-документ, используя поля документа

            return data;
        }
    }

    static class JsonReport implements Report {
        @Override
        public byte[] createReport(Document document) {
            byte[] data = null;
            // ... код, который формирует Json-документ, используя поля документа

            return data;
        }

    }

    static class AnotherReport implements Report {
        @Override
        public byte[] createReport(Document document) {
            byte[] data = null;
            // ... код, который формирует Другой-документ, используя поля документа

            return data;
        }
    }

    static class Document {
        private long id;
        private String number;

        public Document() {
        }

        public Document(long id, String number) {
            this.id = id;
            this.number = number;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }
}
