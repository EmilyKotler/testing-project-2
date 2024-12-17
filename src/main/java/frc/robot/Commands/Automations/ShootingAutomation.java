
package frc.robot.Commands.Automations;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystem.Shooter.Shooter;
import frc.robot.Subsystem.Shooter.ShooterConstans;
 
public class ShootingAutomation extends Command {
  private static final Shooter shooter = Shooter.getInstance();

  public ShootingAutomation() {
    addRequirements(shooter);
  }

  @Override
  public void initialize() {
    //
  }

  @Override
  public void execute() {
    shooter.setVoltage(ShooterConstans.SHOOTER_MOTOR_RIGHT_SHOOTING_VOLT );
    shooter.setVoltage(ShooterConstans.SHOOTER_MOTOR_LEFT_SHOOTING_VOLT );
    //
  }

  @Override
  public void end(boolean interrupted) {
    shooter.setVoltage(0);
    //
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
