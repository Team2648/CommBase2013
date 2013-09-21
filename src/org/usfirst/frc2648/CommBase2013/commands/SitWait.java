/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2648.CommBase2013.commands;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2648.CommBase2013.Robot;
/**
 *
 * @author bradbickford, sabinefontaine
 * 
 * I actually have Sabine to thank for this idea, bouncing my head off the table trying to
 * get timers to work in command groups, this is what actually works. This is completely independent
 * of RobotBuilder, which is why it is getting its own comments as compared to the other commands.
 */
public class SitWait extends Command {
    
    double time, startTime;
    
    /*
     * When declared it, takes in a time to wait.
     */
    public SitWait(double set)
    {
        time = set;
    }
    /*
     * Once initialized, it sets the start time to the time in seconds of the cRIO's FGPA timing
     * controller.
     */
    protected void initialize() {
        startTime = Timer.getFPGATimestamp();
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }
    
    /*
     * This is where the actual timer part comes in, it takes the startTime minus the current time,
     * does the absolute value and checks to see if that time is greater than or equal to the
     * original time entered. If it is, it returns true and the command stops, if not, the command
     * continutes to check to see if the correct amount of time has passed.
     */
    protected boolean isFinished() {
        if(Math.abs(startTime - Timer.getFPGATimestamp()) >= time)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // Called once after isFinished returns true
    protected void end() {
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    
}
