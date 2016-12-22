// Copyright (c) Philipp Wagner. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.

package de.bytefish.jsqlserverbulkinsert.exceptions;

public class BinaryWriteFailedException extends RuntimeException {

    public BinaryWriteFailedException(String message) {
        super(message);
    }

    public BinaryWriteFailedException() {
    }

    public BinaryWriteFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public BinaryWriteFailedException(Throwable cause) {
        super(cause);
    }

    public BinaryWriteFailedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}