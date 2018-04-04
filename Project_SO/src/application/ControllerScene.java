package application;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBasicCloseTransition;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;
import javafx.util.Duration;

public class ControllerScene implements Initializable {
	//FXML Attributes
	//Panes
	@FXML AnchorPane Pane1;
	@FXML AnchorPane Pane2;
	@FXML AnchorPane PaneUp;
	@FXML Button bt1;
	//Menu TextField
	@FXML TextField tf1;
	@FXML TextField tf2;
	@FXML TextField tf3;
	@FXML TextField tf4;
	@FXML TextField tf5;
	@FXML TextField tf6;
	//Menu Label
	@FXML Label lb1;
	@FXML Label lb2;
	@FXML Label lb3;
	@FXML Label lb4;
	@FXML Label lb5;
	//ImageView
	@FXML ImageView I0;
	@FXML ImageView I1;
	@FXML ImageView I2;
	@FXML ImageView I3;
	@FXML ImageView I4;
	@FXML ImageView I5;
	@FXML ImageView I6;
	@FXML ImageView I7;
	@FXML ImageView I8;
	//Table Labels
	@FXML Separator sep;
	@FXML Label lbTop1;
	@FXML Label lbTop2;
	@FXML Label lbTop3;
	@FXML Label lbTop4;
	@FXML Label lbTop5;
	@FXML Label lbTop6;
	@FXML Label lbTop7;
	@FXML Label lbTop8;
	@FXML Label lbTop9;
	@FXML Label lbTop10;
	@FXML Label lbTop11;
	@FXML Label lbTop12;
	@FXML Label h11;
	@FXML Label h12;
	@FXML Label h13;
	@FXML Label h21;
	@FXML Label h22;
	@FXML Label h23;
	@FXML Label h31;
	@FXML Label h32;
	@FXML Label h33;
	@FXML Label h41;
	@FXML Label h42;
	@FXML Label h43;
	@FXML Label h51;
	@FXML Label h52;
	@FXML Label h53;
	@FXML Label h61;
	@FXML Label h62;
	@FXML Label h63;
	@FXML Label h71;
	@FXML Label h72;
	@FXML Label h73;
	@FXML Label h81;
	@FXML Label h82;
	@FXML Label h83;
	@FXML Label h91;
	@FXML Label h92;
	@FXML Label h93;
	//Time Labels
	@FXML Label th1;
	@FXML Label th2;
	@FXML Label th3;
	@FXML Label th4;
	@FXML Label th5;
	@FXML Label th6;
	@FXML Label th7;
	@FXML Label th8;
	@FXML Label th9;
	//MenuBar
	@FXML JFXHamburger hamburger1;
	@FXML JFXDrawer drawer1;
	@FXML JFXHamburger hamburger2;
	@FXML JFXDrawer drawer2;
	@FXML JFXHamburger hamburger3;
	@FXML JFXDrawer drawer3;
	@FXML JFXHamburger hamburger4;
	@FXML JFXDrawer drawer4;
	@FXML JFXHamburger hamburger5;
	@FXML JFXDrawer drawer5;
	@FXML JFXHamburger hamburger6;
	@FXML JFXDrawer drawer6;
	//Tela
	@FXML ImageView Tela;
	
	//Local Attributes
	private ImageView [] I;
	private Label [] TL;
	private Hospede [] H;
	private int qntHospedes, qntCanais;
	private int ia1,ia2,id1,id2;
	private AudioClip clip1;
	private AudioClip clip2;
	
	//Initialize Method
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		visibleOnTable(false);
		Pane1.setVisible(true);
		Pane2.setVisible(false);
		Pane1.setCursor(Cursor.DISAPPEAR);
		Pane2.setCursor(Cursor.DISAPPEAR);
		tf1.setStyle("-fx-display-caret: false;");
		tf2.setStyle("-fx-display-caret: false;");
		tf3.setStyle("-fx-display-caret: false;");
		tf4.setStyle("-fx-display-caret: false;");
		tf5.setStyle("-fx-display-caret: false;");
		tf6.setStyle("-fx-display-caret: false;");
        
