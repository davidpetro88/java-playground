package product.sales;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by david on 29/10/16.
 */
public class ProductReducer extends Reducer<Text, Product, Text, Product> {

    @Override
    protected void reduce(Text key, Iterable<Product> values, Context context) throws IOException, InterruptedException {
        final double[] minValue = {Double.MAX_VALUE};
        Map<Double, String> map = new HashMap<Double, String>();
        values.forEach(product -> {
            minValue[0] = Math.min(minValue[0], product.getPrice());
            map.put(product.getPrice(), product.getData());
        });
        context.write(key, new Product(minValue[0], map.get(minValue[0])));
    }
}