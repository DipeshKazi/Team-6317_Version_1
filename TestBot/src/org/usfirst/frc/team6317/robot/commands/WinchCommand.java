package org.usfirst.frc.team6317.robot.commands;

import org.usfirst.frc.team6317.robot.OI;
import org.usfirst.frc.team6317.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class WinchCommand extends Command {

	public WinchCommand(){
		this.requires(Robot.WinchSystem);
	}
	
	protected void initialize(){
		
	}
	
	protected void execute(){
		if(OI.leftStick.getPOV() == 0){
			Robot.WinchSystem.reelingIn();
		}
		if(OI.leftStick.getPOV() == 180){
			Robot.WinchSystem.unreeling();
		}
	}
	
	@Override
	protected boolean isFinished() {
		Robot.WinchSystem.stopWinch();
		return false;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
	}
}
