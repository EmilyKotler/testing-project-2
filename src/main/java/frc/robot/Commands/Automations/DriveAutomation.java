
package frc.robot.Commands.Automations;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystem.DriveTrain.DriveTrain;
import frc.robot.Subsystem.DriveTrain.DriveTrainConstans;

public class DriveAutomation extends Command {
  private static final DriveTrain driveTrain = DriveTrain.getInstance();

  public DriveAutomation() {
    addRequirements(driveTrain);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    driveTrain.setVoltage(DriveTrainConstans.DRIVETRAIN_MOTOR_1_VOLT);
    driveTrain.setVoltage(DriveTrainConstans.DRIVETRAIN_MOTOR_2_VOLT );
    driveTrain.setVoltage(DriveTrainConstans.DRIVETRAIN_MOTOR_3_VOLT );
    driveTrain.setVoltage(DriveTrainConstans.DRIVETRAIN_MOTOR_4_VOLT );
  }

  @Override
  public void end(boolean interrupted) {
    driveTrain.setVoltage(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}

