
package frc.robot.Commands.Automations;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystem.Conveyor.Conveyor;
import frc.robot.Subsystem.Conveyor.ConveyorConstans;
import frc.robot.Subsystem.Intake.Intake;
import frc.robot.Subsystem.Intake.IntakeConstans;


public class EmissionAutomation extends Command {
  private static final Conveyor conveyor = Conveyor.getInstance();
  private static final Intake intake = Intake.getInstance();


  public EmissionAutomation() {
    addRequirements(conveyor ,intake);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    conveyor.setVoltage(ConveyorConstans.CONVEYOR_MOTOR_EMISSION_VOLT );
    intake.setVoltage(IntakeConstans.INTAKE_MOTOR_RIGHT_EMISSION_VOLT );
    intake.setVoltage(IntakeConstans.INTAKE_MOTOR_LEFT_EMISSION_VOLT );
  }

  @Override
  public void end(boolean interrupted) {
    conveyor.setVoltage(0);
    conveyor.setVoltage(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
