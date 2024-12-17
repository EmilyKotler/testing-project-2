
package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandPS5Controller;
import frc.robot.Commands.Automations.ShootingAutomation;

public class RobotContainer {

  private CommandPS5Controller controller = new CommandPS5Controller(0);

  public RobotContainer() {
    configureBindings();
    //Demo
  }

  private void configureBindings() {
    controller.L1().whileTrue(new ShootingAutomation());
    }

  public Command getAutonomousCommand() {
    return null;
  }
}
