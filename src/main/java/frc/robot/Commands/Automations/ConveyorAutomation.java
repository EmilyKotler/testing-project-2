
package frc.robot.Commands.Automations;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystem.Conveyor.Conveyor;
import frc.robot.Subsystem.Conveyor.ConveyorConstans;

public class ConveyorAutomation extends Command {
  private static final Conveyor conveyor = Conveyor.getInstance();

  public ConveyorAutomation() {
    addRequirements(conveyor);
  }
 
  @Override
  public void initialize() {}

  @Override
  public void execute() {
    conveyor.setVoltage(ConveyorConstans.CONVEYOR_MOTOR_TRANSPORTING_VOLT );
    conveyor.setVoltage(ConveyorConstans.CONVEYOR_MOTOR_TRANSPORTING_TO_SHOOTER_VOLT );
  }

  @Override
  public void end(boolean interrupted) {
    conveyor.setVoltage(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
