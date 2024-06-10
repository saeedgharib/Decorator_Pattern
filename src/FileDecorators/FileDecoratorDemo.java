package FileDecorators;
import java.util.Base64;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class FileDecoratorDemo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nSaeed,550\nShahan,7000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new UTF8Decorator(
                                new FileDataSource("employee.txt"))));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("employee.txt");

        System.out.println("- Input Data");
        System.out.println(salaryRecords);
        System.out.println("- Encoded Data");
        System.out.println(plain.readData());
        System.out.println("- Decoded Data");
        System.out.println(encoded.readData());
    }
}




