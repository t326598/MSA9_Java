package application;


import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.DragEvent;

public class MainController {
	
    @FXML
    private Button button; 		//Main.fxml 파일에서 fx:id = "button" 요소 --> Button button 일치
    
    // 버튼 클릭 이벤트 메소드
    public void clickButton(ActionEvent event) throws IOException{
    	System.out.println(" 버튼 클릭!");

    	
    }
	
}
