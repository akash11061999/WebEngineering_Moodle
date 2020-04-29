package com.moodle.moodledataSQL.exception;

public class AssignmentFileStorageException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public AssignmentFileStorageException(String message) {
        super(message);
    }

    public AssignmentFileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
