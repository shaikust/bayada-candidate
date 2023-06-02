package com.bayada.candidate.exception;

public class CandidateNotFoundException extends RuntimeException  {
	  /**
	 *
	 */
	private static final String serialVersionUID = "-7471102383551692901L";

  public CandidateNotFoundException() {
  }

  public CandidateNotFoundException(String id) {
	        super("Candidate with id: "+ id+" not found");
	    }

}
