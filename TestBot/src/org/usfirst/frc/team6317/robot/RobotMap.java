package org.usfirst.frc.team6317.robot;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static SpeedController leftDrive = new Victor(0);
	public static SpeedController rightDrive = new Victor(1);
	public static SpeedController intakeMotor = new Victor(2);
	public static SpeedController kickerMotor = new Victor(3);
	public static SpeedController shooterMotor = new Victor(4);
	public static SpeedController winchMotor = new Victor(5);
}
