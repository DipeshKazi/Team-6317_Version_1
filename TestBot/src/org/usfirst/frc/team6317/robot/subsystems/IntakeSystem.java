package org.usfirst.frc.team6317.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6317.robot.*;
import org.usfirst.frc.team6317.robot.commands.IntakeCommand;

public class IntakeSystem extends Subsystem{
	public void initDefaultCommand() {
		this.setDefaultCommand(new IntakeCommand());
	}
	
	public void takingIn(){ //makes the intake motor take in fuel
		RobotMap.intakeMotor.set(1);
		Timer.delay(0.01);
	}
	
	public void stopIntake(){ //makes the intake motor stop
		RobotMap.intakeMotor.set(0);
	}
	
	public void pushingOut(){ //makes the intake motor push fuel away
		RobotMap.intakeMotor.set(-1);
	}
}
