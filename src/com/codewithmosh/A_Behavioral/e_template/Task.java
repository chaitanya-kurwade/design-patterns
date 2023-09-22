package com.codewithmosh.A_Behavioral.e_template;

public abstract class Task {
	private AuditTrail auditTrail;
	
	protected Task(){
		auditTrail =  new AuditTrail();
	}
	
	protected Task(AuditTrail auditTrail) {
		this.auditTrail=auditTrail;
	}

	protected void execute() {
		auditTrail.record();
		doExecute();
	}
	
	protected abstract void doExecute();
}
