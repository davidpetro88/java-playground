package ex1;

public class Test {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("use \"producer\" ou \"consumer\" como parametro");
        } else {
            ConectorJms conectorJms = new ConectorJms();
            String var2 = args[0];
            byte var3 = -1;
            switch(var2.hashCode()) {
                case -1003761774:
                    if (var2.equals("producer")) {
                        var3 = 0;
                    }
                    break;
                case -567770122:
                    if (var2.equals("consumer")) {
                        var3 = 1;
                    }
            }

            switch(var3) {
                case 0:
                    int max = parseMax(args);
                    conectorJms.producerMessage(max);
                    break;
                case 1:
                    conectorJms.consumeMessage();
            }

            conectorJms.close();
        }
    }

    private static int parseMax(String[] args) {
        return args.length >= 2 && args[1] != null ? Integer.parseInt(args[1]) : 1;
    }
}
