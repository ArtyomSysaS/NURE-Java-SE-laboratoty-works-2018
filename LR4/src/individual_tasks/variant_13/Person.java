package individual_tasks.variant_13;

import java.io.Serializable;
import java.text.MessageFormat;

public class Person  implements Serializable {
    private String fio;
    private String phone;

    Person(String fio, String phone) {
        this.fio = fio;
        this.phone = phone;
    }

    String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Person'{'fio=''{0}'', phone=''{1}'''}'", fio, phone);
    }
}
