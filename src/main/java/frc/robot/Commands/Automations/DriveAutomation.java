
package frc.robot.Commands.Automations;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystem.DriveTrain.DriveTrain;

public class DriveAutomation extends Command {
  private static final DriveTrain drive = DriveTrain.getInstance();

  private Supplier<Double> leftSupplier;
  private Supplier<Double> rightSupplier;

  public DriveAutomation(Supplier<Double> left , Supplier<Double> right) {
    addRequirements(drive);
    leftSupplier = left;
    rightSupplier = right;
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    drive.setVoltageLeft(leftSupplier.get());
    drive.setVoltageRight(rightSupplier.get());
  }

  @Override
  public void end(boolean interrupted) {
    drive.setVoltageLeft(0);
    drive.setVoltageRight(0);
}

  @Override
  public boolean isFinished() {
    return false;
  }
}

