package com.capgemini.dto;

import java.util.ArrayList;
import java.util.List;

public class MerchantDummy {
	 private List<Merchants> merchants;
	 
	    public MerchantDummy()
	    {
	        merchants = new ArrayList<>();
	    }

		public List<Merchants> getMerchants() {
			return merchants;
		}

		public void setMerchants(List<Merchants> merchants) {
			this.merchants = merchants;
		}

}
