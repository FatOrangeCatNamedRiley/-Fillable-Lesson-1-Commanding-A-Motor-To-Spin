// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MotorSubsystem extends SubsystemBase {
  /** Creates a new MotorSubsystem. */

  /*
   * TO DO:
   * Create a new motor using the SparkMax() constructor
   * The SparkMax object constructor takes 2 varriables as input
   * 
   * SparkMax(Constants.MotorID, MotorType.kBrushless)
   *                              ^Don't replace^
   */
  private SparkMax motor1 = null;

  public MotorSubsystem() {}

  /*
   * TO DO:
   * The .set(double n) method take a double input from -1 to 1
   * -1 being -100% speed, and 1 being 100% speed
   * Use that .set() method to set the speed of the motor to 50%
   */
  public void runMotor(){

  }

  /*
   * TO DO:
   * use the .set() method to stop the motor
   */
  public void stop(){

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run (not needed for this lesson)
  }
}
