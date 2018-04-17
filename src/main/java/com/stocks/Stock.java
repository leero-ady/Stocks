package com.stocks;

import java.sql.Date;

public class Stock {
		private int stock_id;
		private Date dt;
		private float opening;
		private float closing;
		private float high,low;
		private int volume;
		private String symbol;
		
		
		public int getStock_id() {
			return stock_id;
		}
		public void setStock_id(int stock_id) {
			this.stock_id = stock_id;
		}
		public Date getDt() {
			return dt;
		}
		public void setDt(Date dt) {
			this.dt = dt;
		}
		public float getOpening() {
			return opening;
		}
		public void setOpening(float opening) {
			this.opening = opening;
		}
		public float getClosing() {
			return closing;
		}
		public void setClosing(float closing) {
			this.closing = closing;
		}
		public float getHigh() {
			return high;
		}
		public void setHigh(float high) {
			this.high = high;
		}
		public float getLow() {
			return low;
		}
		public void setLow(float low) {
			this.low = low;
		}
		public int getVolume() {
			return volume;
		}
		public void setVolume(int volume) {
			this.volume = volume;
		}
		public String getSymbol() {
			return symbol;
		}
		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}
	
		
		
		
		
}
