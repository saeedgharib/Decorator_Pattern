package FileDecorators;

import java.nio.charset.StandardCharsets;



    public class UTF8Decorator extends DataSourceDecorator {

        public UTF8Decorator(DataSource source) {
            super(source);
        }

        @Override
        public void writeData(String data) {
            super.writeData(new String(data.getBytes(), StandardCharsets.UTF_8));
        }

        @Override
        public String readData() {
            return new String(super.readData().getBytes(), StandardCharsets.UTF_8);
        }
    }

