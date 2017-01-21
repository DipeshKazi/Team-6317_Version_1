package org.usfirst.frc.team6317.robot.commands;

import org.usfirst.frc.team6317.robot.Robot;
import org.usfirst.frc.team6317.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.command.Command;

public class ShooterCommand extends Command{

	public ShooterCommand(){
		this.requires(Robot.Shooter);
	}
	
	protected void initialize(){
		
	}
	
	protected void execute(){
		boolean shooting = false;
		if(shooting){
			Shooter.stopShooter();
		}
		if(!shooting){
			Shooter.runShooter();
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
