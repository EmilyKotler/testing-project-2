
package frc.robot.Subsystem.Shooter;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.PortMap;

public class Shooter extends SubsystemBase {
  private static Shooter shooter;

  private TalonFX motorR;
  private TalonFX motorL;

   public Shooter() {
    motorR = new TalonFX(PortMap.Shooter.SHOOTER_MOTOR_RIGHT_ID);
    motorL = new TalonFX(PortMap.Shooter.SHOOTER_MOTOR_LEFT_ID);
   }

   public void setVoltage(double volt){
    motorR.setVoltage(volt);
    motorL.setVoltage(volt);
  }

   public static Shooter getInstance(){
    if (shooter == null){
      shooter = new Shooter();
    }

    return shooter;
  }

  @Override
  public void periodic() {
  }
}
