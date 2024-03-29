// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc2648.CommBase2013.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2648.CommBase2013.Robot;
import org.usfirst.frc2648.CommBase2013.RobotMap;
/**
 *  To see more about how commands work, and how all of these methods work with each other,
 * review the included document about Command Base, where most things are explained in the best
 * detail possible.
 */
public class  GoShoot extends Command {
    double speed;
    public GoShoot() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.shooter);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.shooter.run();
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
      return false;
    }
    // Called once after isFinished returns true
    protected void end() {
        Robot.shooter.stop();
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
