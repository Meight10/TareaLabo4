package com.uca.capas.domain;

import javax.validation.constraints.AssertFalse;

public class Robot {
	
	@AssertFalse(message = "UPS no puedes inrgesar un producto porque eres un robot, por favor dar click en regresar")
	private Boolean soyRobot;

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}

	

}
