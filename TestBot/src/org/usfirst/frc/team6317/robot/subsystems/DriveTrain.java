package org.usfirst.frc.team6317.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6317.robot.*;
import org.usfirst.frc.team6317.robot.commands.DefaultCommand;

public class DriveTrain extends Subsystem {
	
	public void initDefaultCommand(){
		this.setDefaultCommand(new DefaultCommand());
	}
	
	public void spin(){	//makes the robot spin clockwise
		RobotMap.leftDrive.set(-1);
		RobotMap.rightDrive.set(-1);
		Timer.delay(0.01);
	}

	public void stop(){	//makes the robot stop
		RobotMap.leftDrive.set(0);
		RobotMap.rightDrive.set(0);
	}
}
