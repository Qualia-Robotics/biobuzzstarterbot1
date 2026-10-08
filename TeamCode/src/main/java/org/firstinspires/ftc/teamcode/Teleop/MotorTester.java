
package org.firstinspires.ftc.teamcode.Teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp (name ="MotorTester",group="1(Main OpModes")
public class MotorTester extends LinearOpMode {

    private DcMotor Motor;


    @Override
    public void runOpMode() {
        Motor = hardwareMap.get(DcMotor.class, "Motor");

        Motor.setDirection(DcMotor.Direction.REVERSE);
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();


        while (opModeIsActive()) {

            double motorPower = gamepad1.left_trigger;

            Motor.setPower(motorPower);
            telemetry.addData("Trigger", motorPower);
            telemetry.addData("Motor Power", Motor.getPower());
            telemetry.update();
        }
        telemetry.update();
    }
}

