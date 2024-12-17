
package frc.robot.Subsystem.Intake;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.PortMap;

public class Intake extends SubsystemBase {
  private static Intake intake;

  private TalonFX motorR;
  private TalonFX motorL;


  public Intake() {
    motorR = new TalonFX(PortMap.Intake.INTAKE_MOTOR_RIGHT_ID);
    motorL = new TalonFX(PortMap.Intake.INTAKE_MOTOR_LEFT_ID);
  }
  
  public void setVoltage(double volt){
    motorR.setVoltage(volt);
    motorL.setVoltage(volt);
  }

  public static Intake getInstance(){
    if (intake == null){
      intake = new Intake();
    }

    return intake;
  }

  @Override
  public void periodic() {
  }
}