		//Hamburgers
        HamburgerBasicCloseTransition transition1 = new HamburgerBasicCloseTransition(hamburger1);
        transition1.setRate(-1);
        HamburgerBasicCloseTransition transition2 = new HamburgerBasicCloseTransition(hamburger2);
        transition2.setRate(-1);
        HamburgerBasicCloseTransition transition3 = new HamburgerBasicCloseTransition(hamburger3);
        transition3.setRate(-1);
        HamburgerBasicCloseTransition transition4 = new HamburgerBasicCloseTransition(hamburger4);
        transition4.setRate(-1);
        HamburgerBasicCloseTransition transition5 = new HamburgerBasicCloseTransition(hamburger5);
        transition5.setRate(-1);
        HamburgerBasicCloseTransition transition6 = new HamburgerBasicCloseTransition(hamburger6);
        transition6.setRate(-1);
        
        //Hamburgers Panes
		try {
			AnchorPane menuAP1 = FXMLLoader.load(getClass().getResource("scene1.fxml"));
			drawer1.setSidePane(menuAP1);
            AnchorPane menuAP2 = FXMLLoader.load(getClass().getResource("scene2.fxml"));
            drawer2.setSidePane(menuAP2);
            AnchorPane menuAP3 = FXMLLoader.load(getClass().getResource("scene3.fxml"));
            drawer3.setSidePane(menuAP3);
            AnchorPane menuAP4 = FXMLLoader.load(getClass().getResource("scene4.fxml"));
            drawer4.setSidePane(menuAP4);
            AnchorPane menuAP5 = FXMLLoader.load(getClass().getResource("scene5.fxml"));
            drawer5.setSidePane(menuAP5);
            AnchorPane menuAP6 = FXMLLoader.load(getClass().getResource("scene6.fxml"));
            drawer6.setSidePane(menuAP6);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		//Menu 01 - Avatares
        hamburger1.addEventHandler(MouseEvent.MOUSE_PRESSED,(e)->{
            
            if(drawer1.isShown()){
                transition1.setRate(transition1.getRate()*-1);
                transition1.play();
                drawer1.close();
            }else {
            		if(drawer2.isShown()) {
            			transition2.setRate(transition2.getRate()*-1);
            			transition2.play();
            			drawer2.close();
            		}
            		if(drawer3.isShown()) {
            			transition3.setRate(transition3.getRate()*-1);
            			transition3.play();
            			drawer3.close();
            		}
        			transition1.setRate(transition1.getRate()*-1);
        			transition1.play();
        			drawer1.open();
            }
            
        });
        
        //Menu 02 - Vestes
        hamburger2.addEventHandler(MouseEvent.MOUSE_PRESSED,(e)->{
            if(drawer2.isShown()){
                transition2.setRate(transition2.getRate()*-1);
                transition2.play();
                drawer2.close();
            }else {
	        		if(drawer1.isShown()) {
	        			transition1.setRate(transition1.getRate()*-1);
	        			transition1.play();
	        			drawer1.close();
	        		}
	        		if(drawer3.isShown()) {
	        			transition3.setRate(transition3.getRate()*-1);
	        			transition3.play();
	        			drawer3.close();
	        		}
    	            transition2.setRate(transition2.getRate()*-1);
    	            transition2.play();
    				drawer2.open();
            }
            
        });
        
        //Menu 03 - Canais
        hamburger3.addEventHandler(MouseEvent.MOUSE_PRESSED,(e)->{
            if(drawer3.isShown()){
                transition3.setRate(transition3.getRate()*-1);
                transition3.play();
                drawer3.close();
            }else {
	        		if(drawer1.isShown()) {
	        			transition1.setRate(transition1.getRate()*-1);
	        			transition1.play();
	        			drawer1.close();
	        		}
	        		if(drawer2.isShown()) {
	        			transition2.setRate(transition2.getRate()*-1);
	        			transition2.play();
	        			drawer2.close();
	        		}
	        		transition3.setRate(transition3.getRate()*-1);
    	            transition3.play();
    				drawer3.open();
            }
            
        });
        
        //Menu 04 - Tela Inicial (informacoes)
        hamburger4.addEventHandler(MouseEvent.MOUSE_PRESSED,(e)->{

            if(drawer4.isShown()){
        			transition4.setRate(transition4.getRate()*-1);
        			transition4.play();
            		drawer4.close();
            }else {
	        		if(drawer5.isShown()) {
	        			transition5.setRate(transition5.getRate()*-1);
	        			transition5.play();
	        			drawer5.close();
	        		}
	        		transition4.setRate(transition4.getRate()*-1);
	        		transition4.play();
            		drawer4.open();
            }
            
        });
        
        //Menu 05 - Tela Inicial (Problema da TV)
        hamburger5.addEventHandler(MouseEvent.MOUSE_PRESSED,(e)->{
	        if(drawer5.isShown()){
	        		transition5.setRate(transition5.getRate()*-1);
	        		transition5.play();
	        		drawer5.close();
	        }else {
	        		if(drawer4.isShown()) {
	        			transition4.setRate(transition4.getRate()*-1);
	        			transition4.play();
	        			drawer4.close();
	        		}
        			transition5.setRate(transition5.getRate()*-1);
        			transition5.play();
	        		drawer5.open();
	        }
        
        });
        
        //Menu 06 - Hospedes Info
        hamburger6.addEventHandler(MouseEvent.MOUSE_PRESSED,(e)->{
        		if (PaneUp.getOpacity()==1.0 || PaneUp.getOpacity()==0.0) {
	        		transition6.setRate(transition6.getRate()*-1);
	        		transition6.play();
	            if(drawer6.isShown()){
	            		drawer6.close();
	            		visibleOnTable(false);
	            		transition6.setOnFinished(new EventHandler<ActionEvent>() {
	            			@Override
	            			public void handle(ActionEvent event) {
	            			    Platform.runLater(new Runnable() {
	            			        @Override
	            			        public void run() {
	            			        		//visibleOnTable(false);
	            			        }
	            			    });
	            			}
	            		});
	            }else {
	            		drawer6.open();
	            		transition6.setOnFinished(new EventHandler<ActionEvent>() {
	            			@Override
	            			public void handle(ActionEvent event) {
	            			    Platform.runLater(new Runnable() {
	            			        @Override
	            			        public void run() {
	            			        		visibleOnTable(true);
	            			        }
	            			    });
	            			}
	            		});
	            }
        		}
        });
        
	    //Clips
		clip1 = new AudioClip("file:resources/songs/menu.mp3");
		clip2 = new AudioClip("file:resources/songs/animation.wav");
		clip1.setVolume(0.5);
		clip2.setVolume(0.3);
		clip2.setCycleCount(100);
	    Platform.runLater(new Runnable() {
	        @Override
	        public void run() {
	        		clip1.play();
	        }
	    });
	}
	
