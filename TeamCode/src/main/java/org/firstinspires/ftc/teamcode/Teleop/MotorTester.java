
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

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();


        while (opModeIsActive()) {

            double motpow = gamepad1.left_trigger;
            Motor.setPower(motpow);
        }
        telemetry.update();
    }
}

