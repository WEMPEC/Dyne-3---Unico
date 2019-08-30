import de.re.easymodbus.modbusclient.*;
import org.python.core.*;
import com.intelligt.modbus.jlibmodbus.Modbus;
import com.intelligt.modbus.jlibmodbus.master.ModbusMasterTCP;
import org.python.util.PythonInterpreter;  
public class Jpython {
	  public static void main(String[] args) {
    try(PythonInterpreter pyInterp = new PythonInterpreter()) {
      pyInterp.exec("print('Hello Python World!')");
      var =1;
      keyin = 2;
      ModbusClient modbusClient = new ModbusClient("10.40.40.28",502);
     
  
      while var==1:
          keyin = int(input("Enter 1 to enter speed command :"))
          time.sleep(0.5)
          if(keyin == 1):
              SpeedCommand = int(input("Enter Speed Command : "));
              SpeedCommand = SpeedCommand*10
              if(SpeedCommand>65536):
                  hex_temp = hex(SpeedCommand);
                  b = (SpeedCommand & 0x0000ffff);
                  a = (SpeedCommand & 0xffff0000) >>16;
              else:
                  a = 0
                  b = SpeedCommand;
              
              c = ModbusClient()
              c.host("10.40.40.28")
              c.port(502)
              time.sleep(0.001)
              # managing TCP sessions with call to c.open()/c.close()
              c.open()
              if c.write_multiple_registers(1028,[a,b]):
                  print("write ok");
              else:
                  print("write error");
                  time.sleep(0.1);
              c.close();	
              
          else {#print('\n' *38);
              c.open();
              regs = c.read_holding_registers(2, 4)
              if regs{
                  print(regs);}
              else {
                  print("read error");
                  c.close();}

    }
  }
}