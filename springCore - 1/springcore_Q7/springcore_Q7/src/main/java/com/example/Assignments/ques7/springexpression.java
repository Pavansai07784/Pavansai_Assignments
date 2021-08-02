package com.example.Assignments.ques7;


import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class springexpression {

	public static void main(String[] args) {
		SpelExpressionParser parser = new SpelExpressionParser();  
		 
		Expression exp = parser.parseExpression("'This is demo of spring expression....'");  
		String message = (String) exp.getValue();  
		System.out.println(message);  
		  		
		Expression exp3= parser.parseExpression("'dsfsdfvsddfg'.bytes.length");  
		int length = (Integer) exp3.getValue();  
		System.out.println(length);  
		
		System.out.println(parser.parseExpression("'pavan'.toUpperCase()").getValue());  
		System.out.println(parser.parseExpression("'PAVAN'.toLowerCase()").getValue());  
	}

}