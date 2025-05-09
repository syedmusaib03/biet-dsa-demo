package strings;
// for short values stringBuffer is better as it takes less time
// for large values stringBuilder is better as it takes less time
public class stringBufferVSstringBuilder {


    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("BIET");

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            buffer.append(" college");
        }

        System.out.println(System.currentTimeMillis()-startTime+"ms");

        StringBuilder builder = new StringBuilder("BIET");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            builder.append(" college");
        }
        System.out.println( System.currentTimeMillis() - startTime+"ms");

    }
}
