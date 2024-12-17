
package frc.robot.Commands.Automations;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystem.Intake.Intake;
import frc.robot.Subsystem.Intake.IntakeConstans;

public class IntakeAutomation extends Command {
  private static final Intake intake = Intake.getInstance();
 
  public IntakeAutomation() {
    addRequirements(intake);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    intake.setVoltage(IntakeConstans.INTAKE_MOTOR_RIGHT_INTAKING_VOLT );
    intake.setVoltage(IntakeConstans.INTAKE_MOTOR_LEFT_INTAKING_VOLT );
  }

  @Override
  public void end(boolean interrupted) {
  intake.setVoltage(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
