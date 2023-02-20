package frc.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class MotorSpin {
   public static void main(String[] args) {
      Joystick joystick = new Joystick(0); // 0 is the default USB port for the joystick
      WPI_TalonSRX motor = new WPI_TalonSRX(0); // 0 is the CAN ID for the Talon motor controller

      while (true) {
         double joystickY = joystick.getY();
         motor.set(joystickY);
      }
   }
}