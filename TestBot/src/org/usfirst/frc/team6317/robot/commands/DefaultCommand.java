package org.usfirst.frc.team6317.robot.commands;

import org.usfirst.frc.team6317.robot.OI;
import org.usfirst.frc.team6317.robot.Robot;
import org.usfirst.frc.team6317.robot.RobotMap;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class DefaultCommand extends Command {
	
	public DefaultCommand() {
		this.requires(Robot.DriveTrain);
	}
	
	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		double leftSpeed, rightSpeed;
		double leftZ = Math.abs(OI.leftStick.getZ());
		leftSpeed = OI.leftStick.getY() * leftZ;
		rightSpeed = OI.rightStick.getY() * leftZ;
		RobotMap.leftDrive.set(-leftSpeed);
		RobotMap.rightDrive.set(rightSpeed);
		Timer.delay(0.01);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.DriveTrain.stop();
	}

	@Override
	protected void interrupted() {
	}
		
}