	//Setup Methods
	public void setHospedesProps() {
		fillImageViewArray();
		fillTimeLabelArray();
		
		int i;
		int canalH;
		int taH,tdH;
		Random rd = new Random();
		H = new Hospede[qntHospedes];

		for(i=0; i<qntHospedes; i++) {
			canalH = (rd.nextInt(qntCanais)+1);
			if(ia1==ia2) {
				taH = ia1;
			}else {
				taH = rd.nextInt(Math.abs(ia2-ia1))+getMin(ia1,ia2);
			}
			if(id1==id2) {
				tdH = id1;
			}else {
				tdH = rd.nextInt(Math.abs(id2-id1))+getMin(id1,id2);
			}
			
			H[i] = new Hospede("hospede_"+i, i, I[i], Tela, TL[i], canalH, taH, tdH);
			H[i].start();
		}
		fillTable();
	}

	//Action Buttons Methods
	public void setDefaultConfig() {
		tf1.setText("9");
		tf2.setText("9");
		tf3.setText("10");
		tf4.setText("30");
		tf5.setText("10");
		tf6.setText("30");
	}
	public void startUp() {
		if(tf1.getLength()!=0 && tf2.getLength()!=0 && tf3.getLength()!=0 && tf4.getLength()!=0 && tf5.getLength()!=0 && tf6.getLength()!=0
			&& Integer.parseInt(tf1.getText())<=9 && Integer.parseInt(tf1.getText())>=1 && Integer.parseInt(tf2.getText())<=9 
			&& Integer.parseInt(tf2.getText())>=1 && Integer.parseInt(tf3.getText())>=01 && Integer.parseInt(tf4.getText())<=120 
			&& Integer.parseInt(tf5.getText())>=01 && Integer.parseInt(tf6.getText())<=120) {
			
			bt1.setDisable(true);
			makeFadeTransition();
			qntHospedes = Integer.parseInt(tf1.getText());
			qntCanais = Integer.parseInt(tf2.getText());
			ia1 = Integer.parseInt(tf3.getText());
			ia2 = Integer.parseInt(tf4.getText());
			id1 = Integer.parseInt(tf5.getText());
			id2 = Integer.parseInt(tf6.getText());
			bt1.setDisable(true);
			tf1.setDisable(true);
			tf2.setDisable(true);
			tf3.setDisable(true);
			tf4.setDisable(true);
			tf5.setDisable(true);
			tf6.setDisable(true);
			lb1.setDisable(true);
			lb2.setDisable(true);
			lb3.setDisable(true);
			lb4.setDisable(true);
		}

	}
	private void makeFadeTransition() {
		FadeTransition fadeTransition = new FadeTransition();
		fadeTransition.setDuration(Duration.millis(1000));
		fadeTransition.setNode(Pane1);
		fadeTransition.setFromValue(1);
		fadeTransition.setToValue(0);
		fadeTransition.setOnFinished(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			    Platform.runLater(new Runnable() {
			        @Override
			        public void run() {
			        		clip1.stop();
						clip2.play();
			        }
			    });
				Pane1.setVisible(false);
				Pane2.setVisible(true);
				Pane2.setOpacity(0);
				FadeTransition fadeTransition2 = new FadeTransition(); 
				fadeTransition2.setDuration(Duration.millis(1000));
				fadeTransition2.setNode(Pane2);
				fadeTransition2.setFromValue(0);
				fadeTransition2.setToValue(1);
				fadeTransition2.setOnFinished(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
					    Platform.runLater(new Runnable() {
					        @Override
					        public void run() {
					        		setHospedesProps();
					        }
					    });
					}
				});
				fadeTransition2.play();
			}
		});
		fadeTransition.play();
	}
	public void visibleOnTable(Boolean b) {
	    Platform.runLater(new Runnable() {
	        @Override
	        public void run() {
		    		FadeTransition ft = new FadeTransition();
		    		if(b) {
		    			ft.setDuration(Duration.millis(2000));
		    			ft.setFromValue(0);
		    			ft.setToValue(1);
		    			
		    		}else {
		    			ft.setDuration(Duration.millis(100));
		    			ft.setFromValue(1);
		    			ft.setToValue(0);
		    		}
		    		ft.setNode(PaneUp);
		    		ft.play();
	        }
	    });

		
	}
	
	//Others Methods
	public int getMin(int n1, int n2) {
		if(n1<n2) {
			return n1;
		}else {
			return n2;
		}
	}
	
	//Fill Methods
	public void fillImageViewArray() {
		I = new ImageView[qntHospedes];
		switch(qntHospedes) {
			case 1:
				I[0] = I0;
				break;
			case 2:
				I[0] = I0;
				I[1] = I1;
				break;
			case 3:
				I[0] = I0;
				I[1] = I1;
				I[2] = I2;
				break;
			case 4:
				I[0] = I0;
				I[1] = I1;
				I[2] = I2;
				I[3] = I3;
				break;
			case 5:
				I[0] = I0;
				I[1] = I1;
				I[2] = I2;
				I[3] = I3;
				I[4] = I4;
				break;
			case 6:
				I[0] = I0;
				I[1] = I1;
				I[2] = I2;
				I[3] = I3;
				I[4] = I4;
				I[5] = I5;
				break;
			case 7:
				I[0] = I0;
				I[1] = I1;
				I[2] = I2;
				I[3] = I3;
				I[4] = I4;
				I[5] = I5;
				I[6] = I6;
				break;
			case 8:
				I[0] = I0;
				I[1] = I1;
				I[2] = I2;
				I[3] = I3;
				I[4] = I4;
				I[5] = I5;
				I[6] = I6;
				I[7] = I7;
				break;
			case 9:
				I[0] = I0;
				I[1] = I1;
				I[2] = I2;
				I[3] = I3;
				I[4] = I4;
				I[5] = I5;
				I[6] = I6;
				I[7] = I7;
				I[8] = I8;
				break;
			default:
				break;
		}
	}
	public void fillTimeLabelArray() {
		TL = new Label[qntHospedes];
		switch(qntHospedes) {
			case 1:
				TL[0] = th1;
				break;
			case 2:
				TL[0] = th1;
				TL[1] = th2;
				break;
			case 3:
				TL[0] = th1;
				TL[1] = th2;
				TL[2] = th3;
				break;
			case 4:
				TL[0] = th1;
				TL[1] = th2;
				TL[2] = th3;
				TL[3] = th4;
				break;
			case 5:
				TL[0] = th1;
				TL[1] = th2;
				TL[2] = th3;
				TL[3] = th4;
				TL[4] = th5;
				break;
			case 6:
				TL[0] = th1;
				TL[1] = th2;
				TL[2] = th3;
				TL[3] = th4;
				TL[4] = th5;
				TL[5] = th6;
				break;
			case 7:
				TL[0] = th1;
				TL[1] = th2;
				TL[2] = th3;
				TL[3] = th4;
				TL[4] = th5;
				TL[5] = th6;
				TL[6] = th7;
				break;
			case 8:
				TL[0] = th1;
				TL[1] = th2;
				TL[2] = th3;
				TL[3] = th4;
				TL[4] = th5;
				TL[5] = th6;
				TL[6] = th7;
				TL[7] = th8;
				break;
			case 9:
				TL[0] = th1;
				TL[1] = th2;
				TL[2] = th3;
				TL[3] = th4;
				TL[4] = th5;
				TL[5] = th6;
				TL[6] = th7;
				TL[7] = th8;
				TL[8] = th9;
				break;
			default:
				break;
		}
	}
	public void fillTable() {
		switch(qntHospedes) {
			case 1:
				h11.setText(String.valueOf(H[0].canalIndv));
				h12.setText(String.valueOf(H[0].tempo_a));
				h13.setText(String.valueOf(H[0].tempo_d));
				break;
			case 2:
				h11.setText(String.valueOf(H[0].canalIndv));
				h12.setText(String.valueOf(H[0].tempo_a));
				h13.setText(String.valueOf(H[0].tempo_d));
				h21.setText(String.valueOf(H[1].canalIndv));
				h22.setText(String.valueOf(H[1].tempo_a));
				h23.setText(String.valueOf(H[1].tempo_d));
				break;
			case 3:
				h11.setText(String.valueOf(H[0].canalIndv));
				h12.setText(String.valueOf(H[0].tempo_a));
				h13.setText(String.valueOf(H[0].tempo_d));
				h21.setText(String.valueOf(H[1].canalIndv));
				h22.setText(String.valueOf(H[1].tempo_a));
				h23.setText(String.valueOf(H[1].tempo_d));
				h31.setText(String.valueOf(H[2].canalIndv));
				h32.setText(String.valueOf(H[2].tempo_a));
				h33.setText(String.valueOf(H[2].tempo_d));
				break;
			case 4:
				h11.setText(String.valueOf(H[0].canalIndv));
				h12.setText(String.valueOf(H[0].tempo_a));
				h13.setText(String.valueOf(H[0].tempo_d));
				h21.setText(String.valueOf(H[1].canalIndv));
				h22.setText(String.valueOf(H[1].tempo_a));
				h23.setText(String.valueOf(H[1].tempo_d));
				h31.setText(String.valueOf(H[2].canalIndv));
				h32.setText(String.valueOf(H[2].tempo_a));
				h33.setText(String.valueOf(H[2].tempo_d));
				h41.setText(String.valueOf(H[3].canalIndv));
				h42.setText(String.valueOf(H[3].tempo_a));
				h43.setText(String.valueOf(H[3].tempo_d));
				break;
			case 5:
				h11.setText(String.valueOf(H[0].canalIndv));
				h12.setText(String.valueOf(H[0].tempo_a));
				h13.setText(String.valueOf(H[0].tempo_d));
				h21.setText(String.valueOf(H[1].canalIndv));
				h22.setText(String.valueOf(H[1].tempo_a));
				h23.setText(String.valueOf(H[1].tempo_d));
				h31.setText(String.valueOf(H[2].canalIndv));
				h32.setText(String.valueOf(H[2].tempo_a));
				h33.setText(String.valueOf(H[2].tempo_d));
				h41.setText(String.valueOf(H[3].canalIndv));
				h42.setText(String.valueOf(H[3].tempo_a));
				h43.setText(String.valueOf(H[3].tempo_d));
				h51.setText(String.valueOf(H[4].canalIndv));
				h52.setText(String.valueOf(H[4].tempo_a));
				h53.setText(String.valueOf(H[4].tempo_d));
				break;
			case 6:
				h11.setText(String.valueOf(H[0].canalIndv));
				h12.setText(String.valueOf(H[0].tempo_a));
				h13.setText(String.valueOf(H[0].tempo_d));
				h21.setText(String.valueOf(H[1].canalIndv));
				h22.setText(String.valueOf(H[1].tempo_a));
				h23.setText(String.valueOf(H[1].tempo_d));
				h31.setText(String.valueOf(H[2].canalIndv));
				h32.setText(String.valueOf(H[2].tempo_a));
				h33.setText(String.valueOf(H[2].tempo_d));
				h41.setText(String.valueOf(H[3].canalIndv));
				h42.setText(String.valueOf(H[3].tempo_a));
				h43.setText(String.valueOf(H[3].tempo_d));
				h51.setText(String.valueOf(H[4].canalIndv));
				h52.setText(String.valueOf(H[4].tempo_a));
				h53.setText(String.valueOf(H[4].tempo_d));
				h61.setText(String.valueOf(H[5].canalIndv));
				h62.setText(String.valueOf(H[5].tempo_a));
				h63.setText(String.valueOf(H[5].tempo_d));
				break;
			case 7:
				h11.setText(String.valueOf(H[0].canalIndv));
				h12.setText(String.valueOf(H[0].tempo_a));
				h13.setText(String.valueOf(H[0].tempo_d));
				h21.setText(String.valueOf(H[1].canalIndv));
				h22.setText(String.valueOf(H[1].tempo_a));
				h23.setText(String.valueOf(H[1].tempo_d));
				h31.setText(String.valueOf(H[2].canalIndv));
				h32.setText(String.valueOf(H[2].tempo_a));
				h33.setText(String.valueOf(H[2].tempo_d));
				h41.setText(String.valueOf(H[3].canalIndv));
				h42.setText(String.valueOf(H[3].tempo_a));
				h43.setText(String.valueOf(H[3].tempo_d));
				h51.setText(String.valueOf(H[4].canalIndv));
				h52.setText(String.valueOf(H[4].tempo_a));
				h53.setText(String.valueOf(H[4].tempo_d));
				h61.setText(String.valueOf(H[5].canalIndv));
				h62.setText(String.valueOf(H[5].tempo_a));
				h63.setText(String.valueOf(H[5].tempo_d));
				h71.setText(String.valueOf(H[6].canalIndv));
				h72.setText(String.valueOf(H[6].tempo_a));
				h73.setText(String.valueOf(H[6].tempo_d));
				break;
			case 8:
				h11.setText(String.valueOf(H[0].canalIndv));
				h12.setText(String.valueOf(H[0].tempo_a));
				h13.setText(String.valueOf(H[0].tempo_d));
				h21.setText(String.valueOf(H[1].canalIndv));
				h22.setText(String.valueOf(H[1].tempo_a));
				h23.setText(String.valueOf(H[1].tempo_d));
				h31.setText(String.valueOf(H[2].canalIndv));
				h32.setText(String.valueOf(H[2].tempo_a));
				h33.setText(String.valueOf(H[2].tempo_d));
				h41.setText(String.valueOf(H[3].canalIndv));
				h42.setText(String.valueOf(H[3].tempo_a));
				h43.setText(String.valueOf(H[3].tempo_d));
				h51.setText(String.valueOf(H[4].canalIndv));
				h52.setText(String.valueOf(H[4].tempo_a));
				h53.setText(String.valueOf(H[4].tempo_d));
				h61.setText(String.valueOf(H[5].canalIndv));
				h62.setText(String.valueOf(H[5].tempo_a));
				h63.setText(String.valueOf(H[5].tempo_d));
				h71.setText(String.valueOf(H[6].canalIndv));
				h72.setText(String.valueOf(H[6].tempo_a));
				h73.setText(String.valueOf(H[6].tempo_d));
				h81.setText(String.valueOf(H[7].canalIndv));
				h82.setText(String.valueOf(H[7].tempo_a));
				h83.setText(String.valueOf(H[7].tempo_d));
				break;
			case 9:
				h11.setText(String.valueOf(H[0].canalIndv));
				h12.setText(String.valueOf(H[0].tempo_a));
				h13.setText(String.valueOf(H[0].tempo_d));
				h21.setText(String.valueOf(H[1].canalIndv));
				h22.setText(String.valueOf(H[1].tempo_a));
				h23.setText(String.valueOf(H[1].tempo_d));
				h31.setText(String.valueOf(H[2].canalIndv));
				h32.setText(String.valueOf(H[2].tempo_a));
				h33.setText(String.valueOf(H[2].tempo_d));
				h41.setText(String.valueOf(H[3].canalIndv));
				h42.setText(String.valueOf(H[3].tempo_a));
				h43.setText(String.valueOf(H[3].tempo_d));
				h51.setText(String.valueOf(H[4].canalIndv));
				h52.setText(String.valueOf(H[4].tempo_a));
				h53.setText(String.valueOf(H[4].tempo_d));
				h61.setText(String.valueOf(H[5].canalIndv));
				h62.setText(String.valueOf(H[5].tempo_a));
				h63.setText(String.valueOf(H[5].tempo_d));
				h71.setText(String.valueOf(H[6].canalIndv));
				h72.setText(String.valueOf(H[6].tempo_a));
				h73.setText(String.valueOf(H[6].tempo_d));
				h81.setText(String.valueOf(H[7].canalIndv));
				h82.setText(String.valueOf(H[7].tempo_a));
				h83.setText(String.valueOf(H[7].tempo_d));
				h91.setText(String.valueOf(H[8].canalIndv));
				h92.setText(String.valueOf(H[8].tempo_a));
				h93.setText(String.valueOf(H[8].tempo_d));
				break;
			default:
				break;
		}
		
	}

}
