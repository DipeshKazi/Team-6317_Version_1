package org.usfirst.frc.team6317.robot.commands;

import org.usfirst.frc.team6317.robot.OI;
import org.usfirst.frc.team6317.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class IntakeCommand extends Command{
	
	public IntakeCommand() {
		this.requires(Robot.IntakeSystem);
	}
	
	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		if(OI.leftStick.getPOV() == 0){
			Robot.IntakeSystem.takingIn();
		}
		if(OI.leftStick.getPOV() == 180){
			Robot.IntakeSystem.pushingOut();
		}
		if(OI.leftStick.getPOV() == 90 || OI.leftStick.getPOV() == 270){
			Robot.IntakeSystem.stopIntake();
		}
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
	}
}
