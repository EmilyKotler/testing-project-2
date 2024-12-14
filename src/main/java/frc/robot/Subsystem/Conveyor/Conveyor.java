
package frc.robot.Subsystem.Conveyor;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.PortMap;

public class Conveyor extends SubsystemBase {
  private static Conveyor conveyor;
 
  private TalonFX motor;
  private DigitalInput IR1;
  private DigitalInput IR2;
  private DigitalInput IR3;
 
  public Conveyor() {
     motor = new TalonFX(PortMap.Conveyor.CONVEYOR_MOTOR_ID);
     IR1 = new DigitalInput(PortMap.Conveyor.CONVEYOR_IR_1_DIO);
     IR2 = new DigitalInput(PortMap.Conveyor.CONVEYOR_IR_2_DIO);
     IR3 = new DigitalInput(PortMap.Conveyor.CONVEYOR_IR_3_DIO);
  }

  public void setVoltage(double volt){
    motor.setVoltage(volt);
  }

  public boolean getIR1() {
    return IR1.get();
  }

  public boolean getIR2() {
    return IR2.get();
  }

  public boolean getIR3() {
    return IR3.get();
  }
 

  public static Conveyor getInstance(){
    if (conveyor == null){
      conveyor = new Conveyor();
    }

    return conveyor;
  }

  @Override
  public void periodic() {
  }
}
