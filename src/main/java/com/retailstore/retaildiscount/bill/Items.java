package com.retailstore.retaildiscount.bill;
public class Items {

		private String sku;
		private String skuType;
		private int qty;
		private double sellingPrice;

		
		
		public Items() {
			
		}

		public String getSku() {
			return sku;
		}

		public void setSku(String sku) {
			this.sku = sku;
		}

		public String getSkuType() {
			return skuType;
		}

		public void setSkuType(String skuType) {
			this.skuType = skuType;
		}

		public int getQty() {
			return qty;
		}

		public void setQty(int qty) {
			this.qty = qty;
		}

		public double getSellingPrice() {
			return sellingPrice;
		}

		public void setSellingPrice(double sellingPrice) {
			this.sellingPrice = sellingPrice;
		}

		@Override
		public String toString() {
			return "Items [sku=" + sku + ", skuType=" + skuType + ", qty=" + qty + ", sellingPrice=" + sellingPrice
					+ "]";
		}
		
		

	}
