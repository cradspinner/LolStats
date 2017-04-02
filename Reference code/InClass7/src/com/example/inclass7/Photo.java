package com.example.inclass7;

import java.io.Serializable;

public class Photo implements Serializable{
		
		private String title, url, owner_name;
		private long _id; 

		public long get_id() {
			return _id;
		}

		public void set_id(long _id) {
			this._id = _id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getOwner_name() {
			return owner_name;
		}

		public void setOwner_name(String owner_name) {
			this.owner_name = owner_name;
		}

		@Override
		public String toString() {
			return title;
		}

}
