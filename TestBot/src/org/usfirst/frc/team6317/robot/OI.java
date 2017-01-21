package org.usfirst.frc.team6317.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team6317.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick leftStick = new Joystick(0);
	public static Joystick rightStick = new Joystick(1);
	Button leftTrigger = new JoystickButton(leftStick, 1);
	Button rightTrigger = new JoystickButton(rightStick, 1);
	
	public OI(){
		leftTrigger.whenPressed(new KickCommand());
		rightTrigger.whenPressed(new ShooterCommand());
	}
}

//Testing