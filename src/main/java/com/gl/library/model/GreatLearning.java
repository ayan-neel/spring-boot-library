package com.gl.library.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GreatLearning {
	

	private String courseName;
	private String instructor;
	private String courseType;

}
