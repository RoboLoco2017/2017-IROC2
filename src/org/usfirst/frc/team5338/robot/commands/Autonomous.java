package org.usfirst.frc.team5338.robot.commands;

import org.usfirst.frc.team5338.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Autonomous extends CommandGroup {

	public Autonomous() {
		addSequential(new Move(3));
		addSequential(new TurnAround(180));
		addSequential(new Move(3));
	}
}
