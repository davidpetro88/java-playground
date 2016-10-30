package product.sales;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by david on 29/10/16.
 */
public class ProductMapper extends Mapper<LongWritable, Text, Text, Product> {

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString();
        if (line.length() == 32) {
            String product = line.substring(12, 27).replaceAll("#", "");
            Integer price = Integer.parseInt(line.substring(line.length() - 5));
            context.write(new Text(product), new Product(price.doubleValue(), formatDate(line.substring(0, 12))));
        }
    }

    private String formatDate(String dt) {
        LocalDateTime xmas = LocalDateTime.parse(dt, DateTimeFormatter.ofPattern("yyyyMMddHHmm"));
        return xmas.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }
}