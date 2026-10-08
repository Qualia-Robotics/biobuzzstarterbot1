package org.firstinspires.ftc.teamcode.Teleop;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.robotcore.external.Telemetry;
@TeleOp(name="TeleopStrafe", group="1) Main OpModes")
public class TeleopStrafe extends LinearOpMode {

    public DcMotor fl, bl, fr, br;
    public double forward, turn, strafe1;



    @Override
    public void runOpMode() {


        fl = hardwareMap.get(DcMotor.class, "leftFront");
        bl = hardwareMap.get(DcMotor.class, "leftBack");
        fr = hardwareMap.get(DcMotor.class, "rightFront");
        br = hardwareMap.get(DcMotor.class, "rightBack");
        fr.setDirection(DcMotor.Direction.REVERSE);
        br.setDirection(DcMotor.Direction.REVERSE);

        telemetry.setDisplayFormat(Telemetry.DisplayFormat.HTML);

        // INIT LOOP -------------------------------------------------------------------------------

        waitForStart();

        waitForStart();

        while (opModeIsActive()) {
            forward = -gamepad1.left_stick_y;
            turn = -gamepad1.right_stick_x;
            strafe1 = gamepad1.left_stick_x;
            fl.setPower((-forward) + (turn * .8) - strafe1);
            bl.setPower((-forward) + (turn * .8) + strafe1);
            fr.setPower((-forward) - (turn * .8) + strafe1);
            br.setPower((-forward) - (turn * .8) - strafe1);
        }}}