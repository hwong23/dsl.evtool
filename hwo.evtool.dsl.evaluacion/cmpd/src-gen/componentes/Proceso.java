package hwo.evtool.dsl.evaluacion; 

public class Proceso {
	String[] cmd_evaluarC1 = {"cmd_evaluarC1","2","3","Compilado1","IntConstant"};
	String[] cmd_evaluarC2 = {"cmd_evaluarC2","2.0","Comentario2", "StringConstant"};
	String[] cmd_evalC4 = {"cmd_evalC4","N","", "SiNoConstant"};

	public static void main(String[] args) {
		new Proceso().run();
	}
	
	protected void run() {
		System.out.println("command:" + cmd_evaluarC1[0] + " comentario:" + cmd_evaluarC1[1]);
		System.out.println("command:" + cmd_evaluarC2[0] + " comentario:" + cmd_evaluarC2[1]);
		System.out.println("command:" + cmd_evalC4[0] + " comentario:" + cmd_evalC4[1]);
	}
}
