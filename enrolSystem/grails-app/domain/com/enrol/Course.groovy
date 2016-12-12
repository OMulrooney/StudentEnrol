package com.enrol

class Course {

	String department
	String title
	String leader
	String code
	Date startDate
	Date endDate
	String description
	int numberOfStudents
	Double tuitionFees

    static constraints = {

	department blank:false, nullable:false
	leader blank:false, nullable:false
	code blank:false, nullable:false
	numberOfStudents blank:false, nullable:false, min:20, max:301
	startDate blank:false, nullable:false
	endDate blank:false, nullable:false
	description blank:false, nullable:false, maxSize:5000, widget:'textarea'
	tuitionFees blank:false, nullable:false, scale:2
    }
}
