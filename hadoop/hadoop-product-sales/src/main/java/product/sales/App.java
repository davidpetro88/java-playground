package product.sales;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

    public static void main(String[] args) throws Exception{
        Configuration conf = new Configuration();
        String[] otherArgs = new GenericOptionsParser(conf, args).getRemainingArgs();
        Job job = Job.getInstance(conf, "Job Product Hadoop");
        job.setJarByClass(App.class);
        job.setMapperClass(ProductMapper.class);
        job.setCombinerClass(ProductReducer.class);
        job.setReducerClass(ProductReducer.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Product.class);

        FileInputFormat.addInputPath(job, new Path(inPath(otherArgs)));
        FileOutputFormat.setOutputPath(job, new Path(outPath(otherArgs)));
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }

    private static String inPath(String[] otherArgs){
        if (otherArgs.length >= 1) return otherArgs[0];
        return "input/";
    }

    private static String outPath(String[] otherArgs){
        if (otherArgs.length >= 2) return otherArgs[1];
        return "out/" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    }
}