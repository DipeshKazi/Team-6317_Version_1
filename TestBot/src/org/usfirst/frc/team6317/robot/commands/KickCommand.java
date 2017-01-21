package org.usfirst.frc.team6317.robot.commands;

import org.usfirst.frc.team6317.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class KickCommand extends Command{

	public KickCommand(){
		this.requires(Robot.Shooter);
	}
	
	protected void initialize(){
		
	}
	
	protected void execute(){
		Robot.Shooter.kick();
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
