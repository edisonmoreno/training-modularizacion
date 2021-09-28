import com.edisonmoreno.model.Customer;
import com.edisonmoreno.usecase.CustomerUseCase;
import com.edisonmoreno.util.IdentificationCode;
import com.edisonmoreno.util.Image;

import java.awt.*;

public class ModuleApp {
    public static void main(String[] args) throws Exception {
        CustomerUseCase customerUseCase = new CustomerUseCase();

        System.out.println(new IdentificationCode().Generate("71262401"));

        Customer customerFirst = customerUseCase.Save(Customer.builder()
                .name("Edison")
                .lastname("Moreno")
                .build());

        Customer customerSecond = customerUseCase.Save(Customer.builder()
                .name("Pedro")
                .lastname("Nell")
                .build());
        try {
            if (!Desktop.isDesktopSupported()) {
                throw new Exception("Platform not supported");
            }
            Desktop.getDesktop().open(new Image().Generate(customerFirst));
            Desktop.getDesktop().open(new Image().Generate(customerSecond));
        } catch (Exception e) {
            throw new Exception("Error al abrir el archivo");
        }
    }
}
