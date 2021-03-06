// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1716.testcode.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1716.testcode.Robot;

/**
 *
 */
public class CanvasCommand extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
	
	private boolean done = false;
	private int canvasMotorDirection;
	private int ticks = 0;
	
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public CanvasCommand() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.lowGoal);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	canvasMotorDirection = 0;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(ticks < 100)
    	{
    		if(canvasMotorDirection == 0)
    		{
    			Robot.lowGoal.runCanvas(1);
    		}
    		else
    		{
    			Robot.lowGoal.runCanvas(-1);
    		}
    	}
    	else
    	{
    		if(canvasMotorDirection == 0)
    		{
    			canvasMotorDirection = 1;
    		}
    		else
    		{
    			canvasMotorDirection = 0;
    		}
    		done = true;
    	}
    	ticks++;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return done;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.lowGoal.runCanvas(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
