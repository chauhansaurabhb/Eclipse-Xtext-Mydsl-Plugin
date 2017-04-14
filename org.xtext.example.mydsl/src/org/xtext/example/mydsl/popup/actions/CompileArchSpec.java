package org.xtext.example.mydsl.popup.actions;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;

import iotsuite.parser.Main; 

public class CompileArchSpec extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		String[] args = new String[3];
		args[0] = "compile-arch-spec";
		args[1] = "C:/IoTSuite-Eclipse-Plugin/Template/";
		
		// Call to Main method in ToolSuite
		try {
			 Main.main(args);
			 JFrame frame = new JFrame("Arch compilation message");

				JOptionPane.showMessageDialog(frame,
						"Compilation of arch.mydsl is successful",
						"Compilation Message", JOptionPane.INFORMATION_MESSAGE);
				//System.exit(0);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
