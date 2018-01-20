package cloud.util;
import java.util.UUID;
import cloud.VirtualMachine;

public class CloudUtil 
{
    public CloudUtil()
    {
        VirtualMachine vm1 = new VirtualMachine();
    }
    
    /* 1. Escribir el código del método estático printNICInfo para imprimir las 
    variables del objeto NetworkCard como argumento. */
    static void printNICInfo()
    {
        
    }
    
    /* 2. Escribir el código del método estático printVMInfo para imprimir las 
    variables del objeto VirtualMachine como argumento. */
    static void printVMInfo()
    {
        
    }
    
    public String getUUID(String param) 
    {
        UUID id = UUID.randomUUID();
        String idString = id.toString();
        return idString;
    }
    
}
