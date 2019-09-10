import de.re.easymodbus.modbusclient.*;
import org.python.core.*;
import com.intelligt.modbus.jlibmodbus.Modbus;
import com.intelligt.modbus.jlibmodbus.master.ModbusMasterTCP;
import org.python.util.PythonInterpreter;

public class Jpython {

  private static int SpeedCommand;
  private static int check;
  private static int a;
  private static int b;
  private int c;

  public Jpython(int input, int checkWrite) {
    check = checkWrite;
    SpeedCommand = input;

    try (PythonInterpreter pyInterp = new PythonInterpreter()) {
      pyInterp.exec("print('Hello Python World!')");
      int var = 1;
      int keyin = 2;
      ModbusClient modbusClient = new ModbusClient("10.40.40.28", 502);
      modbusClient.Connect();

      while (var == 1) {
        keyin = check;
        if (keyin != 1) {
          modbusClient.wait();
        }
      }

      if (keyin == 1) {
        SpeedCommand = SpeedCommand * 10;
        
        if (SpeedCommand > 65536) {
          String hex_temp = Integer.toHexString(SpeedCommand);
          b = (SpeedCommand & 0x0000ffff);
          a = (SpeedCommand & 0xffff0000) >> 16;
        } else {
          a = 0;
          b = SpeedCommand;
        }

        int[] abArray = {a, b};
        // managing TCP sessions with call to c.open()/c.close()
        modbusClient.WriteMultipleRegisters(1028, abArray);
        if (abArray == modbusClient.ReadHoldingRegisters(1028, 2)) {
          System.out.print("write ok");

        } else {
          System.out.print("write error");
          int[] regs = modbusClient.ReadHoldingRegisters(2, 4);
          System.out.print("regs" + regs.toString());
        }

      } //end if condition.
    }
  }
}
