package com.edubridge.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

//public class ResourceNotfoundexception {
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public class ResourceNotfoundexception extends RuntimeException {

		private static final long serialVersionUID = 1L;
		private String resourceName;
		private String fieldName;
		private Object fieldValue;

		public ResourceNotfoundexception(String resourceName, String fieldName, Object fieldValue) {
			super(String.format("%s not found with %s :'%s'", resourceName, fieldName, fieldValue));
			this.resourceName = resourceName;
			this.fieldName = fieldName;
			this.fieldValue = fieldValue;
		}

		public String getResourceName() {
			return resourceName;
		}

		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}

		public String getFieldName() {
			return fieldName;
		}

		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}

		public Object getFieldValue() {
			return fieldValue;
		}

		public void setFieldValue(Object fieldValue) {
			this.fieldValue = fieldValue;
		}

	}

