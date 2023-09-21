package com.in28minutes.springfreamwork.game;


import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{
	public void up(){
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Go into a hole!");
	}
	
	public void left() {
		System.out.println("Go back");
	}
	
	public void right(){
		System.out.println("Accelerate");
	}
}