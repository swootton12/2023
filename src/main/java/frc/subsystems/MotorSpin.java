package frc.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class MotorSpin {
   WPI_TalonSRX lmotora = new WPI_TalonSRX(0);
   WPI_TalonSRX rmotora = new WPI_TalonSRX(1);
   WPI_TalonSRX lmotorb = new WPI_TalonSRX(2);
   WPI_TalonSRX rmotorb = new WPI_TalonSRX(3);
   Joystick drivetrain = new Joystick(0);



public void teleopInit() {
double speed = drivetrain.getRawAxis(1);
double turn = drivetrain.getRawAxis(4);
double motorcontroll = (speed + turn);
double rmotorcontroll = (speed - turn);
lmotora.set(motorcontroll);
lmotorb.set(motorcontroll);
rmotora.set(rmotorcontroll);
rmotorb.set(rmotorcontroll);
}}
