// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class RobotRun extends SubsystemBase {
  /* 
  creates this new motor for us to work with
  is private because it is used in this one place alone
  just whenever you make new subsystem (needs citation)
  */

  private static CANSparkMax CoolMotor = new CANSparkMax(Constants.robotPort,MotorType.kBrushless);
  
  /** Creates a new RobotRun. */
  public RobotRun() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  /*
  function that actualy makes a robot go
  the fact that it is void makes sure nothing gets returned
  we just want to set the speed on previously created motor
  */
  public void goSpeed(double speed)
  {
    /*
    the second thing in set reference is for the type of cycle
    just go with it, unsure why
    PID is just used whenever working with making motors move
    */
    CoolMotor.getPIDController().setReference(speed, ControlType.kDutyCycle);
  }
}
