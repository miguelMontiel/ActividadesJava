import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class Controlador
{
    String saludo()
    {
        return "Spring 2";
    }
}