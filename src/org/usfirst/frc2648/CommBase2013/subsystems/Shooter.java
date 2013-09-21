// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc2648.CommBase2013.subsystems;
import org.usfirst.frc2648.CommBase2013.RobotMap;
import org.usfirst.frc2648.CommBase2013.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class Shooter extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController shoot1 = RobotMap.shooterShoot1;
    SpeedController shoot2 = RobotMap.shooterShoot2;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public double shootSpeed = 1;
    /*
     * This class represents both of the shooter wheels, as always, we only use the SpeedControllers
     * declared here, we never try to grab the ones from RobotMap
     */
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new StopShoot());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        /*
         * The Default Command here keeps the shooters at zero, unless otherwise instructed.
         */
    }
    /*
     * Makes both of the shooter wheels run at the same speed. For anyone who has not already driven
     * there is a special slider bar on the driver station that normally controlls the shooter wheel
     * speed, we see this later in the GoShoot Command.
     */
    public void run()
    {
        shoot1.set(shootSpeed);
        shoot2.set(shootSpeed);
    }
    /*
     * Stops both the shooter wheels.
     */
    public void stop()
    {
        shoot1.set(0);
        shoot2.set(0);
    }
    public void zone1() {
        shootSpeed = 1;
    }
    public void zone2(double speed) {
        shootSpeed = speed;
    }
}
