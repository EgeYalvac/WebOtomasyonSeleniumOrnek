import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest{

    @Test
    public void setIcon(){

    }
    @Test
    @Order(1)
    public void setEmail(){
        login.setEmail("ahmet123@outlook.com");

    }
    @Test
    @Order(2)
    public void setPassword(){
        login.setPassword("ahmet123");


    }



}
