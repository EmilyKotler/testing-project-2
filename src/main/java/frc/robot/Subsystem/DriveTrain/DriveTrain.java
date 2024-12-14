

package frc.robot.Subsystem.DriveTrain;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.PortMap;

public class DriveTrain extends SubsystemBase {
  private static DriveTrain driveTrain;

  private TalonFX motor1;
  private TalonFX motor2;
  private TalonFX motor3;
  private TalonFX motor4;

  public DriveTrain() {
    motor1 = new TalonFX(PortMap.DriveTrain.DRIVETRAIN_MOTOR_1_ID);
    motor2 = new TalonFX(PortMap.DriveTrain.DRIVETRAIN_MOTOR_2_ID);
    motor3 = new TalonFX(PortMap.DriveTrain.DRIVETRAIN_MOTOR_3_ID);
    motor4 = new TalonFX(PortMap.DriveTrain.DRIVETRAIN_MOTOR_4_ID);
  }

  public void setVoltage(double volt){
    motor1.setVoltage(volt);
    motor2.setVoltage(volt);
    motor3.setVoltage(volt);
    motor4.setVoltage(volt);
  }

  public static DriveTrain getInstance(){
    if (driveTrain == null){
      driveTrain = new DriveTrain();
    }

    return driveTrain;
  }


  @Override
  public void periodic() {
  }
}
