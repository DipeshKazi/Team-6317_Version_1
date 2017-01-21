package org.usfirst.frc.team6317.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6317.robot.*;

public class Shooter extends Subsystem {

	public double kickTime = 0.25;
	public void initDefaultCommand(){
		
	}
	
	public void kick(){
		RobotMap.kickerMotor.set(1);
		Timer.delay(kickTime);
		RobotMap.kickerMotor.set(0);
	}
	
	public static void runShooter(){
		RobotMap.shooterMotor.set(1);
	}
	
	public static void stopShooter(){
		RobotMap.shooterMotor.set(0);
	}
}
