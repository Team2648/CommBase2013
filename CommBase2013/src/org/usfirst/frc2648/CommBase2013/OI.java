// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc2648.CommBase2013;
import org.usfirst.frc2648.CommBase2013.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick j1;
    public JoystickButton shiftSlow;
    public JoystickButton hangDown;
    public JoystickButton shoot;
    public JoystickButton metalFeeder;
    public JoystickButton hangUp;
    public JoystickButton shiftFast;
    public Joystick j2;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        j2 = new Joystick(2);
        
        shiftFast = new JoystickButton(j2, 1);
        shiftFast.whenPressed(new ShifterFast());
        hangUp = new JoystickButton(j2, 1);
        hangUp.whenPressed(new HangerUp());
        metalFeeder = new JoystickButton(j2, 2);
        metalFeeder.whenPressed(new SpinFeedwithSwitch());
        shoot = new JoystickButton(j2, 1);
        shoot.whileHeld(new GoShoot());
        hangDown = new JoystickButton(j2, 1);
        hangDown.whenPressed(new HangerDown());
        shiftSlow = new JoystickButton(j2, 1);
        shiftSlow.whenPressed(new ShifterSlow());
        j1 = new Joystick(1);
        
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("HangerUp", new HangerUp());
        SmartDashboard.putData("ArcadeDrive", new ArcadeDrive());
        SmartDashboard.putData("StopShoot", new StopShoot());
        SmartDashboard.putData("GoShoot", new GoShoot());
        SmartDashboard.putData("SpinFeed", new SpinFeed());
        SmartDashboard.putData("StopFeed", new StopFeed());
        SmartDashboard.putData("SpinVex", new SpinVex());
        SmartDashboard.putData("StopVex", new StopVex());
        SmartDashboard.putData("AutoGroup", new AutoGroup());
        SmartDashboard.putData("LaunchStart", new LaunchStart());
        SmartDashboard.putData("LaunchStop", new LaunchStop());
        SmartDashboard.putData("WaitOnSwitch", new WaitOnSwitch());
        SmartDashboard.putData("StepFeed", new StepFeed());
        SmartDashboard.putData("SpinFeedwithSwitch", new SpinFeedwithSwitch());
        SmartDashboard.putData("SetDrive", new SetDrive());
        SmartDashboard.putData("BackUp", new BackUp());
        SmartDashboard.putData("StopPickerUpper", new StopPickerUpper());
        SmartDashboard.putData("HangerDown", new HangerDown());
        SmartDashboard.putData("ShifterFast", new ShifterFast());
        SmartDashboard.putData("ShifterSlow", new ShifterSlow());
        SmartDashboard.putData("CompressorOn", new CompressorOn());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getj1() {
        return j1;
    }
    public Joystick getj2() {
        return j2;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}