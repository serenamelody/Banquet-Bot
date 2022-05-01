package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
    private final Talon rightFront = new Talon(0);
    private final Talon rightBack= new Talon(1);
    private final Talon leftFront = new Talon(2);
    private final Talon leftBack = new Talon(3);

    /** Creates a new Drivetrain subsystem. */
    public DriveTrain() {
        leftFront.setInverted(true);
        leftBack.setInverted(true);
    }

    /** Sets speeds for Drivetrain motors. */
    public void wheelSpeed(double leftSpeed, double rightSpeed) {
        rightFront.set(rightSpeed);
        leftFront.set(leftSpeed);
        rightBack.set(rightSpeed);
        leftBack.set(leftSpeed);
    }

    @Override
    public void periodic() {
    // This method will be called once per scheduler run
    }

    @Override
    public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
    }

}
