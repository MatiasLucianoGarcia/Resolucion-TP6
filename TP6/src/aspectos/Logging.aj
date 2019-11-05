package aspectos;

import org.openqa.selenium.WebDriver;
import controls.BaseControl;
import controls.Input;

public aspect Logging {
	Logger logger = new Logger();

	before(String name):
		call(void WebDriver.get(String))&& args(name){
			logger.log("- Se ingreso a la url:"+name+"." );
	}
	
	before(BaseControl control):
		call(void BaseControl.click())&& target(control){ 
			logger.log("- Se hizo click en un controlador del tipo: " + control.getClass().getName()) ;
			logger.log("  *ID:"+ control.getBy() +"." );
	}
	
	before(String text):
		call(void Input.Write(String))&& args(text){
			logger.log("- Se escribio en un Input el siguiente texto : " +text +".");
	}
	
	after(BaseControl control) returning(String cadena):
		call(String BaseControl.Text()) && target(control){
			logger.log("- Se obtuvo el texto de un Controlador de tipo :" + control.getClass().getName());
			logger.log("  *El texto obtenido del controlador es "+cadena+"." );
			logger.log("  *ID del Controlador:"+control.getBy()+".");
	}
	
	
}
